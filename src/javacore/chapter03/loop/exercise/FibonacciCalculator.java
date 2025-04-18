package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.println(firstTerm);
        System.out.println(secondTerm);

        long evenNumbersCountFind = 0;

        for (int countTerm = 1; countTerm <= 50; countTerm++) {
            long currentFibonacciTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            if (currentFibonacciTerm % 2 == 0) {

                evenNumbersCountFind++;
                System.out.println(currentFibonacciTerm + " (Even)");
            }
            else {

                System.out.println(currentFibonacciTerm);
            }
        }
        System.out.println("Il y a " + evenNumbersCountFind + " nombres de Fibonacci paires");
    }
}
