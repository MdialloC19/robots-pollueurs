package src.robotpollueur;

import src.monde.Monde;
import src.robot.Robot;

/**
 * Cette classe représente un objet RobotPollueur abstrait, qui est une sous-classe de Robot.
 * Un RobotPollueur est capable de polluer les cases du monde en y déposant des déchets.
 */
public abstract class RobotPollueur extends Robot {
     
    /**
     * Constructeur qui crée un robot pollueur avec une position donnée dans le monde spécifié.
     *
     * @param posX La coordonnée x de la position du robot.
     * @param posY La coordonnée y de la position du robot.
     * @param m Le monde dans lequel le robot évolue.
     */
    public RobotPollueur(int posX, int posY, Monde m) {
        super(posX, posY, m);
    }
    
    /**
     * Constructeur qui crée un robot pollueur avec une position aléatoire dans le monde spécifié.
     *
     * @param m Le monde dans lequel le robot évolue.
     */
    public RobotPollueur(Monde m) {
        super(m);
    }

    /**
     * Permet au robot pollueur de polluer la case sur laquelle il se trouve en y déposant des déchets.
     * Cette méthode met un papier gras dans la case correspondante du monde.
     */
    public void polluer() {
        m.metPapierGras(this.posX, this.posY);
    }

    /**
     * Méthode abstraite à implémenter par les sous-classes de RobotPollueur.
     * Permet aux robots pollueurs de parcourir le monde en fonction de leur comportement spécifique.
     */
    public abstract void parcourir();
}
