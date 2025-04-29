package javacore.chapter03.loop.exercise;

import java.math.BigInteger;

public class FibonacciCalculator {

    public static void main (String[] args) {


        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;


        // terms of departure. Not included in the counting loop
        System.out.println("Term Fibonacci n°1 = " + firstTerm);
        System.out.println("Term Fibonacci n°2 = " + secondTerm);

        int evenTermCountFound = 0;

        for (int countTerm = 3; countTerm <= 1000; countTerm++) {


            BigInteger currentFibonacciTerm = firstTerm.add(secondTerm);
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;


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
        }
        System.out.println();
        System.out.println("Il y a " + evenTermCountFound + " nombres de Fibonacci paires");
    }
}