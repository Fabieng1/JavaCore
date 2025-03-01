package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salary = 29000;
        double abattement = salary - (salary * 10.0 / 100.0);

        //Montant servant de base de calcul pour savoir combien d'impôts payer
        float differenceTranche2 = 29497 - 11497;
        double differenceTranche3 = 83823 - 29315;
        double differenceTranche4 = 180294 - 83823;

        // Impôts à payer
        double sommePourcentageTranche2 = differenceTranche2 * 11 / 100;
        double sommePourcentageTranche3 = (differenceTranche3 * 30 / 100) + sommePourcentageTranche2;
        double sommePourcentageTranche4 = (differenceTranche4 * 41 / 100) + (sommePourcentageTranche2 + sommePourcentageTranche3);
        double sommePourcentageTranche5 = (differenceTranche4 * 45 / 100) + (sommePourcentageTranche2 + sommePourcentageTranche3 + sommePourcentageTranche4);

        //Bonus
        if (salary < 11497) {
            int somme = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc 0€");
        }
        if (salary < 29315) {
            double tranche2 = (29315 - 11497);
            System.out.println(tranche2);
            double impotsAPayer2 = 11 * tranche2 / 100;
            System.out.println("Montant impossable : " + impotsAPayer2);

            System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer2);
        }
        if (salary < 83823) {
            double tranche3 = (29315 - 11497) + (83825 - 29315);
            double impotsAPayer3= 30 * tranche3 /100;
            System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer3);

            double  pourcentageDImposition3 = impotsAPayer3 * 100 / salary;
            System.out.println("Votre pourcentage d'imposition est de " + pourcentageDImposition3);
        }
        if (salary < 180294) {
            double tranche4 = (29315 - 11497) + (83825 - 29315) + (180294);
            double impotsAPayer4 = 30 * tranche4 /100;
            System.out.println("Le montant de vos impôts sur le revenu s'élève à " + impotsAPayer4);

            double  pourcentageDImposition4 = impotsAPayer4 * 100 / salary;
            System.out.println("Votre pourcentage d'imposition est de " + pourcentageDImposition4 + "%");
            System.out.println(impotsAPayer4);


        }
        if (salary > 180294){
        }
    }

}
