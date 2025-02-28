package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salary = 28000;
        double abattement = salary - (salary * 10.0 / 100.0);
        double impots = 8594.0;
        double pourcentage = impots * 100 / abattement;

        System.out.println("Le salaire net impossable après abattement est de : " + abattement + "€");

        /*Bonus.

        Modification de prédicat pour les rendre plus simple et moins coûteux en tests

        Tu me disais que le fait que le texte de chaque bloc soient identique était un problème. Le changement
        de pourcentage ne permettait en effet pas de savoir dans quel bloc nous étions

        J'ai inclus dans le texte en dessous à afficher dans quelle tranche nous étions, afin de pouvoir faire la différence*/
        if (salary < 11497) {
            System.out.println("Vous touchez moins de 11497€ par an. Votre pourcentage de d'impossission est de " + pourcentage + "%");
        }
        else if (salary < 29315) {
            System.out.println("Vous touchez moins de 20315€ par an. Votre pourcentage de d'impossission est de " + pourcentage + "%");
        }
        else if (salary< 83823) {
            System.out.println("Vous touchez moins de 83823€ par an. Votre pourcentage de d'impossission est de  " + pourcentage + "%");
        }
        else if (salary < 180294) {
            System.out.println("Vous touchez moins de 180294€ par an. Votre pourcentage de d'impossission est de " + pourcentage + "%");
        }
        else if (salary > 180294){
            System.out.println("Vous touchez plus de 180294€ par an. Votre pourcentage de d'impossission est de  " + pourcentage + "%");
        }
    }

}
