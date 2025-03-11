package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main (String[] args) {
        int number = 5;
        int divisor = 2;
        int result = 0;

        while (divisor <= 100) {

            result = number % divisor;

            for (int currentInt = 1; result == 0; currentInt++) {
                result = number;

            }

            /*if (number % divisor == 0) {
                result = number;
            }
            else {
                result = 0;
            }*/


            divisor++;
        }

        if (result == 0) {
            System.out.println(number + " est premier");
        }
        else {
            System.out.println(number + " n'est pas premier");
        }




    }


}


