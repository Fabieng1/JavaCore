package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main (String[] args) {

        int numbersOfRows = 5;

        // Je me suis aidé de ChatGPT, mais imposible de faire quoique soit

       for (int currentColumn = 1; currentColumn != numbersOfRows; currentColumn++) {
           for (int currentNumberSpace = 1; currentNumberSpace != currentColumn; currentNumberSpace++) {
               System.out.print(" ");
           }

           for (int currentNumberAsterix = 1; currentNumberAsterix != numbersOfRows; currentNumberAsterix++) {
               System.out.print("*");
           }
           System.out.println();
       }

    }

}
