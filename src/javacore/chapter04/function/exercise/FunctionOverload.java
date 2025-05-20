package javacore.chapter04.function.exercise;

public class FunctionOverload {

    public static void main (String[] args) {

        int result = sum(10, 15);

        sum2(result,20);
    }

    public static int sum(int number1, int number2) {

        int result1 = number1 + number2;

        return result1;
    }

    public static int sum2(int resut, int number3) {

        int result2 = sum(resut, number3);

        System.out.println(result2);

        return result2;
    }
}