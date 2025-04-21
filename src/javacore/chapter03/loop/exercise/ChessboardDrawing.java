package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;

        for (int currentColumnsize = 1; currentColumnsize < chessboardSize; currentColumnsize++) {
            for (int currentLinesize = 1; currentLinesize + currentColumnsize < chessboardSize; currentLinesize++) {
                System.out.print("#" + " " + "." + " ");
            }
            System.out.println();
        }
    }
}

