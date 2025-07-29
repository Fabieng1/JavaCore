package javacore.chapter05.object.exercise;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        int numberOfTrils = 1;
        int trial = 0;

        System.out.println(randomNumber);

        do {

            System.out.println("Essayez de devinez le nombre mystère de 0 à 100 en 7 essais");
            System.out.print("Seul les nombres de cette teanches sont autorisés. Essai " + numberOfTrils + "/7 ");
            trial = scanner.nextInt();

            if (trial == randomNumber) {

                System.out.println("Bravo ! Vous avez trouvé !");
            }
            if (trial < 0 || trial > 100) {

                System.out.println("Nombre hors tranche");
            }

            numberOfTrils++;


        }while(trial != randomNumber && numberOfTrils != 8);
    }
}
