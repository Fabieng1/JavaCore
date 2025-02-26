package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salary = 3000.0;
        double abattement = salary - (salary * 10.0 / 100.0);
        double impots = 0.0;
        double pourcentage = impots * 100 / abattement;

        System.out.println("Le salaire net impossable après abattement est de : " + abattement + "€");

        //Bonus
        if (salary >= 0 & salary < 11497) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage + "%");
        }
        else if (salary >= 11498 & salary < 29315) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary >= 29316 & salary< 83823) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary >= 83824 & salary < 180294) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary > 180294) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        //J'ai mis les tranches touvé sur le site u ministère, plutôt que celles de l'exercice
        if (salary >= 0 & salary < 11497) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage + "%");
        }
        else if (salary >= 11498 & salary < 29315) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary >= 29316 & salary< 83823) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary >= 83824 & salary < 180294) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
        else if (salary > 180294) {
            System.out.println("Votre pourcentage d'imposition est de : " + pourcentage);
        }
    }

}
