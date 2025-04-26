package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main (String[] args) {

        int numbersOfRows = 5;

        for (int currentColumn = 1; currentColumn < numbersOfRows; currentColumn++) {
            int totalSpace = numbersOfRows - currentColumn;
            for (int currentSpace = 1; currentSpace != totalSpace; currentSpace++) {

                System.out.print(" ");

                for (int currentLine = 0; currentLine < currentColumn; currentLine++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
