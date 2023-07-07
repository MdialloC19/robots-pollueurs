package src.robot;

import src.monde.*;

/**
 * La classe abstraite Robot représente un robot dans le monde.
 * UUn Robot a une position (posx, posy), ainsi qu'une référence vers le monde dans lequel il se trouve.
 */
public abstract class Robot {
    protected int posX; 
    protected int posY;
    protected Monde m;

     /**
     * Constructeur avec paramètres d'un robot avec une position spécifiée.
     *
     * @param posX La coordonnée x de la position du robot.
     * @param posY La coordonnée y de la position du robot.
     * @param m    La référence du monde dans lequel le robot évolue.
     */
    public Robot(int posX, int posY, Monde m) {
        this.posX = posX;
        this.posY = posY;
        this.m = m;
    }

    /**
     * Constructeur d'un robot avec une position aléatoire.
     *
     * @param m La référence vers le monde.
     */
    public Robot(Monde m) {
        this((int) (Math.random() * m.getNbL()), (int) (Math.random() * m.getNbC()), m);
    }

    /**
     * Déplace le robot vers les coordonnées spécifiées (i, j) dans le monde.
     * Vérifie d'abord si les coordonnées sont valides dans le monde avant de déplacer le robot.
     *
     * @param i La position en i vers laquelle le robot se déplace.
     * @param j La position en j vers laquelle le robot se déplace.
     */
    public void vaEn(int i, int j) {
        if (m.estValide(i, j)) {
            posX = i;
            posY = j;
        }
    }

    /**
     * Méthode abstraite à implémenter par les sous-classes.
     * Cette méthode permet aux robots de parcourir selon le comportement spécifique du robot.
     */
    public abstract void parcourir();
}
