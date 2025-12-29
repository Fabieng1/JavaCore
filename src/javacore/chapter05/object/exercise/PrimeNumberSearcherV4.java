package javacore.chapter05.object.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberSearcherV4 {

    public static void main (String[] args) {

        int endNumber = 10000;
        /*Création et insertion dans un tableau de la plage dans laquelle je souhaite chercher et trouver les différents
         * nombre premiers afin de trouver les différents multiplicateurs*/
        List<Integer> multiplicator = new ArrayList<>();

        for (int i = 2; i <= endNumber; i++) {

            multiplicator.add(i);
        }
        for (int potentialFirst = 2; potentialFirst <= endNumber; potentialFirst++) {
            for (int multiplicatorNumber = 2; multiplicatorNumber <= endNumber; multiplicatorNumber++) {

                int multiplicateur = potentialFirst * multiplicatorNumber;

                for (int y = 0; y < multiplicator.size(); y++) {
                    if (multiplicateur == multiplicator.get(y)) {

                        multiplicator.remove(y);
                    }
                }
            }
        }

        System.out.println(multiplicator);

    }
}
