package javacore.chapter05.object.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberSearcherV4 {

    public static void main(String[] args) {

        int endNumber = 10000;
        int multiplicateur = 0;

        List<Integer> multiplicator = new ArrayList<>();

        //Insertion des nombres de la plage demandé dans un tableau
        for (int i = 2; i <= endNumber; i++) {

            multiplicator.add(i);
        }

        for (int potentialFirst = 2; potentialFirst < multiplicator.size(); potentialFirst++) {
            //Je cherche en dessous les multiplicateur du nombre du dessus
            for (int multiplicatorNumber = 2; multiplicatorNumber < multiplicator.size(); multiplicatorNumber++) {

                multiplicateur = potentialFirst * multiplicatorNumber;

                for (int y = 2; y < multiplicator.size(); y++) {

                    if (multiplicateur == multiplicator.get(y)) {

                        multiplicator.remove(y);
                        break;
                    }


                }
            }
        }

        System.out.println(multiplicator);
    }
}
