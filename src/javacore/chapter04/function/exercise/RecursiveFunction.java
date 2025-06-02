package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main (String[] args) {
        int numberCount = 0;

        recursiveCount(numberCount);
    }

    public static void recursiveCount(int numberCount) {
        numberCount = numberCount + 1;

        if (numberCount < 10001) {
            System.out.println(numberCount);
        }
        else {
            return;
        }

        recursiveCount(numberCount);

    }
}
