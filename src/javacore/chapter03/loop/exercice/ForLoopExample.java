package javacore.chapter03.loop.exercice;

public class ForLoopExample {

    public static void main (String[] args) {

        for (int chiffresCroissants = 1; chiffresCroissants <= 10; chiffresCroissants++) {

            System.out.println("Les nombres de 1 à 10 sont : " + chiffresCroissants);
        }

        for (int chiffresDecroissants = 10; chiffresDecroissants >= 1; chiffresDecroissants--) {

            System.out.println("Les nombres décroissants sont : " + chiffresDecroissants);
        }

        for (char letter = 'A'; letter <= 90; letter++) {

        System.out.println(letter);
    }

    int nbr = 100;
    long result = 1;

        for (int multiplicateur = 1; multiplicateur <= nbr; multiplicateur++) {

            result *= multiplicateur;
            System.out.println(result);

        }

        ;

    }

}
