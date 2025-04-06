package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main(String[] args) {

        int number = 100;

        boolean isPrime = true;

        for (int i = 4; i < number; i++) { // Je veux aller de 2 à 9
            isPrime = true;
            for (int potentialDivisor = 4; potentialDivisor < i; potentialDivisor++) {

                /* int resultDivision = i / potentialDivisor;
                System.out.println("Résultats de la division " + i + " / " + potentialDivisor + " = " + resultDivision);*/
                int reste = i % potentialDivisor;
             /* System.out.println("Reste de la division " + reste);
                System.out.println();*/

                if (reste == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == true) {

                System.out.println (i + " est premier");
            }
        }
    }
}