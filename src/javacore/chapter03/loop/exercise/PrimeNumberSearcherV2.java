package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV2 {

    public static void main(String[] args) {

        int number = 15000;
        int nbPrimeNumber = 0;
        int positionPrimeNumber = 1;

        boolean isPrime = true;

        int countIteration = 0;

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < number; potentialPrimeNumber++) {
            isPrime = true;
            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

                countIteration++;

                int reste = potentialPrimeNumber % potentialDivisor;

                if (reste == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(potentialPrimeNumber + " est le nombre premier n°" + positionPrimeNumber);
                positionPrimeNumber++;
                nbPrimeNumber++;
            }
        }
        System.out.println(countIteration + " itérations");
    }
}
