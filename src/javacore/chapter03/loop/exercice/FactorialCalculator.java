package javacore.chapter03.loop.exercice;

public class FactorialCalculator {

    public static void main (String[] args) {

        int number = 5;
        long multiplicateur = 1;
        long result = 1;

        while (multiplicateur != number) {

            result = number * multiplicateur;
            multiplicateur--;



        }

    }

}
