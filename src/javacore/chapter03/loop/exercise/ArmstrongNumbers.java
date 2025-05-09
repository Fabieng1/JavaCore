package javacore.chapter03.loop.exercise;

import java.util.WeakHashMap;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int endNumber = 153;                ;

        int digitFirst = 0;
        int digitTwo = 0;
        int digitThree = 0;

        int multiplicationFirst = 0;
        int multiplicationTwo = 0;

        int resultAdd = 0;

        for (int potentialNumberArmstrong = 0; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            int digitNumber = 0;
            int resultDivision = potentialNumberArmstrong / 10;
            int modulo = potentialNumberArmstrong % 10;
            digitNumber++;

            digitFirst = modulo;

            System.out.println("Potentiel nombre Armstrong : " + potentialNumberArmstrong);
            System.out.println("digitFirst : " + digitFirst);

            while (resultDivision > 0) {
                modulo = resultDivision % 10;
                resultDivision = resultDivision / 10;

                digitTwo = modulo;
                System.out.println("digitTwo : " + digitTwo);

                digitNumber++;

                int resultMultiplication = digitFirst;
                for (int digitPower = 0; digitPower < digitNumber; digitPower++) {
                     resultMultiplication = resultMultiplication * digitFirst;

                   multiplicationFirst = resultMultiplication;

                   resultAdd = multiplicationFirst + multiplicationTwo;
                    System.out.println("resultAdd : " + resultAdd);
                    System.out.println();

                }
                System.out.println("resultMultiplication : " + resultMultiplication);
                System.out.println("resultMultiplication digitTwo : " + resultMultiplication);
                System.out.println("digitNumber : " + digitNumber);

            }
        }
    }
}



