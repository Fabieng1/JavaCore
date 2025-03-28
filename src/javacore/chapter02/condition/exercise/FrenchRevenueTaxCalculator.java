package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaryAnnualNetTaxable = 30000;
        double reduction = salaryAnnualNetTaxable * 10.0 / 100.0;

        double salaryAnnualNetTaxableAfterReduction = salaryAnnualNetTaxable - reduction;

        double accumulationOfInstallmentsToBePaid = 0;

        System.out.println("Salaire Annuel après réduction : " + salaryAnnualNetTaxableAfterReduction);


        double taxBracket1 = 0;
        double taxBracket2 = 0;
        double taxBracket3 = 0;
        double taxBracket4 = 0;
        double taxBracket5 = 0;

        if (salaryAnnualNetTaxableAfterReduction < 11497) {
             accumulationOfInstallmentsToBePaid = 0;
            System.out.println("Vous touchez moins de 11497€ par an. Vous payer donc : " + accumulationOfInstallmentsToBePaid + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction < 29315.0) {
            // Résultats : 28435.33
            taxBracket2 = (salaryAnnualNetTaxableAfterReduction - 11497.0) * 11.0 / 100.0;
            accumulationOfInstallmentsToBePaid = accumulationOfInstallmentsToBePaid + taxBracket2;


            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction < 83823) {
            // Résultat : 72205.50
            taxBracket3 = (salaryAnnualNetTaxableAfterReduction - 29315.0) * 30.0 / 100.0;
            accumulationOfInstallmentsToBePaid = accumulationOfInstallmentsToBePaid + taxBracket3;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction <= 180294) {
            // Résultats : 36779.46
            taxBracket4 = (salaryAnnualNetTaxableAfterReduction - 83823.0) * 41.0 / 100.0;
            accumulationOfInstallmentsToBePaid = accumulationOfInstallmentsToBePaid + taxBracket4;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid + "€");
        }
        if (salaryAnnualNetTaxableAfterReduction > 180294) {
            // Résultats avec 270000 après abattement de 10% fait à la calculatrice de mon portable : 40367.70
            taxBracket5 = (salaryAnnualNetTaxableAfterReduction - 180294) * 45 / 100;
            accumulationOfInstallmentsToBePaid = accumulationOfInstallmentsToBePaid + taxBracket5;

            System.out.println("Le montant de vos impôts est de " + accumulationOfInstallmentsToBePaid + "€");
        }
    }
}