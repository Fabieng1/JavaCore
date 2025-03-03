package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salary = 180000;
        double abattement = salary - (salary * 10.0 / 100.0);

        /* Les "if" n'étant plus imbriquée, ceux après celui concerné s'affiche*/

        if (salary < 11497) {
            int tranche1 = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + tranche1 + "€");
        }
        else {
            if (salary < 29315) {
                double tranche2 = (salary - 11497);
                double impotsAPayer2 = 11 * tranche2 / 100;
                System.out.println("Montant impossable : " + impotsAPayer2);


                System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer2);
            }
            if (salary < 83823) {
                double tranche3 = (abattement - 29315) + (abattement - 83825);
                double impotsAPayer3 = 30 * tranche3 / 100;
                System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer3);

                double pourcentageDImposition3 = impotsAPayer3 * 100 / salary;
                System.out.println("Votre pourcentage d'imposition est de " + pourcentageDImposition3);
            }
            if (salary < 180294) {
                double tranche4 = (abattement - 29315) + (abattement - 83825) + (abattement - 180294);
                System.out.println("Tranche 4 : " + tranche4);
                double impotsAPayer4 = 30 * tranche4 / 100;
                System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer4);

                double pourcentageDImposition4 = impotsAPayer4 * 100 / salary;
                System.out.println("Votre pourcentage d'imposition est de " + pourcentageDImposition4 + "%");
                System.out.println(impotsAPayer4);
            }
            if (salary > 180294) {
                double test = 10000 * 100 / 50000;
                System.out.println(test);
            }
        }
    }
}
