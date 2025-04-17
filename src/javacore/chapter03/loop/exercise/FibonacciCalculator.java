package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        System.out.println("0");
        System.out.println("1");

        long firstTerm = 0;
        long secondTerm = 1;

        long evenNumbers = 0;

        for (int compteurTermes = 1; compteurTermes <= 1000; compteurTermes++) {
            long currentFibonacciTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            System.out.println(currentFibonacciTerm);

            if (currentFibonacciTerm % 2 == 0) {

                evenNumbers++;
            }
        }
        System.out.println("Il y a " + evenNumbers + " nombres de Fibonacci paires");
    }
}
