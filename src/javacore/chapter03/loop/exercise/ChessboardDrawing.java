package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;

        for (int currentColumnsize = 0; currentColumnsize < chessboardSize; currentColumnsize++) {
            for (int currentLinesize = 0; currentLinesize < chessboardSize; currentLinesize++) {

                // Colomun event and line enven
                if (currentColumnsize % 2 == 0 && currentLinesize % 2 == 0) {
                    System.out.print("#");
                }
                // Column even and line odd
                else if (currentColumnsize % 2 == 0 && currentLinesize % 2 != 0) {
                    System.out.print(" . ");
                }
                // Column odd and line even
                else if (currentColumnsize % 2 != 0 && currentLinesize % 2 == 0) {
                    if (currentLinesize == 0) {
                        System.out.print(". ");
                    }
                    else if (currentLinesize == 4) {
                        System.out.print(" .");
                    }
                    else {
                        System.out.print(" . ");
                    }
                }
                // Column odd and line odd
                else if (currentColumnsize % 2 != 0 && currentLinesize % 2 != 0) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}