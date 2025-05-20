package javacore.chapter04.function.exercise;

public class SubstractionFunction {

    public static void main (String[] args) {

        substraction(100, 20, 10, 10, 10);
    }

    public static int substraction (int number1, int number2) {

        int result = number1 - number2;
        System.out.println(result);

        return result;
    }

    public static int substraction (int number1, int number2, int number3) {
        return substraction(substraction(number1, number2), number3);
    }

    public static int substraction (int number1, int number2, int number3, int number4) {
        return substraction(substraction(number1, number2, number3), number4);
    }

    public static int substraction (int number1, int number2, int number3, int number4, int number5) {
        return substraction(substraction(number1, number2, number3, number4), number5);
    }

}