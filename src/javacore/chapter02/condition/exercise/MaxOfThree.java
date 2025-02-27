package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main (String[] args) {

        int a = 50;
        int b = 50;
        int c = 50;

        if (a < b) {
            System.out.println("Le nombre le plus grand est : " + b);
        }
        else if (b < a) {

            System.out.println("Le nombre le plus grand est : " + a);

        }
        else if (b < c) {

            System.out.println("Le nombre le plus grand est : " + c);

        }
        else if (c < b) {

            System.out.println("Le nombre le plus grand est : " + b);

        }
        else if (a < c) {

            System.out.println("Le nombre le plus grand est : " + c);
        }
        else if (c < a) {

            System.out.println("Le nombre le plus grand est : " + a);

        }

        else {

            System.err.println("Tous les nombres sont égaux");
        }



    }

}
