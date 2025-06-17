package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    public static void main(String[] args) {

        final float PRICE_10000 = 0.01f;
        final float PRICE_30000 = 0.005f;
        final float PRICE_MORE_30000 = 0.0025f;

        final int BRACKET1 = 10000;
        final int BRACKET_MORE_30000 = 30000;

        final float deliveryFees = 9.99f;

        float resultPrice1 = 0.0f;
        float resultPrice2 = 0.0f;
        float resultPrice3 = 0.0f;

        int numberPaper = 200;

        float resultPrice = 0.0f;

        Scanner sc = new Scanner(System.in);

        do {
            if (numberPaper < 200 || numberPaper > 200000) {
                System.out.println("Quantitée invalide");
            }

            System.out.println("Votre commande ne peut être inférieur à 200 et supérieur à 200.000");
            System.out.print("Combien de feuilles souhaitez-vous commander ?");
            numberPaper = sc.nextInt();
        } while(numberPaper < 200 || numberPaper > 200000);

        System.out.println("Vous avez commander " + numberPaper + " feuilles");

        if (numberPaper > 30000) {

            numberPaper = numberPaper - BRACKET_MORE_30000;
            resultPrice3 = numberPaper * PRICE_MORE_30000;
            numberPaper = 30000;

            System.out.println("ResultPrice3 : " + resultPrice3);
            System.out.println("numberPaper3 : " + numberPaper);
        }

        if (numberPaper < 30001) {

            numberPaper = numberPaper - BRACKET1;
            resultPrice2 = numberPaper * PRICE_30000;

            System.out.println("ResultPrice2 : " + resultPrice2);
            System.out.println("numberPaper2 : " + numberPaper);
        }

        if (numberPaper < 10001) {
            System.out.println(numberPaper);
            resultPrice3 = numberPaper * PRICE_10000;
            numberPaper -= numberPaper;
            System.out.println("ResultPrice3 : " + resultPrice3);
            System.out.println("numberPaper : " + numberPaper);
        }

        resultPrice = resultPrice1 + resultPrice2 + resultPrice3;

        float tva = (20.0f / 100.0f) * resultPrice;
        resultPrice = resultPrice + tva;

        if (resultPrice < 201) {
            resultPrice = resultPrice + deliveryFees;
        }

        System.out.println("Prix TTC avec livraison : " + resultPrice);
    }
}
