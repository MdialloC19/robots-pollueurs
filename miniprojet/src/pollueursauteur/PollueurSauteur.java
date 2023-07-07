package src.pollueursauteur;

import src.monde.Monde;
import src.robotpollueur.RobotPollueur;

/**
 * Cette classe représente un objet PollueurSauteur qui est une sous-classe de RobotPollueur.
 * Un PollueurSauteur se déplace dans un monde en sautant d'une colonne à l'autre et pollue les cases rencontrées.
 */
public class PollueurSauteur extends RobotPollueur {
    private int deltax;
    private int colDepart;

    /**
     * Constructeur qui crée un PollueurSauteur avec une position initiale (0, colDepart) dans le monde spécifié.
     *
     * @param deltax    L'écart de colonnes entre les sauts.
     * @param colDepart Le numéro de la colonne de départ.
     * @param m         Le monde dans lequel le PollueurSauteur évolue.
     */
    public PollueurSauteur(int deltax, int colDepart, Monde m) {
        super(0, colDepart, m);
        this.deltax = deltax;
    }

    /**
     * Parcourt le monde en sautant d'une colonne à l'autre et pollue les cases rencontrées.
     * Le PollueurSauteur alterne entre les colonnes de départ et les colonnes décalées de deltax.
     */
    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0 || !m.estValide(i, deltax)) {
                posX = i;
                posY = colDepart;
                polluer();
            } else {
                posX = i;
                posY = colDepart + deltax;
                polluer();
            }
        }
    }
}
