package javacore.chapter04.function.exercise.project.refactor;

public class FunctionRefactorCoinChangerV2 {


    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        int stockOfNoteOf50 = 2;
        int stockOfNoteOf20 = 4;
        int stockOfNoteOf10 = 5;
        int stockOfCoinsOf2 = 15;
        int stockOfCoinsOf1 = 30;

        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 255;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = amountPaid - totalBill;
        int bottomOfCash = (NOTE_OF_50 * stockOfNoteOf50) + (NOTE_OF_20 * stockOfNoteOf20) + (NOTE_OF_10 * stockOfNoteOf10) + (COIN_OF_2 * stockOfCoinsOf2) + (COIN_OF_1 * stockOfCoinsOf1);
        System.out.println("Stock caisse : " + bottomOfCash + "€");

        if (amountToReturn > bottomOfCash) {
            display("Rendu monnaie complet impossible");
            display("Montant maximal à rendre possible : " + bottomOfCash);
        }
        else if (amountToReturn < 0) {
            display("Il reste à payer : " + amountToReturn + "€");
        }

        else if (amountToReturn == 0) {
            display("Il ne reste rien à payer");
        }

        else {
            if (stockOfNoteOf50 > 0 && changeGiven(amountToReturn, NOTE_OF_50) > 0) {

                if (changeGiven(amountToReturn, NOTE_OF_50) > stockOfNoteOf50) {

                    amountToReturn = amountToReturn - (stockOfNoteOf50 * NOTE_OF_50);
                    stockOfNoteOf50 = 0;
                }
                else {
                    stockOfNoteOf50 = stockOfNoteOf50 - changeGiven(amountToReturn, NOTE_OF_50);
                    amountToReturn = amountToReturn - (changeGiven(amountToReturn, NOTE_OF_50) * NOTE_OF_50);

                }
            }
            if (stockOfNoteOf20 > 0 && changeGiven(amountToReturn, NOTE_OF_20) > 0) {

                if (changeGiven(amountToReturn, NOTE_OF_20) > stockOfNoteOf20) {
                    amountToReturn = amountToReturn - (stockOfNoteOf20 * NOTE_OF_20);
                    stockOfNoteOf20 = 0;
                }
                else {
                    stockOfNoteOf20 = stockOfNoteOf20 - changeGiven(amountToReturn, NOTE_OF_20);
                    amountToReturn = amountToReturn - (changeGiven(amountToReturn, NOTE_OF_20) * NOTE_OF_20);
                }
            }
            if (stockOfNoteOf10 > 0 && changeGiven(amountToReturn, NOTE_OF_10) > 0) {
                if (changeGiven(amountToReturn, NOTE_OF_10) > stockOfNoteOf10) {
                    amountToReturn = amountToReturn - (stockOfNoteOf10 * NOTE_OF_10);
                    stockOfNoteOf10 = 0;
                }
                else {
                    stockOfNoteOf10 = stockOfNoteOf10 - changeGiven(amountToReturn, NOTE_OF_10);
                    amountToReturn = amountToReturn - (changeGiven(amountToReturn, NOTE_OF_10) * NOTE_OF_10);
                }
            }
            if (stockOfCoinsOf2 > 0  && changeGiven(amountToReturn, COIN_OF_2) > 0) {
                if (changeGiven(amountToReturn, COIN_OF_2) > stockOfCoinsOf2) {
                    amountToReturn = amountToReturn - (stockOfCoinsOf2 * COIN_OF_2);
                    stockOfCoinsOf2 = 0;
                }
                else {
                    stockOfCoinsOf2 = stockOfCoinsOf2 - changeGiven(amountToReturn, COIN_OF_2);
                    amountToReturn = amountToReturn - (changeGiven(amountToReturn, COIN_OF_2) * COIN_OF_2);
                }
            }
            if (stockOfCoinsOf1 > 0 && changeGiven(amountToReturn, COIN_OF_1) > 0) {
                if (changeGiven(amountToReturn, COIN_OF_1) > stockOfCoinsOf1) {
                    amountToReturn = amountToReturn - (stockOfCoinsOf1 * COIN_OF_1);
                    stockOfCoinsOf1 = 0;
                }
                else {
                    stockOfCoinsOf1 = stockOfCoinsOf1 - changeGiven(amountToReturn, COIN_OF_1);
                    amountToReturn = amountToReturn - (changeGiven(amountToReturn, COIN_OF_1) * COIN_OF_1);
                }
            }
            System.out.println("Il reste à rendre " + amountToReturn + "€");
            bottomOfCash = (NOTE_OF_50 * stockOfNoteOf50) + (NOTE_OF_20 * stockOfNoteOf20) + (NOTE_OF_10 * stockOfNoteOf10) + (COIN_OF_2 * stockOfCoinsOf2) + (COIN_OF_1 * stockOfCoinsOf1);
            System.out.println("Stock caisse restant après rendu : " + bottomOfCash + "€");
        }

        // Tests. Sert à tester si les stocks de coupures ne sont pas dépassé
        display("Billets de 50 : " + stockOfNoteOf50);
        display("Billets de 20 : " + stockOfNoteOf20);
        display("Billets de 10 : " + stockOfNoteOf10);
        display("Pièces de 2 : " + stockOfCoinsOf2);
        display("Pièces de 1 : " + stockOfCoinsOf1);
    }
    public static void display (String message) {
        System.out.println(message);
    }

    public static int changeGiven (int amountToReturn, int denominations) {

        return amountToReturn / denominations;
    }

    public static int changeGiven2(int amountToReturn, int denominations) {

        return amountToReturn - (changeGiven(amountToReturn, denominations) * denominations);
    }

    public static int changeMoney (int amountToReturn, int stockMoney, int denominations) {

        stockMoney = 0;

        return amountToReturn - (stockMoney * denominations);
    }
}
