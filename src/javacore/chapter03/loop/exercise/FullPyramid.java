package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main (String[] args) {

        int numbersOfRows = 5;

        for (int currentColumn = 1; currentColumn < numbersOfRows; currentColumn++) {
            for (int currentLine = 1; currentLine < currentColumn; currentLine++) {

                int totalSpace = numbersOfRows - currentColumn;

                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
