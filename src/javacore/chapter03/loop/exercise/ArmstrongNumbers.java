package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        
        int endNumber = 1000000;

        for (int potentialNumberArmstrong = 0; potentialNumberArmstrong <= endNumber; potentialNumberArmstrong++) {
            int numberToCheck = potentialNumberArmstrong;
            int digitNumber = 1;
            int resultAdd = 0;

            int resultDivision = numberToCheck / 10;

            while (resultDivision > 0) {
                resultDivision = resultDivision / 10;
                digitNumber++;

            }

            while (numberToCheck > 0) {
                int modulo = numberToCheck % 10;
                numberToCheck = numberToCheck / 10;

                int resultMultiplication = 1;

                for (int digitPower = 0; digitPower < digitNumber; digitPower++) {
                    resultMultiplication = resultMultiplication * modulo;
                }

                resultAdd = resultAdd + resultMultiplication;
            }

            if (resultAdd == potentialNumberArmstrong) {
                System.out.println(potentialNumberArmstrong);
            }
        }
    }
}
