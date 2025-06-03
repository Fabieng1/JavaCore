package javacore.chapter04.function.exercise;

import java.math.BigInteger;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        int countTerm = 3;
        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;
        BigInteger currentFibonacciTerm = firstTerm.add(secondTerm);

        numberFibonacci(currentFibonacciTerm, countTerm);

    }

    public static void numberFibonacci(BigInteger currentFibonacciTerm, int countTerm) {
        countTerm = 3;
        if (countTerm < 50) {

            calculatorFibinacci(currentFibonacciTerm, countTerm);

            int evenTermCountFound = 0;

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

            countTerm++;
            numberFibonacci(currentFibonacciTerm, countTerm);
        }
    }

    public static void calculatorFibinacci(BigInteger currentFibonacciTerm, int countTerm) {

        countTerm = 3;

        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;

        // terms of departure. Not included in the counting loop
        System.out.println("Term Fibonacci n°1 = " + firstTerm);
        System.out.println("Term Fibonacci n°2 = " + secondTerm);

        if (countTerm < 50) {
            currentFibonacciTerm = firstTerm.add(secondTerm);
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            countTerm = countTerm + 1;

            calculatorFibinacci(currentFibonacciTerm, countTerm);
        }
    }
}
