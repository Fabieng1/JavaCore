package javacore.chapter03.loop.exercise;

import java.util.WeakHashMap;

public class ArmstrongNumbers {

    public static void main (String[] args) {

        double endNumber = 153.0;

        double resultMultiplication = 0.0;
        double resultAdd = 0.0;



        for (double potentialNumberArmstrong = 1.0; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            double resultDivision = potentialNumberArmstrong / 10.0;
            double modulo = potentialNumberArmstrong % 10.0;

            double digitNumber = 0.0;

            while (resultDivision >= 0.1) {
                digitNumber++;
                for (int digitPower = 0; digitPower < digitNumber; digitPower++) {
                    resultMultiplication = resultMultiplication * (resultDivision);
                }
                resultDivision = resultDivision / 10;
            }


            System.out.println("Potentiel nombre Armstrong : " + potentialNumberArmstrong);
            System.out.println("Résultat de la division : " + resultDivision);
            System.out.println("Résultat de la multiplication : " + resultMultiplication);
            System.out.println("Résultat de l'addition : " + resultAdd);
            System.out.println("Quantité de chiffre par nombres : " + digitNumber);
            System.out.println("Modulo : " + modulo);
            System.out.println();
        }
    }
}


