package javacore.chapter03.loop.exercise;

import java.util.WeakHashMap;

public class ArmstrongNumbers {

    public static void main (String[] args) {

        double endNumber = 10000.0;



        for (double potentialNumberArmstrong = 0.0; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            double resultDivision = potentialNumberArmstrong / 10.0;
            double modulo = potentialNumberArmstrong % 10.0;

            double digitNumber = 0.0;

            while (resultDivision >= 0.1) {
                    resultDivision = resultDivision / 10;
                    digitNumber++;
            }
            System.out.println("Potentiel nombre Armstrong : " + potentialNumberArmstrong);
            System.out.println("Résultat de la division : " + resultDivision);
            System.out.println("Quantité de chiffre par nombres : " + digitNumber);
            System.out.println("Modulo : " + modulo);
            System.out.println();
        }
    }
}


