package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        // terms of departure
        System.out.println("0");
        System.out.println("1");

        long firstTerm = 0;
        long secondTerm = 1;

        int evenNumbersCountFind = 0;

        for (int countTerm = 1; countTerm <= 1000; countTerm++) {
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
            if (currentFibonacciTerm < 0) {
                break;
            }
        }
        System.out.println("Il y a " + evenNumbersCountFind + " nombres de Fibonacci paires");
    }
}
