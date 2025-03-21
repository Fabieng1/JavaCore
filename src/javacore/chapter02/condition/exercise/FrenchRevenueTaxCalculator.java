package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaryAnnualNetTaxable = 300000;
        double reduction = salaryAnnualNetTaxable * 10.0 / 100.0;

        double salaryAnnualNetTaxableAfterReduction = salaryAnnualNetTaxable - reduction;
        System.out.println("salaireNetImpossableAnnuelle : " + salaryAnnualNetTaxable);

        double taxBracket1 = 0;
        double taxBracket2 = 0;
        double taxBracket3 = 0;
        double taxBracket4 = 0;
        double taxBracket5 = 0;

        if (salaryAnnualNetTaxableAfterReduction < 11497) {
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + taxBracket1 + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction < 29315.0) {

            taxBracket2 = (29315.0 - 11497.0) * 11.0 / 100.0;
            taxBracket2 = taxBracket1 + taxBracket2;

            System.out.println("Le montant de vos impôts est de " + taxBracket2);
        }
        if (salaryAnnualNetTaxableAfterReduction < 83823) {
            taxBracket3 = (83823.0 - 29315.0) * 30.0 / 100.0;
            taxBracket3 = taxBracket1 + taxBracket2 + taxBracket3;

            System.out.println("Le montant de vos impôts est de " + taxBracket3);
        }
        if (salaryAnnualNetTaxableAfterReduction <= 180294) {
            taxBracket4 = (180294.0 - 83823.0) * 41.0 / 100.0;
            taxBracket4 = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4;

            System.out.println("Le montant de vos impôts est de " + taxBracket4);
        }
        if (salaryAnnualNetTaxableAfterReduction > 180294) {
            taxBracket5 = (salaryAnnualNetTaxableAfterReduction - 180294) * 45 / 100;
            taxBracket5 = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4 + taxBracket5;

            System.out.println("Le montant de vos impôts est de " + taxBracket5);
        }
    }
}
