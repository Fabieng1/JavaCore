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
        int amountPaid = 260;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = amountPaid - totalBill;

        if (amountToReturn < 0)
            afficher("Il reste à payer : " + amountToReturn + "€");
        else if (amountToReturn == 0){
            afficher("Il ne reste rien à payer");
        }

        else {

            if (changeGiven(amountToReturn, NOTE_OF_50) > 0) {
                amountToReturn = changeGiven2(amountToReturn, NOTE_OF_50);
            }
            if (changeGiven(amountToReturn, NOTE_OF_20) > 0) {
                amountToReturn = changeGiven2(amountToReturn, NOTE_OF_20);
            }
            if (changeGiven(amountToReturn, NOTE_OF_10) > 0) {
                amountToReturn = changeGiven2(amountToReturn, NOTE_OF_50);
            }
            if (changeGiven(amountToReturn, COIN_OF_2) > 0) {
                amountToReturn = changeGiven2(amountToReturn, COIN_OF_2);
            }
            if (changeGiven(amountToReturn, COIN_OF_1) > 0) {
                amountToReturn = changeGiven2(amountToReturn, COIN_OF_1);
            }
            afficher("Il reste à rendre " + amountToReturn + "€");
        }
    }
    public static void afficher (String message) {

        System.out.println(message);
    }

    public static int changeGiven (int amountToReturn, int denominations) {

        return amountToReturn / denominations;
    }

    public static int changeGiven2(int amountToReturn, int denominations) {

        return amountToReturn - (changeGiven(amountToReturn, denominations) * denominations);
    }
}
