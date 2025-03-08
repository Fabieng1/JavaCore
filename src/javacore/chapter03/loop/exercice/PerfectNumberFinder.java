package javacore.chapter03.loop.exercice;

public class PerfectNumberFinder {

    public static void main (String[] args) {

        int start = 1;
        int end = 100;
        int result = 0;

         while (start < end) {

            // Déterminé quels sont les diviseurs de "end"


            if (end % start == 0) {

                result = result + start;
                System.out.println(start + " sont les diviseurs");


            }

             start++;

        }
        System.out.println(result + " est le resultat");

    }

}


