package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main (String[] args) {

        int endNumber = 200;
        int digitNumber = 0;
        int raisingToThePower = 0;


        for (int potentialNumberArmstrong = 1; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            int resultDivision = potentialNumberArmstrong / 10;

            if (resultDivision > 0) {
                digitNumber++;
            }
            int resultmultiplication = potentialNumberArmstrong * digitNumber;
            System.out.println(resultmultiplication + " Résultat multiplication");
        }
        System.out.println(digitNumber + " Quantité de chiffres par nombres");

    }




            /*
             Division to determine the number of digits in a number
             int digitNumber = currentNumber /        ;

             Multiplication of the digits with their powers
             long resultMultiplication =    *   ;

             Summing the results of the multiplications
             long resultAdd =    +   ;

             if (resultAdd == currentNumber) {

             System.out.println(currentNumber + " est un nombre Armstrong");

             }

             */
}


