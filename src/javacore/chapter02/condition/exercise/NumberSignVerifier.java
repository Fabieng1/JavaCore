package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main (String[] args) {

        int number = 0;

        //Exercice bonus n°1 : changer la nature de la variable
        double number2 = 0.0;

        /*if (number > 0.0) {
            System.out.println("Le chiffre est positif !");
        }
        else if (number < 0.0) {
            System.out.println("Le chiffre est négatif");
        }
        else {
            System.out.println("Le chiffre est égale à 0");
        }*/

        //Exercice bonus n°2
        if (number > 0) {
            System.out.println("Le chiffre est positif");
        }

        else if (number < 0) {
            System.out.println("Le chiffre est négatif");
        }

        else {
            System.out.println("Le chiffre est neutre");
        }



    }

}
