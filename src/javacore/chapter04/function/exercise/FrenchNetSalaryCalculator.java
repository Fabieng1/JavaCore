package javacore.chapter04.function.exercise;

public class FrenchNetSalaryCalculator {

    public static void main (String[] args) {

        double smicFrenchHours = 11.07;
        double smicFrenchMedianHours = 17.50;
        double smicFrenchMiddleHours = 22.50;
        double frenchWealthThresholdHours = 35.0;

        double numberWorkingHours = 1820.04;

        double socialChargePercentage = 25.0;
        double taxAlloancePercentage = 10.0;

        double calculateAnnualGrossSalary = 0;

        calculateAnnualGrossSalary = calculateAnnualGrossSalary(smicFrenchHours, numberWorkingHours);

        System.out.println("En France, le salaire annuel brut est de : " + calculateAnnualGrossSalary + "€");

        double salaryAnnualNetTaxableIncome = calculateAnnualGrossSalary - (applySocialCharges(calculateAnnualGrossSalary, socialChargePercentage));

        System.out.println("En France, le salaire annuel net impossable est de : " + salaryAnnualNetTaxableIncome + "€");

        double salaryAnnuelNetAfterAlloance = salaryAnnualNetTaxableIncome - (applyTaxAllowance(salaryAnnualNetTaxableIncome, taxAlloancePercentage));

        System.out.println("En France, la salaire annuel net après abattement est de : " + salaryAnnuelNetAfterAlloance + "€");
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

    /*// applyRevenueTax = Appliquer l'impôt sur le revenu, annualNetSalary = Salaire annuel net
    public static double applyRevenueTax (double annualNetSalary) {

        final int VALUE_MAX_TAX_BRACKET_5 = 180294;
        final int VALUE_POUR_TAX_BRACKET_5 = 45;

        final int VALUE_MAX_TAX_BRACKET_4 = 83823;
        final int VALUE_POUR_TAX_BRACKET_4 = 41;

        final int VALUE_MAX_TAX_BRACKET_3 = 29315;
        final int VALUE_POUR_TAX_BRACKET_3 = 30;

        final int VALUE_MAX_TAX_BRACKET_2 = 11498;
        final int VALUE_POUR_TAX_BRACKET_2 = 11;


         double salaryAnnualNetTaxableAfterReduction = applyTaxAllowance(sal)

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

        return annualNetSalary;
    }*/
}
