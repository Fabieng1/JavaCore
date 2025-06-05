package javacore.chapter04.function.exercise;

public class CoinChangerV4 {

    public static void main(String[] args) {


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
        int amountPaid = 101;
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
        } else {

            changeDue(amountToReturn);
        }

        bottomOfCash -= amountToReturn;
        display("Fond de caisse restant : " + bottomOfCash);
    }


    public static void display(String message) {
        System.out.println(message);
    }

    public static int numberChangeGiven(int amountToReturn, int denominations) {

        return amountToReturn / denominations;
    }

    public static int changeDue(int amountToReturn) {


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

        int requiredNoteOf50 = numberChangeGiven(amountToReturn, NOTE_OF_50);

        if (stockOfNoteOf50 > 0 && requiredNoteOf50 > 0) {

            if (requiredNoteOf50 > stockOfNoteOf50) {
                requiredNoteOf50 = stockOfNoteOf50;
            }

                amountToReturn = amountToReturn - (requiredNoteOf50 * NOTE_OF_50);
                stockOfNoteOf50 = stockOfNoteOf50 - requiredNoteOf50;

        }

        int requiredNoteOf20 = numberChangeGiven(amountToReturn, NOTE_OF_20);

        if (stockOfNoteOf20 > 0 && requiredNoteOf20 > 0) {
            if (requiredNoteOf20 > stockOfNoteOf20) {
                amountToReturn = amountToReturn - (stockOfNoteOf20 * NOTE_OF_20);
                stockOfNoteOf20 = 0;
            }

                amountToReturn = amountToReturn - (requiredNoteOf20 * NOTE_OF_20);
                stockOfNoteOf20 = stockOfNoteOf20 - requiredNoteOf20;

        }

        int requiredNoteOf10 = numberChangeGiven(amountToReturn, NOTE_OF_10);

        if (stockOfNoteOf10 > 0 && requiredNoteOf10 > 0) {
            if (requiredNoteOf10 > stockOfNoteOf10) {
               requiredNoteOf10 = stockOfNoteOf10;
            }
                amountToReturn = amountToReturn - (requiredNoteOf10 * NOTE_OF_10);
                stockOfNoteOf10 = stockOfNoteOf10 - requiredNoteOf10;

        }

        int requiredCoin2 = numberChangeGiven(amountToReturn, COIN_OF_2);

        if (stockOfCoinsOf2 > 0 && requiredCoin2 > 0) {
            if (requiredCoin2 > stockOfCoinsOf2) {
               requiredCoin2 = stockOfCoinsOf2;
            }
                amountToReturn = amountToReturn - (requiredCoin2 * COIN_OF_2);
                stockOfCoinsOf2 = stockOfCoinsOf2 - requiredCoin2;


            int requiredCoin1 = numberChangeGiven(amountToReturn, COIN_OF_1);
            if (stockOfCoinsOf1 > 0 && requiredCoin1 > 0) {
                if (requiredCoin1 > stockOfCoinsOf1) {
                    requiredCoin1 = stockOfCoinsOf1;
                }
                    amountToReturn = amountToReturn - (requiredCoin1 * COIN_OF_1);
                    stockOfCoinsOf1 = stockOfCoinsOf1 - requiredCoin1;

            }

            /*
             int requiredNoteOf50 = numberChangeGiven(amountToReturn, NOTE_OF_50);
            if (stockOfNoteOf50 > 0 && requiredNoteOf50 > 0) {

                if (requiredNoteOf50 > stockOfNoteOf50) {

                    amountToReturn = amountToReturn - (stockOfNoteOf50 * NOTE_OF_50);
                    stockOfNoteOf50 = 0;
                } else {

                    amountToReturn = amountToReturn - requiredNoteOf50 * NOTE_OF_50;
                    stockOfNoteOf50 = stockOfNoteOf50 - requiredNoteOf50;
                }*/

        }

        display("Il reste à rendre : " + amountToReturn + "€");
        // Tests. Sert à tester si les stocks de coupures ne sont pas dépassé
        display("Billets de 50 : " + stockOfNoteOf50);
        display("Billets de 20 : " + stockOfNoteOf20);
        display("Billets de 10 : " + stockOfNoteOf10);
        display("Pièces de 2 : " + stockOfCoinsOf2);
        display("Pièces de 1 : " + stockOfCoinsOf1);

        return amountToReturn;
    }
}


