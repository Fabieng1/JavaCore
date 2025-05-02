package javacore.chapter03.loop.exercise;

import java.util.WeakHashMap;

public class ArmstrongNumbers {

    public static void main (String[] args) {

        float endNumber = 10.0f;



        for (float potentialNumberArmstrong = 1.0f; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            float resultDivision = 1.0f;

            float digitNumber = 0.0f;

            float resultdivision = 0.0f;

            while (resultdivision < 0.0f) {
                resultdivision = potentialNumberArmstrong / 10;
                digitNumber++;
            }
            System.out.println("Potentiel nombre Armstrong : " + potentialNumberArmstrong);
            System.out.println("Résultat de la division : " + resultdivision);
            System.out.println("Quantité de chiffre par nombres : " + digitNumber);
            System.out.println();

        }
    }
}


