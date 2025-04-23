package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main (String[] args) {

        long countNumbersFibonacci = 2;



        long firstTerm = 1;
        long secondTerm = 1;

        // terms of departure. Not included in the counting loop
        System.out.println("Term n°1 = " + firstTerm);
        System.out.println("Term n°2 = " + secondTerm);

        int evenNumbersCounttFind = 0;

        for (int countTerm = 1; countTerm <= 1000; countTerm++) {

            countNumbersFibonacci++;

            long currentFibonacciTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentFibonacciTerm;

            //Counter exceeding a thousand
            System.out.print("Term n°" + countNumbersFibonacci + " = " + currentFibonacciTerm);


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