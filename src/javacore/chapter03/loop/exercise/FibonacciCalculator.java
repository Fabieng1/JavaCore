package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        StringBuilder displayNumberFibonacci = new StringBuilder("Terme Fibonacci n°" + " = ");

        long firstTerm = 0;
        long secondTerm = 1;

        // terms of departure. Not included in the counting loop
        System.out.println("Term n°1 = " + firstTerm);
        System.out.println("Term n°2 = " + secondTerm);

        int evenNumbersCounttFind = 0;

        for (int countTerm = 3; countTerm <= 1000; countTerm++) {

            long currentFibonacciTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            //Counter exceeding a thousand
            displayNumberFibonacci.insert(19, + countTerm);

            if (currentFibonacciTerm % 2 == 0) {
                evenNumbersCounttFind++;
                System.out.print(" (Even)");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Il y a " + evenNumbersCounttFind + " nombres de Fibonacci paires");
    }
}