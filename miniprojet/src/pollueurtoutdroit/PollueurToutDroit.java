package src.pollueurtoutdroit;

import src.monde.Monde;
import src.robotpollueur.RobotPollueur;

/**
 * Cette classe represente un objet PollueurToutDroit qui est une sous-classe de Robotpollueur.
 * Un PollueurToutDroit se deplace tout droit dans une colonne specifiee du monde et pollue les cases rencontrees.
 */

public class PollueurToutDroit extends RobotPollueur {
    // private int colDepart;

    /**
     * Constructeur qui cree un PollueurToutDroit avec une position initiale (0, colDepart) dans le monde donne.
     *
     * @param colDepart Le numero de la colonne de depart
     * @param m         Le monde dans lequel le PollueurToutDroit evolue
     */

    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
        // this.colDepart = colDepart;
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            this.posX = i;
            polluer();
        }
    }
}
