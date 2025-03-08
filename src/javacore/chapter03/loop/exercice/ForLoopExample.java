package javacore.chapter03.loop.exercice;

import java.math.BigInteger;

public class ForLoopExample {

    public static void main (String[] args) {

        // Affichez les nombres de 1 à 10 : Utilisez une boucle for pour afficher les nombres de 1 à 10 dans l'ordre croissant: 1 2 3 4 5 6 7
        // 8 9 10
        for (int incrasingCount = 1; incrasingCount <= 10; incrasingCount++) {

            System.out.println("Les nombres de 1 à 10 sont : " + incrasingCount);
        }

        // Affichez une séquence en ordre décroissant : Utilisez une boucle for pour afficher les nombres de 10 à 1 dans l'ordre décroissant: 10 9 8 7 6 5 4 3 2 1
        for (int decrasingCount = 10; decrasingCount >= 1; decrasingCount--) {

            System.out.println("Les nombres décroissants sont : " + decrasingCount);
        }

        // Affichez les nombres pairs : Utilisez une boucle for pour n'afficher que les nombres pairs entre 1 et 20, dans l'ordre croissant : 2 4 6 8 10 12 14 16 18 20 (et sans utiliser de condition !)
        for (int nbr = 0; nbr <= 20; nbr +=2) {

            System.out.println(nbr + " est pair");

        }

        // Affichez l'alphabet : Utilisez une boucle for pour afficher toutes les lettres de 'A' jusque 'Z'. L'affichage devra être réaliser sur une seule et unique ligne.
        //Exemple d'affichage : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        for (char letter = 'A'; letter <= 90; letter++) {

            System.out.print(letter + " ");
        }

        //System.out.println(); pour que les nombres de commencent sur la même ligne que les noombres de la consignes suivantes
        System.out.println();

        // Calculez une factorielle : Utilisez une boucle for pour calculer et afficher le résultat d'une factorielle.
        //Exemple d'affichage : La factorielle de 4 est 24
        BigInteger nb = new BigInteger("20");
        BigInteger result2 = new BigInteger("1");


        for (BigInteger multiplicateur = new BigInteger("1"); multiplicateur.compareTo(nb) < 1 ; multiplicateur = multiplicateur.add(BigInteger.ONE)) {

            result2 = result2.multiply(multiplicateur);
            System.out.println(result2);

        }


    }

}
