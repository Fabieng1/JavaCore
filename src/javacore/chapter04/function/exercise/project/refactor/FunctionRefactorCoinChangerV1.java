package javacore.chapter04.function.exercise.project.refactor;

public class FunctionRefactorCoinChangerV1 {

    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 150;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = amountPaid - totalBill;

        if (amountToReturn < 0)
            afficher("Il reste à payer : " + amountToReturn + "€");
        else if (amountToReturn == 0){
            afficher("Il ne reste rien à payer");
        }

        else {

            if (changeCalculation(amountToReturn, NOTE_OF_50) > 0) {

                amountToReturn = amountToReturn - (changeCalculation(amountToReturn, NOTE_OF_50) * NOTE_OF_50);
            }
            if (changeCalculation(amountToReturn, NOTE_OF_20) > 0) {

                amountToReturn = amountToReturn - (changeCalculation(amountToReturn, NOTE_OF_20) * NOTE_OF_20);
            }
            if (changeCalculation(amountToReturn, NOTE_OF_10) > 0) {
                amountToReturn = amountToReturn - (changeCalculation(amountToReturn, NOTE_OF_10) * NOTE_OF_10);
            }
            if (changeCalculation(amountToReturn, COIN_OF_2) > 0) {
                amountToReturn = amountToReturn - (changeCalculation(amountToReturn, COIN_OF_2) * COIN_OF_2);
            }
            if (changeCalculation(amountToReturn, COIN_OF_1) > 0) {
                amountToReturn = amountToReturn - (changeCalculation(amountToReturn, COIN_OF_1) * COIN_OF_1);
            }
            afficher("Il reste à rendre " + amountToReturn + "€");
        }
    }
    public static void afficher (String message) {
        System.out.println(message);
    }

    public static int changeCalculation (int amountToReturn, int denominations) {
        return amountToReturn / denominations;
    }

    public static void changeGiven() {

    }


}
