package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main (String[] args) {

        for (int tableMultiplication = 1;  tableMultiplication <= 9; tableMultiplication++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                int resultMltiplication = multiplier * tableMultiplication;

                System.out.println(tableMultiplication + " X " + multiplier + " = " + resultMltiplication);
            }
            System.out.println();
        }
    }
}