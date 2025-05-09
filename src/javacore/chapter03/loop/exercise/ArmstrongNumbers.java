package javacore.chapter03.loop.exercise;

import java.util.WeakHashMap;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int endNumber = 153;                ;

        int digitFirst = 0;
        int digitTwo = 0;
        int digitThree = 0;

        int resultatMultiplication = 0;
        int multiplicationFirst = 0;
        int multiplicationTwo = 0;

        for (int potentialNumberArmstrong = 0; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            int digitNumber = 0;
            int resultDivision = potentialNumberArmstrong / 10;
            int modulo = potentialNumberArmstrong % 10;
            digitNumber++;

            digitFirst = modulo;

            System.out.println("Nombre Armstrong potentiel : " + potentialNumberArmstrong);
            System.out.println("Résultat de la division dans la boucle for externe : " + resultDivision);
            System.out.println("Modulo dans la boucle for externe : " + modulo);
            System.out.println("DigitNumber boucle for externe : " + digitNumber);
            System.out.println();

            while (resultDivision > 0) {
                modulo = resultDivision % 10;
                resultDivision = resultDivision / 10;

                digitTwo = modulo;

                digitNumber++;

                for (int digitPower = 0; digitPower < digitNumber; digitPower++) {
                    resultatMultiplication = resultatMultiplication * digitThree;
                    resultatMultiplication = resultatMultiplication * modulo;
                }

                System.out.println("Résultat de la division, boucle while : " + resultDivision);
                System.out.println("Modulo de la boucle while : " + modulo);
                System.out.println("DigitNumber de la boucle while : " + digitNumber);
                System.out.println("Résultat Multiplication dans la boucle for interne: " + resultatMultiplication);
                System.out.println("DigitFirst : " + digitFirst);
                System.out.println("DigitTwo : " + digitTwo);
                System.out.println();
            }
        }
    }
}



