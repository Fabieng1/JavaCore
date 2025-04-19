package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;
        int sizeColumnCheckboard = 5;
        int sizeLineCheckboard = 5;

        char sharp = '#';
        char point = '.';

        for (int currentColumnIndex = 0; currentColumnIndex < sizeColumnCheckboard; currentColumnIndex++) {
            for (int currentLineIndex = 0; currentLineIndex + currentColumnIndex < sizeLineCheckboard; currentLineIndex++) {
                System.out.print(sharp + " ");
                System.out.print(" " + point + " ");
            }
            System.out.println();
        }

    }

}
