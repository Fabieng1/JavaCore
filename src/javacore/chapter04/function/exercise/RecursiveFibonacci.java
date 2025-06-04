package javacore.chapter04.function.exercise;

import java.math.BigInteger;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        final int MAX_FIBONACCI_TERM = 10000;

        int countTerm = 3;
        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;
        BigInteger currentFibonacciTerm = firstTerm.add(secondTerm);

        numberFibonacci(currentFibonacciTerm, countTerm, MAX_FIBONACCI_TERM);


    }

    public static void numberFibonacci(BigInteger currentFibonacciTerm, int countTerm, final int MAX_FIBONACCI_TERM) {
        countTerm = countTerm + 1;

        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;


        // terms of departure. Not included in the counting loop
        System.out.println("Term Fibonacci n°1 = " + firstTerm);
        System.out.println("Term Fibonacci n°2 = " + secondTerm);

        int evenTermCountFound = 0;


        firstTerm = secondTerm;
        secondTerm = currentFibonacciTerm;
        currentFibonacciTerm = firstTerm.add(secondTerm);


        StringBuilder displayNumberFibonacci = new StringBuilder("Terme Fibonacci n°" + " = ");

        displayNumberFibonacci.insert(18, countTerm);
        displayNumberFibonacci.append(currentFibonacciTerm);

        //Counter exceeding a thousand
        System.out.print(displayNumberFibonacci);

        if (currentFibonacciTerm.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            evenTermCountFound++;
            System.out.print(" (Even)");
        }
        System.out.println();

        System.out.println();
        System.out.println("Il y a " + evenTermCountFound + " nombres de Fibonacci paires");

        if (countTerm < 50) {
            countTerm++;
            numberFibonacci(currentFibonacciTerm, countTerm);
        }

    }
}
