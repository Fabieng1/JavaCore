package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {

    public static void main (String[] args) {

        //<=, ==, >=, > || <
        int age = 80;

        if (age <= 25) {
            System.out.println("Vous bénéficiez du forfait jeune");
        }
        //Sans doute sui-je aller trop vite en utilisant le & ?
        else if (age > 25 & age < 65) {
            System.out.println("Vous ne bénéficiez d'aucune réduction");
        }
        else if (age >= 65) {
            System.out.println("Vous bénéficiez du tarif Senior");
        }

    }

}
