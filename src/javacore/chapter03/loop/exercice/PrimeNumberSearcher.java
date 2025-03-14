package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main(String[] args) {

        int number = 100;

        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {

            for (int potentialDivisor = 2; i < number; potentialDivisor++) {

                int reste = number % potentialDivisor;

                if (reste == 0) {
                    isPrime = false;

                }

            }

            if (isPrime == true) {
                System.out.println(number + " est premier");
            }
            else {
                System.out.println(number + " n'est pas un nombre premier");
            }
        }


    }
}
