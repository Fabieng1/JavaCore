package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        System.out.println("0");
        System.out.println("1");

        long termeN1 = 0;
        long termeN2 = 1;

        long numberPair = 0;

        for (long compteurTermes = 1; compteurTermes <= 1000; compteurTermes++) {
            long result = termeN1 + termeN2;
            termeN1 = termeN2;
            termeN2 = result;

            System.out.println(result);

            if (result % 2 == 0) {

                numberPair++;
            }
        }
        System.out.println("Il y a " + numberPair + " nombres de Fibonacci pair");
    }
}
