package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int endNumber = 153;
        int numberToCheck = endNumber;


        int digitNumber = 1;

        int resultDivision = endNumber / 10;

        while (resultDivision > 0) {
            resultDivision = resultDivision / 10;
            digitNumber++;

        }
        System.out.println("digitNumber : " + digitNumber);

        int modulo = 153;
        int resultAdd = 0;

        while (modulo > 0) {
            modulo = numberToCheck % 10;
            numberToCheck = numberToCheck / 10;

            int resultMultiplication = 1;

            System.out.println("Modulo : " + modulo);



            for (int digitPower = 0; digitPower < digitNumber; digitPower++) {
                resultMultiplication = resultMultiplication * modulo;
                System.out.println("Résultat multiplication : " + resultMultiplication);
            }


            resultAdd = resultAdd + resultMultiplication;


            //System.out.println("Résultat Multiplication : " + resultMultiplication);

            System.out.println("Addition : " + resultAdd);
        }

        if (resultAdd == endNumber) {
            System.out.println(endNumber + " est un nombre Armstrong !");
        }

    }
}
