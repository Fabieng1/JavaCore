package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main (String[] args) {

        int chessboardSize = 5;
        int currentColumnsize = 0;

        while (currentColumnsize < chessboardSize) {
            int currentLinesize = 0;
            while (currentLinesize < chessboardSize) {
                if (currentColumnsize % 2 == currentLinesize % 2) {
                    System.out.print("#");
                } else {
                    if (currentColumnsize % 2 == 0) {
                        System.out.print(" . ");
                    } else {
                        if (currentLinesize == 0) {
                            System.out.print(". ");
                        } else if (currentLinesize == chessboardSize - 1) {
                            System.out.print(" .");
                        } else {
                            System.out.print(" . ");
                        }
                    }
                }
                currentLinesize++;
            }
            System.out.println();
            currentColumnsize++;
        }

        /*
        int chessboardSize = 5;

        for (int currentColumnsize = 0; currentColumnsize < chessboardSize; currentColumnsize++) {
            for (int currentLinesize = 0; currentLinesize < chessboardSize; currentLinesize++) {

                // Both even
                if (currentColumnsize % 2 == 0 && currentLinesize % 2 == 0) {
                    System.out.print("#");
                }
                // Line odd
                else if (currentColumnsize % 2 == 0 && currentLinesize % 2 != 0) {
                    System.out.print(" . ");
                }
                // Column odd
                else if (currentColumnsize % 2 != 0 && currentLinesize % 2 == 0) {
                    if (currentLinesize == 0) {
                        System.out.print(". ");
                    }
                    else if (currentLinesize == chessboardSize - 1) {
                        System.out.print(" .");
                    }
                    else {
                        System.out.print(" . ");
                    }
                }
                // Both odd
                else if (currentColumnsize % 2 != 0 && currentLinesize % 2 != 0) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }*/
    }
}