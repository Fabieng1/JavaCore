package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main(String[] args) {
        int number = 100;
        int divisor = 2;
        int modulo = 0;
        boolean resultDivisor = true;


        while (number % divisor != 0) {



            while (resultDivisor) {
                modulo = number % divisor;
                if (modulo == 0) {
                    resultDivisor = false;
                    number--;
                }
            }

            divisor++;
        }
        System.out.println(" Les nombres premiers sont : " + number + " ");
    }
}
