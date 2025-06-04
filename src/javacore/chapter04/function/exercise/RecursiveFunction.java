package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main (String[] args) {



        recursiveCount(1, 10000);
    }

    public static void recursiveCount(int numberCount, int maxValue) {

        if (numberCount > maxValue) {
            return;
        }

        System.out.println(numberCount);


        recursiveCount(numberCount + 1, maxValue);
    }
}
