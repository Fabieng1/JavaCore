package javacore.chapter03.loop.exercice;

public class PerfectNumberFinder {

    public static void main (String[] args) {

        int nbEnd = 100;


        for (int potentialNbPerfect = 2; potentialNbPerfect < nbEnd; potentialNbPerfect++) {
            int additionDivisor = 0;
            for (int potentialDivisor = 1; potentialDivisor < potentialNbPerfect; potentialDivisor++) {
                int remainderDivision = potentialNbPerfect % potentialDivisor;

                if (remainderDivision == 0) {

                    additionDivisor = additionDivisor + potentialDivisor;
                }
            }
            if (additionDivisor == potentialNbPerfect) {
                System.out.println(potentialNbPerfect + " est un nombre parfait");
            }
        }
    }
}