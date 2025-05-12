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

        while (modulo > 0) {
            modulo = numberToCheck % 10;
            numberToCheck = numberToCheck / 10;

            System.out.println("Modulo : " + modulo);




            int resultMultiplication = modulo;
            int resultAdd = 0;
            for (int digitPower = 1; digitPower < digitNumber; digitPower++) {
                resultMultiplication = resultMultiplication * modulo;
                resultAdd = resultAdd + resultMultiplication;
            }
            System.out.println("Résultat Multiplication : " + resultMultiplication);



            System.out.println("Addition : " + resultAdd);

        }



      /*  int digitFirst = 0;
        int digitTwo = 0;

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
                System.out.println("digitFirst : " + digitFirst);
                System.out.println("digitTwo : " + digitTwo);

                digitNumber++;

                int resultMultiplication = digitFirst;
                System.out.println("digitNumber : " + digitNumber);
                for (int digitPower = 1; digitPower < digitNumber; digitPower++) {
                     resultMultiplication = resultMultiplication * digitFirst;

                   multiplicationFirst = resultMultiplication;

                   if (digitPower == 1) {
                       multiplicationFirst = resultMultiplication;
                   }
                   else if (digitPower == 2) {
                       multiplicationTwo = resultMultiplication;
                   }

                   multiplicationFirst = multiplicationTwo;


                   resultAdd = resultMultiplication;

                   resultAdd =  multiplicationFirst + multiplicationTwo;
                }
                digitFirst = digitTwo;
            }
        }*/
    }
}


