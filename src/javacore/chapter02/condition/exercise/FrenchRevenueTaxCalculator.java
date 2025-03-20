package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaireBrutAnuelle = 29000;
        double salaireNetAnnuelImpossable = salaireBrutAnuelle - (salaireBrutAnuelle * 25.0f / 100.0f);
        double abattement = salaireBrutAnuelle - (salaireBrutAnuelle * 10.0 / 100.0);

        double impotsAPayer1 = 0;
        double impotsAPayer2 = 0;
        double impotsAPayer3 = 0;
        double impotsAPayer4 = 0;
        double impotsAPayer5 = 0;

        /* Les "if" n'étant plus imbriquée, ceux après celui concerné s'affiche*/

        if (salaireBrutAnuelle < 11497) {
            impotsAPayer1 = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + impotsAPayer1 + "€");
        }
        else {
            if (salaireBrutAnuelle < 29315.0) {
                impotsAPayer2 = (29315.0 - 11497.0) * 11.0 / 100.0;
                impotsAPayer2 = impotsAPayer1 + impotsAPayer2;

                System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer2);
            }
            if (salaireBrutAnuelle < 83823) {
                impotsAPayer3 = (83823. - 29315.0) * 30.0 / 100.0;
                System.out.println(impotsAPayer3);
            }
            if (salaireBrutAnuelle < 180294) {
                //impotsAPayer4 = ( 180294 - 83823) * 41.0 / 100.0;

            }
            if (salaireBrutAnuelle > 180294) {

            }
        }
    }
}
