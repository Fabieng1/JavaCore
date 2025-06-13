package javacore.chapter04.function.exercise;

public class RecursiveFactorial {

    public static void main (String[] args) {

        int number = 5;
        long result = 1;



        if (number == 0) {
            System.out.println("1");
        }
        else {
            factorialCalculator(number, result);
        }

    }

    public static long factorialCalculator (int number, long result) {

        if (number < 0) {
            System.out.println("Le nombre ne peut pas être négatif");
        }
        else if (number > 0) {
            result *= number;
            number--;

            return factorialCalculator(number, result);
        }
        return result;
    }
}
