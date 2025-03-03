package javacore.chapter03.loop.exercice;

public class FactorialCalculator {

    public static void main (String[] args) {

        /* Autant, j'ai compris comment calculer un factorielle,
           autant le convertir en code, je galère

         */

        int number = 5;
        long multiplicateur = 1;
        long result = 1;

        while (multiplicateur <= number) {
            System.out.println(result);

            // En mettant "result = number * multiplicateur;", "result est grisé. Bizarre
            result = result * multiplicateur;
            multiplicateur++;
            System.out.println(result);
        }
        System.out.println(result);

    }

}
