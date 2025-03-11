package javacore.chapter03.loop.exercice;

public class PerfectNumberFinder {

    public static void main (String[] args) {

        int start = 1;
        int end = 7;
        int result = 0;

         while (start <= end) {

            // Déterminé quels sont les diviseurs de "end"

             if (end % start == 0) { // Alors c'est un diviseur

                 result = end % start;
                 result = start + result;
                 System.out.println(result);
            }

             // Si result est égale à la somme de ses diviseurs inférieurs, alors c'est un nomb parfait


             start++;



        }
        if (result == start) {

            System.out.println(end + " est un nombre parfait");
        }
        else {
            System.out.println(end + " n'est pas parfait");
        }
    }
}


