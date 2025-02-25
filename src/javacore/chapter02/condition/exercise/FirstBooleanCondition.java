package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {

    public static void main (String[] args) {

        byte age = 15;
        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Vous êtes majeur ! ");
        }
        else {
            System.out.println("Vous êtes mineur !");
        }

    }

}
