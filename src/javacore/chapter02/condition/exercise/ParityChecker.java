package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main (String[] args) {

        int number = 3;

        if (number % 2 == 0) {
            System.out.println(number + " est un nombre paire");
        }
        else {
            System.out.println(number + " est un nombre impaire");
        }

        long number2 = 3333777799999l;

        System.out.println("Le modulo de number2 % 2 est : " + number2 % 2);

        if (number2 % 2 == 0) {
            System.out.println(number + " est un nombre paire");
        }
        else {
            System.out.println(number + " est un nombre impaire");
        }





    }

}
