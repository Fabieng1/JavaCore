package javacore.chapter04.function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        int endNumber = 10000;

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < endNumber; potentialPrimeNumber++) {

            if (isPrimeNumber(potentialPrimeNumber)) {
                System.out.println(potentialPrimeNumber);
            }
        }
    }

    public static boolean isPrimeNumber(int number) {

        for (int potentialDivisor = 2; potentialDivisor < number; potentialDivisor++) {
            int stay = number % potentialDivisor;

            if (stay == 0) {

                return false;
            }
        }
        return true;
    }
}