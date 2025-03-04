package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main (String[] args) {

        int result = 0;

        int currentResult = 1;
        int maxNumber = 100;

        while (currentResult <= maxNumber) {

            System.out.println("Result : " + result + " + " + currentResult);
            result += currentResult;
            System.out.println("------------> " + result);
            currentResult++;
        }

        System.out.println("Somme des nombre de 1 à 100 : " + result);

        int resultFor = 0;

        for (int cNumber = 1; cNumber <= maxNumber; cNumber++) {

            System.out.println("Result : " + resultFor + " + " + cNumber);
            resultFor += cNumber;
            System.out.println("------------> " + resultFor);

        }



        System.out.println("Somme des nombre de 1 à 100 : " + resultFor);

        for (int a = 1; a <= 100; a++) {

            int resultForIf = 0;

            if (a % 2 == 0) {
                for (int b = 1; b <= a; b++) {
                    resultForIf += b;
                }

                System.out.println("La somme des chiffres en 1 et " + a + " : " + resultForIf);

            }
            else {
                System.out.println("Le chiffre suivant est impairs : " + a);
            }

        }


    }

}


