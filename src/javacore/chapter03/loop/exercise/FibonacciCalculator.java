package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        long counNumbersFibonacci = 0;



        long firstTerm = 0;
        long secondTerm = 1;

        // terms of departure
        System.out.println("Term " + counNumbersFibonacci + " = " + firstTerm);
        System.out.println("Term " + counNumbersFibonacci + " = " + secondTerm);

        int evenNumbersCountFind = 0;

        for (int countTerm = 1; countTerm <= 1000; countTerm++) {

            counNumbersFibonacci++;

            long currentFibonacciTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            System.out.print("Term " + countTerm + " = " + currentFibonacciTerm);


            if (currentFibonacciTerm % 2 == 0) {
                evenNumbersCountFind++;
                System.out.print(" (Even)");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Il y a " + evenNumbersCountFind + " nombres de Fibonacci paires");
    }
}