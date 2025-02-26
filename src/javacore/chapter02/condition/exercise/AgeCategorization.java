package javacore.chapter02.condition.exercise;

public class AgeCategorization {

    public static void main (String[] args) {

        //Enfant, adolescent, jeune adulte, adulte, senior
        int age = 9;

        if (age < 10) {
            System.out.println("Vous êtes un enfant");
        }
        else if (age < 18) {
            System.out.println("Vous êtes un adolescent");
        }
        else if (age < 25) {
            System.out.println("Vous êtes un jeune adulte");
        } else if (age < 65) {
            System.out.println("Vous êtes adulte");
        }
        else if (age >= 65) {
            System.out.println("Vous êtes senior");
        }

    }

}
