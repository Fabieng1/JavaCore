package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;

        for (int currentColumnsize = 0; currentColumnsize < chessboardSize; currentColumnsize++) {
            for (int currentLinesize = 0; currentLinesize < chessboardSize; currentLinesize++) {

                if (currentLinesize % 2 == 0 && currentColumnsize % 2 == 0) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" . ");

                }
            }
            System.out.println();
        }
    }
}