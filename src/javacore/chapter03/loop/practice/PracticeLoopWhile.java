package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {

    public static void main (String [] args) {

        int age = 15;

        if (age < 18) {
            System.out.println("Condition - Age = " + age);
        }

        while (age < 18) {
            System.out.println("Boucle - Age = " + age);
            age++; // age = age + 1;
        }

        System.out.println("On est sortie de la boucle");

        int resultBadWay = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        System.out.println("Résultat : " + resultBadWay);

        int result = 0;

        int currentResult = 1;
        int maxNumber = 10;

        while (currentResult <= maxNumber) {

            System.out.println("Result : " + result + " + " + currentResult);
            result += currentResult;
            System.out.println("------------> " + result);
            currentResult++;
        }

        System.out.println("Somme des nombre de 1 à 100 : " + result);

    }

}
