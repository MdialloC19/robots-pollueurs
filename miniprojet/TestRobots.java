import src.monde.Monde;
import src.nettoyeurdistrait.NettoyeurDistrait;
import src.pollueursauteur.PollueurSauteur;
import src.pollueurtoutdroit.PollueurToutDroit;
import src.robot.Robot;
import src.robotnettoyeur.RobotNettoyeur;

public class TestRobots {

    public static void main(String[] args) {
        // Création d'un monde 10x10 sans papiers gras
        Monde monde = new Monde(10, 10);

        // Création d'un robot pollueur sauteur dans la colonne 2
        Robot pollueurSauteur = new PollueurSauteur(2, 0, monde);

        // Création d'un robot pollueur sauteur dans la colonne 2
        Robot pollueurToutDroit = new PollueurToutDroit(1, monde);

        // Création d'un robot nettoyeur
        RobotNettoyeur nettoyeur = new RobotNettoyeur(monde);

        // Création d'un robot nettoyeur distrait
        RobotNettoyeur nettoyeurDistrait = new NettoyeurDistrait(monde);

        // Mettre des papiers gras dans quelques cases du monde
        monde.metPapierGras(2, 3);
        monde.metPapierGras(4, 7);
        monde.metPapierGras(6, 1);

        // Affichage du monde initial
        System.out.println("Monde initial :\n" + monde);

        // Parcours du robot pollueur sauteur
        pollueurSauteur.parcourir();

        // Affichage du monde après le parcours du robot pollueur sauteur
        
        System.out.println("\nMonde après le parcours du robot pollueur sauteur :\n" + monde);

        // Parcours du robot pollueur tout droit
        pollueurToutDroit.parcourir();

        // Affichage du monde après le parcours du robot pollueur tout droit
        System.out.println("\nMonde après le parcours du robot pollueur tout droit :\n" + monde);

        // Parcours du robot nettoyeur distrait
        nettoyeurDistrait.parcourir();

        // Affichage du monde après le parcours du robot nettoyeur distrait
        System.out.println("\nMonde après le parcours du robot nettoyeur distrait :\n" + monde);

        // Parcours du robot nettoyeur
        nettoyeur.parcourir();

        // Affichage du monde après le parcours du robot nettoyeur
        System.out.println("\nMonde après le parcours du robot nettoyeur :\n" + monde);
    }
}