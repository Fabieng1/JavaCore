package javacore.chapter03.loop.exercice;

public class NumberFirst {

    public static void main (String[] args) {

        int result = 1;

        for (int number = 1; number <= 100; number++) {
            for (int diviseur = 1; diviseur <= 100; diviseur++) {
                result = number % diviseur;
                if (result != 0) {
                    System.out.println(number + " n'est pas un nombre premier");
                }
                else {
                    System.out.println(number + " est un nombre premier");
                }
            }
        }
    }

}

