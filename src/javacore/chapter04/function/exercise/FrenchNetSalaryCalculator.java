package javacore.chapter04.function.exercise;

public class FrenchNetSalaryCalculator {

    public static void main (String[] args) {

        double smicFrenchHours = 11.07;
        double smicFrenchMedianHours = 17.50;
        double smicFrenchMiddleHours = 22.50;
        double frenchWealthThresholdHours = 35.0;

        double numberWorkingHoursAnnual = 1607;

        double socialChargePercentage = 25.0;
        double taxAllowancePercentage = 10.0;

        double calculateAnnualGrossSalary = 0;

        calculateAnnualGrossSalary = calculateAnnualGrossSalary(frenchWealthThresholdHours, numberWorkingHoursAnnual);
        System.out.println("En France, le salaire annuel brut est de : " + calculateAnnualGrossSalary + "€");

        double salaryAnnualNetTaxableIncome = calculateAnnualGrossSalary - (applySocialCharges(calculateAnnualGrossSalary, socialChargePercentage));
        System.out.println("En France, le salaire annuel net impossable est de : " + salaryAnnualNetTaxableIncome + "€");

        double salaryAnnuelNetAfterAllowance = salaryAnnualNetTaxableIncome - (applyTaxAllowance(salaryAnnualNetTaxableIncome, taxAllowancePercentage));
        System.out.println("En France, la salaire annuel net après abattement est de : " + salaryAnnuelNetAfterAllowance + "€");

        double salaryNetAnnual = applyRevenueTax(salaryAnnuelNetAfterAllowance, taxAllowancePercentage);
        System.out.println("En France, le salaire net après impôts est de : " + salaryNetAnnual + "€");
    }

    // hourlyGrossSalary = Salaire horaire brut
    public static double calculateAnnualGrossSalary (double hourlyGrossSalary, double annualWorkingHours) {
        return hourlyGrossSalary * annualWorkingHours;
    }

    // applySocialCharges = Appliquer les charges sociales, annualGrossSalary = Salaire annuel brut, socialChargePercentage = Pourcentage de charges sociales
    public static double applySocialCharges (double annualGrossSalary, double socialChargePercentage) {

        return socialChargePercentage * annualGrossSalary / 100;
    }

    // applySocialCharges = Appliquer l'abattemnt, annualNetSalary = Salaire annuel net, taxAlloancePercentage = Pourcentage d'abattement fiscal
    public static double applyTaxAllowance (double annualNetSalary, double taxAlloancePercentage) {

        return annualNetSalary * taxAlloancePercentage / 100;
    }

    // applyRevenueTax = Appliquer l'impôt sur le revenu, annualNetSalary = Salaire annuel net
    public static double applyRevenueTax (double annualNetSalary, double taxAllowancePercentage) {

        final int VALUE_TAX_BRACKET_5_MAX = 180294;
        final int VALUE_TAX_BRACKET_5_POURCENTAGE = 45;

        final int VALUE_TAX_BRACKET_4_MAX = 83823;
        final int VALUE_TAX_BRACKET_4_POURCENTAGE = 41;

        final int VALUE_TAX_BRACKET_3_MAX = 29315;
        final int VALUE_TAX_BRACKET_3_POURCENTAGE = 30;

        final int VALUE_TAX_BRACKET_2_MAX = 11498;
        final int VALUE_TAX_BRACKET_2_POURCENTAGE = 11;

        double accumulationOfInstallmentsToBePaid = 0;

        double taxBracket1 = 0;
        double taxBracket2 = 0;
        double taxBracket3 = 0;
        double taxBracket4 = 0;
        double taxBracket5 = 0;

        double remainsNetTaxable = annualNetSalary;

        if (remainsNetTaxable > VALUE_TAX_BRACKET_5_MAX) {
            taxBracket5 = (remainsNetTaxable - VALUE_TAX_BRACKET_5_MAX) * VALUE_TAX_BRACKET_5_POURCENTAGE / 100.0;
            remainsNetTaxable = 180293;
        }

        if (remainsNetTaxable > VALUE_TAX_BRACKET_4_MAX) {
            taxBracket4 = (remainsNetTaxable - VALUE_TAX_BRACKET_4_MAX) * VALUE_TAX_BRACKET_4_POURCENTAGE / 100.0;
            remainsNetTaxable = 83822;
        }

        if (remainsNetTaxable > VALUE_TAX_BRACKET_3_MAX) {
            taxBracket3 = (remainsNetTaxable - VALUE_TAX_BRACKET_3_MAX) * VALUE_TAX_BRACKET_3_POURCENTAGE / 100.0;
            remainsNetTaxable = 29314;
        }

        // De 11 498 € à 29 315 € : 11 %
        if (remainsNetTaxable > VALUE_TAX_BRACKET_2_MAX) {
            taxBracket2 = (remainsNetTaxable - VALUE_TAX_BRACKET_2_MAX) * VALUE_TAX_BRACKET_2_POURCENTAGE / 100;
        }

        accumulationOfInstallmentsToBePaid = taxBracket1 + taxBracket2 + taxBracket3 + taxBracket4 + taxBracket5;

        return annualNetSalary - accumulationOfInstallmentsToBePaid;
    }
}
