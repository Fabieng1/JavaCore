package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main (String[] args) {

        int numbersOfRows = 5;


       for (int currentColumn = 1; currentColumn <= numbersOfRows; currentColumn++) {

           int totalSpace = numbersOfRows - currentColumn;

           for (int currentNumberSpace = 0; currentNumberSpace <= totalSpace; currentNumberSpace++) {
               System.out.print(" ");
           }

           int totalAsterix = 2 * currentColumn - 1;

           for (int currentNumberAsterix = 1; currentNumberAsterix <= totalAsterix; currentNumberAsterix++) {
               System.out.print("*");
           }
           System.out.println();
       }

    }

}
