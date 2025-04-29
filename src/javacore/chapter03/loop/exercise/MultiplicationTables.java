package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main (String[] args) {

        for (int tableMultiplication = 1;  tableMultiplication <= 9; tableMultiplication++) {
            System.out.print("Table de multiplication " + tableMultiplication + " : ");

            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                int resultMultiplication = multiplier * tableMultiplication;

                System.out.print(" " + resultMultiplication);

                //Affichage V1
                //System.out.println(tableMultiplication + " X " + multiplier + " = " + resultMultiplication);
            }
            System.out.println();
        }
    }
}