package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static void main (String[] args) {

        int number1 = -30;
        int number2 = 10;

        if (number1 > number2) {
            System.out.println(number1 + " est plus grand numéro");
        }
        else if (number1 < number2) {
            System.out.println("Vous n'avez pas choisi le plus grand numéro");
        }
        else {
            System.out.println("Les deux numéros sont identiques");
        }

    }

}
