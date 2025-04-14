package javacore.chapter03.loop.exercise;

public class PerfectNumberFinderV2 {

    public static void main (String[] args) {
        //int resultDivisor = numberEnd % divisor;
        int resultDivisor = 0;

        /*Il faudrait sortir la création et l'initialisation des boucles for pour
        qu'elles soient accessibles ailleurs, mais cela semble impossible*/

        for (int numberEnd = 100; resultDivisor < numberEnd; numberEnd--) {
            for (int divisor = 2; numberEnd % divisor < numberEnd; divisor++) {

                /* Sortir la ligne 13 des boucles pour que resultDivisor ne soit pas égale à 0
                 * rends obsolète */
                resultDivisor = numberEnd % divisor;
                System.out.println("resultDivisor : " + resultDivisor);
                if (numberEnd % divisor == 0) { // Alors divisor est un diviseur

                    System.out.println("Diviseur : " + resultDivisor);
                    resultDivisor = resultDivisor + divisor;
                    System.out.println("Le résultat des diviseur est : " + resultDivisor);
                }
            }
            if (resultDivisor == numberEnd) {
                System.out.println(numberEnd + " est parfait");
            }
            else {
                System.out.println(numberEnd + " n'est pas parfait");
            }

        }


    }


}

