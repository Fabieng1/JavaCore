package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;

        int countSharp = 0;
        int countPoint = 0;

        for (int currentColumnsize = 1; currentColumnsize < chessboardSize; currentColumnsize++) {
            for (int currentLinesize = 1; currentLinesize < chessboardSize; currentLinesize++) {

                if (currentLinesize % 2 != 0) {
                    System.out.print("#");
                    System.out.print(" . ");
                }
                else if (currentLinesize % 2 == 0) {
                    System.out.print(" . ");
                    System.out.print("#");

                }
            }
            System.out.println();
        }
    }
}

