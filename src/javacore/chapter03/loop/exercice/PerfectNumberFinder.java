package javacore.chapter03.loop.exercice;

public class PerfectNumberFinder {

    public static void main (String[] args) {

        int diviseur = 1;
        int numberEnd = 6;
        int resultAddDivisor = 0;


        resultAddDivisor = numberEnd % diviseur;

        while (diviseur < numberEnd) {

            // Déterminé quels sont les diviseurs de "end"

            if (numberEnd % diviseur == 0) { // Alors c'est un diviseur


                System.out.println("Modulo : " + resultAddDivisor);
                resultAddDivisor = resultAddDivisor + diviseur;
                System.out.println("Résultat : " + resultAddDivisor);
            }

            diviseur++;

        }
        if (resultAddDivisor == numberEnd) {

            System.out.println(numberEnd + " est un nombre parfait");
        }
        else {
            System.out.println(numberEnd + " n'est pas un nombre parfait");
        }
    }
}


