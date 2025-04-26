package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main (String[] args) {

        int numbersOfRows = 5;

        for (int currentColumn = 0; currentColumn < numbersOfRows; currentColumn++) {
            for (int currentSpaceLine = 0; currentSpaceLine < currentColumn; currentSpaceLine++) {
                System.out.print(" ");
                for (int currentAsterixLine = 0; currentAsterixLine < currentColumn; currentAsterixLine++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }

}
