package src.monde;

/**
 * Cette classe represente un objet Monde qui contient des informations sur les cases et les robots.
 */
public class Monde {
    protected int nbL;
    protected int nbC; 
    protected boolean[][] mat; 

    /**
     * Constructeur par defaut qui cree un monde 10x10 sans papiers gras.
     */
    
    public Monde() { 
        this.nbL = 10;
        this.nbC = 10;
        this.mat = new boolean[nbL][nbC]; 
    }
   
    /**
     * Constructeur avec paramètre qui crée une instance de monde avec un nombre donné de lignes et de colonnes sans papiers gras.
     *
     * @param nbL le nombre de lignes de monde
     * @param nbC le nombre de colonnes de monde
     */
    public Monde(int nbL, int nbC) {
        this.nbL = nbL;
        this.nbC = nbC;
        this.mat = new boolean[nbL][nbC];
    }

    /**
     * C'est une méthode hérité de la classe Object, nous l'avons redéfinie
     * Retourne une chaine de caracteres decrivant l'object monde.
     * Le caractère "o"  represente un papier gras et "." représente l'absence de papier.
     *
     * @return La representation en chaine de caracteres du monde
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (mat[i][j]) {
                    sb.append("o");
                } else {
                    sb.append("."); 
                }
            }
            sb.append("\n"); 
        }

        return sb.toString();
    }
    /**
     * Place un papier gras dans la case specifiee par les coordonnees (i, j).
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     */
    public void metPapierGras(int i, int j) {
        if (estValide(i, j)) {
            mat[i][j] = true;
        }
    }

    /**
     * Cette méthode enleve le papier gras de la case specifiee par les coordonnees (i, j).
     * En remplaçant le "o" par '.'.
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     */
    public void prendPapierGras(int i, int j) {
        if (estValide(i, j)) {
            mat[i][j] = false;
        }
    }

    /**
     * Verifie si la case specifiee par les coordonnees (i, j) a un papier gras.
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     * @return true si la case a un papier gras, sinon false
     */

    public boolean estSale(int i, int j) {
        if (estValide(i, j)) {
            return mat[i][j];
        }
        return false;
    }

    /**
     * Renvoie le nombre de papiers gras presents dans le monde.
     *
     * @return Le nombre de papiers gras dans le monde
     */

    public int nbPapiersGras() {
        int compteur = 0;

        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (mat[i][j]) {
                    compteur++;
                }
            }
        }
        return compteur;
    }

     /**
     * Cette méthode vérifie si les coordonnees (i, j) appartiennent a la matrice.
     *
     * @param i La coordonnee i de la case
     * @param j La coordonnee j de la case
     * @return true si les coordonnees sont valides, sinon false
     */
    public boolean estValide(int i, int j) {
        return i >= 0 && i < nbL && j >= 0 && j < nbC;
    }

    /**
     * Cette méthode est un getteur, elle nous permet d'avoir le nombre ligne de monde.
     * @return le nombre ligne de monde.
     */
    public int getNbL() {return this.nbL;}

    /**
     * Cette méthode est un getteur, elle nous permet d'avoir le nombre colonne de monde.
     * @return le nombre colonne de monde.
     */
    public int getNbC() {return this.nbC;}

    /**
     * Cette méthode est un getteur, elle nous permet d'avoir la matrice de monde.
     * @return un tableau à deux dimensions.
     */
    public boolean[][] getMat(){return this.mat;}

}