package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main (String[] args) {

        int numberOfRows = 10;

        for (int currentIndex = 1; currentIndex <= numberOfRows; currentIndex++) {
            for (int nbrAsterix = 1; nbrAsterix <= currentIndex; nbrAsterix++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
