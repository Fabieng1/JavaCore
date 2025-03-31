package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main (String[] args) {

        final int VALUE_MAX_TAX_BRACKET_5 = 180294;
        final int VALUE_POUR_TAX_BRACKET_5 = 45;

        final int VALUE_MAX_TAX_BRACKET_4 = 83823;
        final int VALUE_POUR_TAX_BRACKET_4 = 41;

        final int VALUE_MAX_TAX_BRACKET_3 = 29315;
        final int VALUE_POUR_TAX_BRACKET_3 = 30;

        final int VALUE_MAX_TAX_BRACKET_2 = 11498;
        final int VALUE_POUR_TAX_BRACKET_2 = 11;

        //10.000 1000.0 1500.0 2000.0 2500.0
        double salaryAnnualNetTaxable = 200000;
        double reduction = salaryAnnualNetTaxable * 10.0 / 100.0;

        double salaryAnnualNetTaxableAfterReduction = salaryAnnualNetTaxable - reduction;

        double accumulationOfInstallmentsToBePaid = 0;

        System.out.println("Salaire Annuel après réduction : " + salaryAnnualNetTaxableAfterReduction);


        double taxBracket1 = 0;
        double taxBracket2 = 0;
        double taxBracket3 = 0;
        double taxBracket4 = 0;
        double taxBracket5 = 0;

        double remainsNetTaxable = salaryAnnualNetTaxableAfterReduction;

        if (remainsNetTaxable > VALUE_MAX_TAX_BRACKET_5) {
            taxBracket5 = (remainsNetTaxable - VALUE_MAX_TAX_BRACKET_5) * VALUE_POUR_TAX_BRACKET_5 / 100;
            remainsNetTaxable = 180293;
        }

        if (remainsNetTaxable > VALUE_MAX_TAX_BRACKET_4) {
            taxBracket4 = (remainsNetTaxable - VALUE_MAX_TAX_BRACKET_4) * VALUE_POUR_TAX_BRACKET_4 / 100.0;
            remainsNetTaxable = 83822;
        }

        if (remainsNetTaxable > VALUE_MAX_TAX_BRACKET_3) {
            taxBracket3 = (remainsNetTaxable - VALUE_MAX_TAX_BRACKET_3) * VALUE_POUR_TAX_BRACKET_3 / 100.0;
            remainsNetTaxable = 29314;
        }

        // De 11 498 € à 29 315 € : 11 %
        if (remainsNetTaxable > VALUE_MAX_TAX_BRACKET_2) {
            taxBracket2 = (remainsNetTaxable - VALUE_MAX_TAX_BRACKET_2) * VALUE_POUR_TAX_BRACKET_2 / 100;
        }

        accumulationOfInstallmentsToBePaid = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4 + taxBracket5;

        double taxPercentage = accumulationOfInstallmentsToBePaid * 100 / (salaryAnnualNetTaxable - reduction);
        System.out.println("Pourcentage : " + taxPercentage);

        System.out.println("Votre impôts s'élève à :  " + accumulationOfInstallmentsToBePaid + "€. Votre pourcentage d'impOsition est de " + taxPercentage + "%");
    }
}