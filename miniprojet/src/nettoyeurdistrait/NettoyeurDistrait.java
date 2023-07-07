package src.nettoyeurdistrait;

import src.monde.Monde;
import src.robotnettoyeur.RobotNettoyeur;

/**
 * Cette classe represente un objet NettoyeurDistrait qui est une sous-classe de Robot.
 */
public class NettoyeurDistrait extends RobotNettoyeur {

    /**
     * Constructeur qui cree un NettoyeurDistrait avec une position initiale (0, 0) dans le monde donne.
     *
     * @param m Le monde dans lequel le NettoyeurDistrait evolue
     */
    public NettoyeurDistrait(Monde m) {
        super(m);
    }

    /**
     * Nettoie la case actuelle du NettoyeurDistrait en enlevant le papier gras.
     */
    public void nettoyer() {
        m.prendPapierGras(posX, posY);
     }
 
     /**
      * Parcourt le monde en effectuant un mouvement en boustrophedon et nettoie les cases sales rencontrees.
      * Le NettoyeurDistrait alterne entre nettoyer une case sale et ne rien faire pour chaque case rencontree.
      */
    @Override
    public void parcourir() {
        int compteur = 0;
        for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m.getNbC(); j++) {
                    vaEn(i, j);
                    if (m.estSale(posX, posY)) {
                        if (compteur % 2 == 0) {
                            nettoyer();
                        }
                        compteur++;
                    }
                }
            } else {
                for (int j = m.getNbC() - 1; j >= 0; j--) {
                    vaEn(i, j);
                    if (m.estSale(posX, posY)) {
                        if (compteur % 2 == 0) {
                            nettoyer();
                        }
                        compteur++;
                    }
                }
            }
        }

        System.out.println("Nombre de case nettoyee : " + compteur);
    }
}