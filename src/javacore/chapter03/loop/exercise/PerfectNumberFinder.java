package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main (String[] args) {

        int nbEnd = 90000;

        for (int potentialPerfectNumber = 1; potentialPerfectNumber < nbEnd; potentialPerfectNumber++) {

            int totalSumNumber = 0;

            for (int potentialDivisor = 1; potentialDivisor < potentialPerfectNumber; potentialDivisor++) {

                int remainderDivision = potentialPerfectNumber % potentialDivisor;

                if (remainderDivision == 0) {
                    totalSumNumber = totalSumNumber + potentialDivisor;
                }
            }

            if (totalSumNumber == potentialPerfectNumber) {
                System.out.println(potentialPerfectNumber + " est un nombre parfait");
            }
        }
    }
}