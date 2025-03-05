package javacore.chapter03.loop.exercice;

import java.math.BigInteger;

public class ForLoopExample {

    public static void main (String[] args) {

        for (int chiffresCroissants = 1; chiffresCroissants <= 10; chiffresCroissants++) {

            System.out.println("Les nombres de 1 à 10 sont : " + chiffresCroissants);
        }

        for (int chiffresDecroissants = 10; chiffresDecroissants >= 1; chiffresDecroissants--) {

            System.out.println("Les nombres décroissants sont : " + chiffresDecroissants);
        }


        for (int nbr = 0; nbr <= 20; nbr +=2) {

            System.out.println(nbr + " est pair");

        }
        for (char letter = 'A'; letter <= 90; letter++) {

            System.out.print(letter + " ");
        }
        System.out.println();
        BigInteger nb = new BigInteger("20");
        BigInteger result2 = new BigInteger("1");


        for (BigInteger multiplicateur = new BigInteger("1"); multiplicateur.compareTo(nb) < 1 ; multiplicateur = multiplicateur.add(BigInteger.ONE)) {

            result2 = result2.multiply(multiplicateur);
            System.out.println(result2);

        }


    }

}
