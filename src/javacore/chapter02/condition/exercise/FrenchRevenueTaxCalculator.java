package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salary = 28000;
        double abattement = salary - (salary * 10.0 / 100.0);
        System.out.println("Abattement : " + abattement);

        //Montant servant de base de calcul pour savoir combien d'impôts payer
        float differenceTranche2 = 29497 - 11497;
        double differenceTranche3 = 83823 - 29315;
        double differenceTranche4 = 180294 - 83823;
        System.out.println("Montant de base : " + differenceTranche4);


        // Impôts à payer
        double sommePourcentageTranche2 = differenceTranche2 * 11 / 100;
        double sommePourcentageTranche3 = (differenceTranche3 * 30 / 100) + sommePourcentageTranche2;
        double sommePourcentageTranche4 = (differenceTranche4 * 41 / 100) + (sommePourcentageTranche2 + sommePourcentageTranche3);
        double sommePourcentageTranche5 = (differenceTranche4 * 45 / 100) + (sommePourcentageTranche2 + sommePourcentageTranche3 + sommePourcentageTranche4);

        System.out.println(sommePourcentageTranche2);
        System.out.println(sommePourcentageTranche3);
        System.out.println(sommePourcentageTranche4);
        System.out.println(sommePourcentageTranche5);
        System.out.println("Le salaire net impossable après abattement est de : " + abattement + "€");

        //Bonus
        if (salary < 11497) {
            int somme = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc 0€");
        }
        if (salary < 29315) {





        }
        else if (salary < 83823) {


            System.out.println(sommePourcentageTranche2);

            System.out.println("Différence tranche 3 : " + differenceTranche3 + "€");
        }
        if (salary < 180294) {
        }
        if (salary > 180294){
        }
    }

}
