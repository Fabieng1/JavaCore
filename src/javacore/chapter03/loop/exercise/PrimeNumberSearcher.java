package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcher {

    public static void main(String[] args) {

        int number = 10000;
        int nbPrimeNumber = 0;
        int positionPrimeNumber = 1;


        for (int potentialPrimeNumber = 2; potentialPrimeNumber < number; potentialPrimeNumber++) {
            boolean isPrime = true;
            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

                int reste = potentialPrimeNumber % potentialDivisor;

                if (reste == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(potentialPrimeNumber+ " est le nombre premier n°" + positionPrimeNumber);
                positionPrimeNumber++;
                nbPrimeNumber++;
            }
        }
    }
}