package javacore.chapter03.loop.exercice;

public class HalfPyramid {

    public static void main (String[] args) {

        int numberOfRows = 10;

        for (int nbrDeLignes = 1; nbrDeLignes <= numberOfRows; nbrDeLignes++) {
            for (int nbrasterix = 1; nbrasterix <= nbrDeLignes; nbrasterix++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
