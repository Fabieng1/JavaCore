package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main (String[] args) {
        int number = 100;
        int divisor = 2;

        while (divisor <= 100) {


            if (number % divisor != 0 || number % divisor < 1) {
                float result = number % divisor;
                System.out.println(divisor + " n'est pas premier");
            }
            else {
                System.out.println(divisor + " est premier");
            }


            divisor++;
        }

    }


}


