package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaryAnnualNetTaxable = 3000000;
        double reduction = salaryAnnualNetTaxable * 10.0 / 100.0;

        double salaryAnnualNetTaxableAfterReduction = salaryAnnualNetTaxable - reduction;

        double accumulationOfInstallmentsToBePaid = 0;

        System.out.println("Salaire Annuel après réduction : " + salaryAnnualNetTaxableAfterReduction);


        double taxBracket1 = 0;
        double taxBracket2 = 0;
        double taxBracket3 = 0;
        double taxBracket4 = 0;
        double taxBracket5 = 0;

        double remainsNetTaxable = 0;

        if (salaryAnnualNetTaxableAfterReduction > 180294) {
            taxBracket5 = (salaryAnnualNetTaxableAfterReduction - 180294) * 45 / 100;
            salaryAnnualNetTaxableAfterReduction = 180293;
        }

        if (salaryAnnualNetTaxableAfterReduction > 83823) {
            taxBracket4 = (salaryAnnualNetTaxableAfterReduction - 83823) * 41 / 100.0;
            salaryAnnualNetTaxableAfterReduction = 83822;
        }

        if (salaryAnnualNetTaxableAfterReduction > 29315) {
            taxBracket3 = (salaryAnnualNetTaxableAfterReduction - 29315) * 30 / 100.0;
            salaryAnnualNetTaxableAfterReduction = 29314;
        }

        // De 11 498 € à 29 315 € : 11 %
        if (salaryAnnualNetTaxableAfterReduction > 11498) {
            taxBracket2 = (salaryAnnualNetTaxableAfterReduction - 11498) * 11 / 100;
        }

        accumulationOfInstallmentsToBePaid = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4 + taxBracket5 ;

        System.out.println("Votre impôts s'élève à :  " + accumulationOfInstallmentsToBePaid);
    }
}