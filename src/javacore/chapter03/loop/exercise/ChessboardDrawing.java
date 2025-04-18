package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;

        for (int sizeColumnCheckboard = 0; sizeColumnCheckboard < chessboardSize; sizeColumnCheckboard++) {
            for (int sizeLineCheckboard = 0; sizeLineCheckboard < chessboardSize; sizeLineCheckboard++) {

                System.out.print("# ");
                System.out.print(".");


            }
            System.out.println();
        }

    }

}
