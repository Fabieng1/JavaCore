package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main (String[] args) {

        int a = -30;
        int b = -11;
        int c = 1;


        /*Le code doit déterminé quel chiffre/nombre est le plus grand
          int a = 10; int b = 20; int c = 30; Résultats : 30
          int a = 10; int b = 60; int c = 30; Résultats : 30
          int a = 10; int b = 50; int c = 30; Résultats : 50
          int a = 10; int b = 11; int c = 12; Résultats : 12
          int a = 10; int b = -11; int c = 12; Résultats : 12
          int a = -30; int b = -11; int c = -15; Résultats : -11
          int a = -30; int b = -11; int c = 1; Résultats : 1
         */

        if (a < b && b > c) {
            System.out.println("Le nombre le plus grand est : " + b);
        }
        else if (b < a && a > c) {

            System.out.println("Le nombre le plus grand est : " + a);

        }
        else if (a < c && c > b) {

            System.out.println("Le nombre le plus grand est : " + c);

        }
        else {

            System.out.println("Tous les nombres sont égaux");
        }




    }

}
