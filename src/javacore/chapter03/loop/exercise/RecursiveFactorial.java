package javacore.chapter03.loop.exercise;

public class RecursiveFactorial {

    public static void main (String[] args) {

        int number = 5;
        long result = 1;

        if (number == 0) {
            System.out.println("1");
        }
        else {
            result = factorialCalculator(number, result);
            System.out.println(result);
        }
    }

    public static long factorialCalculator (int number, long result) {

        if (number < 0) {
            System.out.println("Le nombre ne peut pas être négatif");
        }
        /*if (number == 0) {
            System.out.println("1P");
        }*/

        if (number > 0) {
            result *= number;
            number--;

            return factorialCalculator(number, result);
        }
        return result;
    }
}
