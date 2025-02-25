package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main (String[] args) {

        double number = 0.0;

        if (number > 0.0) {
            System.out.println("Le chiffre est positif !");
        }
        else if (number < 0.0) {
            System.out.println("Le chiffre est négatif");
        }
        else {
            System.out.println("Le chiffre est égale à 0");
        }


    }

}
