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
        int numberOfAttempts = 0;

        float resultPrice = 0.0f;

        Scanner sc = new Scanner(System.in);

        numberPaper = userQuestionnaire(numberOfAttempts,numberPaper, sc);

        numberPaper = priceCalculator(numberPaper, resultPrice3, resultPrice2, resultPrice1, resultPrice, deliveryFees, BRACKET_MORE_30000,BRACKET1,PRICE_MORE_30000,PRICE_30000, PRICE_10000);




    }

    public static int userQuestionnaire(int numberOfAttempts, int numberPaper, Scanner sc) {
        do {
            numberOfAttempts++;
            if (numberPaper < 200 || numberPaper > 200000) {
                System.out.println("Quantitée invalide");
            }

            System.out.println("Votre commande ne peut être inférieur à 200 et supérieur à 200.000");
            System.out.print("Combien de feuilles souhaitez-vous commander ?");
            numberPaper = sc.nextInt();

            if (numberOfAttempts == 5) {
                System.out.println("Vous avez fait trop de tentatives infructueuses ! Réessayez plus tard.");
                break;
            }
        } while(numberPaper < 200 || numberPaper > 200000);



        return numberPaper;
    }

    public static int priceCalculator(int numberPaper, float resultPrice3, float resultPrice2, float resultPrice1, float resultPrice, float deliveryFees, final int BRACKET_MORE_30000, final int BRACKET1, final float PRICE_MORE_30000, final float PRICE_30000, final float PRICE_10000) {

        if (numberPaper > 199 && numberPaper <= 200000) {
            if (numberPaper > 30000) {

                numberPaper = numberPaper - BRACKET_MORE_30000;
                resultPrice3 = numberPaper * PRICE_MORE_30000;
                numberPaper = 30000;
            }

            if (numberPaper > 10000) {

                numberPaper = numberPaper - BRACKET1;
                resultPrice2 = numberPaper * PRICE_30000;
                numberPaper = 10000;
            }

            if (numberPaper >= 200) {

                resultPrice1 = numberPaper * PRICE_10000;
                numberPaper -= numberPaper;
            }

            resultPrice = resultPrice1 + resultPrice2 + resultPrice3;

            float tva = (20.0f / 100.0f) * resultPrice;
            resultPrice = resultPrice + tva;

            if (resultPrice < 201) {
                resultPrice = resultPrice + deliveryFees;
            }

            System.out.println("Prix TTC avec livraison : " + resultPrice);
        }

        return numberPaper;
    }


}
