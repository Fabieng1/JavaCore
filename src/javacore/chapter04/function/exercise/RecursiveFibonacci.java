package javacore.chapter04.function.exercise;

import java.math.BigInteger;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        final int MAX_FIBONACCI_TERM = 50;

        int countTerm = 3;
        int evenTermCountFound = 0;

        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;
        BigInteger currentFibonacciTerm = firstTerm.add(secondTerm);

        // terms of departure. Not included in the counting loop
        System.out.println("Term Fibonacci n°1 = " + firstTerm);
        System.out.println("Term Fibonacci n°2 = " + secondTerm);


        evenTermCountFound = numberFibonacci(firstTerm, secondTerm, currentFibonacciTerm, countTerm, evenTermCountFound + 1, MAX_FIBONACCI_TERM);
        System.out.println("Il y a " + evenTermCountFound + " nombres pairs");

    }

    public static int numberFibonacci(BigInteger firstTerm, BigInteger secondTerm, BigInteger currentFibonacciTerm, int countTerm, int evenTermCountFound, final int MAX_FIBONACCI_TERM) {



        StringBuilder displayNumberFibonacci = new StringBuilder("Terme Fibonacci n°" + " = ");

        displayNumberFibonacci.insert(18, countTerm);
        displayNumberFibonacci.append(currentFibonacciTerm);

        //Counter exceeding a thousand
        System.out.print(displayNumberFibonacci);

        if (currentFibonacciTerm.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            evenTermCountFound++;
            System.out.print(" (Even)");
        }

        firstTerm = secondTerm;
        secondTerm = currentFibonacciTerm;
        currentFibonacciTerm = firstTerm.add(secondTerm);


        System.out.println();

        if (countTerm < MAX_FIBONACCI_TERM) {
            countTerm++;
            return numberFibonacci(firstTerm, secondTerm, currentFibonacciTerm, countTerm, evenTermCountFound, MAX_FIBONACCI_TERM);
        }
        return evenTermCountFound;
    }
}
