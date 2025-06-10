package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main (String[] args) {

        int number = 10;
        long result = 1;

        while (number > 0) {

            result = result * number;
            number--;
        }

        System.out.println(result);

    }
}
