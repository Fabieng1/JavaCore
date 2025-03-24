package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaryAnnualNetTaxable = 300000;
        double reduction = salaryAnnualNetTaxable * 10.0 / 100.0;

        double salaryAnnualNetTaxableAfterReduction = salaryAnnualNetTaxable - reduction;
        System.out.println("salaireNetImpossableAnnuelle : " + salaryAnnualNetTaxable);
        System.out.println("Salaire net impossable arpès abattement : " + salaryAnnualNetTaxableAfterReduction);

        double taxBracket1 = 0;
        double taxBracket2 = (29315.0 - 11497.0) * 11.0 / 100.0; // Résultat : 19959.98
        double taxBracket3 = (83823.0 - 29315.0) * 30.0 / 100.0; // Résultats : 16334.40;
        double taxBracket4 = (180294.0 - 83823.0) * 41.0 / 100.0; // Résultats : 39553.11
        double taxBracket5 = (salaryAnnualNetTaxableAfterReduction - 180294) * 45 / 100;

        if (salaryAnnualNetTaxableAfterReduction < 11497) {
            double accumulationOfInstallmentsToBePaid1 = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + accumulationOfInstallmentsToBePaid1 + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction < 29315.0) {
            double accumulationOfInstallmentsToBePaid2 = taxBracket1 + taxBracket2;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid2 + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction < 83823) {
            double accumulationOfInstallmentsToBePaid3 = taxBracket1 + taxBracket2 + taxBracket3;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid3 + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction <= 180294) {
            double accumulationOfInstallmentsToBePaid4 = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid4 + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction > 180294) {
            double accumulationOfInstallmentsToBePaid5 = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4 + taxBracket5;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid5 + "€");
        }
    }
}
