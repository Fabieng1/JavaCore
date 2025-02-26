package javacore.chapter02.condition.practice;

public class PracticeVariableScope {

    public static void main (String[] args) {

        int age = 19;

        if (age < 18) {
            System.out.println("Vous êtes mineur (" + age + "ans)");

            int discountPourcentage = 20;

            System.out.println("Vous avez droit à " + discountPourcentage + "% de réduction");
            if (true) {
                discountPourcentage = 30;
            }
            if (true) {
                discountPourcentage = 40;
            }
        }

    }

}
