package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaireNetImpossableAnnuelle = 83000;
        double abattement = salaireNetImpossableAnnuelle - (salaireNetImpossableAnnuelle * 10.0 / 100.0);

        double impotsAPayer1 = 0;
        double impotsAPayer2 = 0;
        double impotsAPayer3 = 0;
        double impotsAPayer4 = 0;
        double impotsAPayer5 = 0;

    // Remplacement des if successifs par des else if, sinon tous les if après la trancche concernée sont exécutés

        if (salaireNetImpossableAnnuelle < 11497) {
            impotsAPayer1 = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + impotsAPayer1 + "€");
        }
        else if (salaireNetImpossableAnnuelle < 29315.0) {

            impotsAPayer2 = (29315.0 - 11497.0) * 11.0 / 100.0;
            impotsAPayer2 = impotsAPayer1 + impotsAPayer2;

            System.out.println("Le montant de vos impôts est de " + impotsAPayer2);
        }
        else if (salaireNetImpossableAnnuelle < 83823) {
            impotsAPayer3 = (83823. - 29315.0) * 30.0 / 100.0;
            impotsAPayer3 = impotsAPayer1 + impotsAPayer2 + impotsAPayer3;

            System.out.println("Le montant de vos impôts est de " + impotsAPayer3);
        }
        else if (salaireNetImpossableAnnuelle < 180294) {
            impotsAPayer4 = (180294 - 83823) * 41.0 / 100.0;
            impotsAPayer4 = impotsAPayer1 + impotsAPayer2 + impotsAPayer3 + impotsAPayer4;

            System.out.println("Le montant de vos impôts est de " + impotsAPayer4);
        }
        else if (salaireNetImpossableAnnuelle > 180294) {
            impotsAPayer5 = (salaireNetImpossableAnnuelle - 180294) * 45 / 100;
            impotsAPayer5 = impotsAPayer1 + impotsAPayer2 + impotsAPayer3 + impotsAPayer4 + impotsAPayer5;

            System.out.println("Le montant de vos impôts est de " + impotsAPayer5);
        }
    }
}
