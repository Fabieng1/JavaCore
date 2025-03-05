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

        for (char letter = 'A'; letter <= 90; letter++) {

            System.out.println(letter);
        }

        BigInteger nb = new BigInteger("100");
        BigInteger result = new BigInteger("1");


        for (BigInteger multiplicateur = new BigInteger("1"); multiplicateur.compareTo(nb) >= 100; multiplicateur.add(BigInteger.ONE)) {

            result.multiply(multiplicateur);
            System.out.println(result);

        }

        ;

    }

}
