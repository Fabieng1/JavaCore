package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main (String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;


        /*Le code doit déterminé quel chiffre/nombre est le plus grand
          Les différents tests effectués ont tous réussis
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
