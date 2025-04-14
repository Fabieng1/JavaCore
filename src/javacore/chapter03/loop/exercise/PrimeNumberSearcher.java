package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcher {

    public static void main(String[] args) {

        int number = 249;
        int nbPrimeNumber = 0;

        boolean isPrime = true;

        for (int potentialPrimeNumber = 4; potentialPrimeNumber < number; potentialPrimeNumber++) {
            isPrime = true;
            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

                /* int resultDivision = i / potentialDivisor;
                System.out.println("Résultats de la division " + i + " / " + potentialDivisor + " = " + resultDivision);*/
                int reste = potentialPrimeNumber % potentialDivisor;
             /* System.out.println("Reste de la division " + reste);
                System.out.println();*/

                if (reste == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == true) {
                    System.out.println(potentialPrimeNumber + " est premier");
                    nbPrimeNumber++;
            }

        }
        System.out.println("Il y a " + nbPrimeNumber + " nombre premier");
        System.out.println("Pour le savoir il aura fallu analyser " + (number - 1) + " nombres");
    }
}