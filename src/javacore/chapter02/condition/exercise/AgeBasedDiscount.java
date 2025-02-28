package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main (String[] args) {

        // Les opérateurs à tester : <=, ==, >=, > || <
        int age = 80;

        if (age <= 25) {
            System.out.println("Vous bénéficiez du forfait jeune");
        }
        else if (age < 65) {
            System.out.println("Vous ne bénéficiez d'aucune réduction");
        }
        else {
            System.out.println("Vous bénéficiez du tarif Senior");
        }

    }

}
