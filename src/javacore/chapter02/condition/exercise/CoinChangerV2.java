package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

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
        int amountPaid = 252;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie. Sinon, aucun rendu monnaie n'est fait
        if (amountToReturn < 0) {
            int requiredAmountNote50 = amountToReturn / NOTE_OF_50;
            if (stockOfNoteOf50 >= 1 && requiredAmountNote50 < 0) {

                if (requiredAmountNote50 > stockOfNoteOf50) {
                    amountToReturn = amountToReturn - (requiredAmountNote50 * NOTE_OF_50);
                    stockOfNoteOf50 = stockOfNoteOf50 + requiredAmountNote50;

                }


            }
            int requiredAmountNote20 = amountToReturn / NOTE_OF_20;
            if (stockOfNoteOf50 >= 1 && requiredAmountNote20 < 0) {

                amountToReturn = amountToReturn - (requiredAmountNote20 * NOTE_OF_20);
                stockOfNoteOf20 = stockOfNoteOf20 + requiredAmountNote20;
            }
            int requiredAmountNote10 = amountToReturn / NOTE_OF_10;
            if (stockOfNoteOf10 >= 1 && requiredAmountNote10 < 0) {
                amountToReturn = amountToReturn - (requiredAmountNote10 * NOTE_OF_10);
                stockOfNoteOf10 = stockOfNoteOf10 + requiredAmountNote10;
            }
            int requiredAmountCoins2 = amountToReturn / COIN_OF_2;
            if (stockOfCoinsOf2 >= 1 && requiredAmountCoins2 < 0) {
                amountToReturn = amountToReturn - (requiredAmountCoins2 * COIN_OF_2);
                stockOfCoinsOf2 = stockOfCoinsOf2 + requiredAmountCoins2;
            }
            int requiredAmountCoins1 = amountToReturn / COIN_OF_1;
            if (stockOfCoinsOf1 >= 1 && requiredAmountCoins1 < 0) {
                amountToReturn = amountToReturn - (requiredAmountCoins1 * COIN_OF_1);
                stockOfCoinsOf1 = stockOfCoinsOf1 + requiredAmountCoins1;
            }
            System.out.println("Il reste à rendre " + amountToReturn + "€");
        }

        else if (amountToReturn > 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else {
            System.out.println("Il ne reste rien à payer");
        }

        System.out.println("Billets de 50 : " + stockOfNoteOf50);
        System.out.println("Billets de 20 : " + stockOfNoteOf20);
        System.out.println("Billets de 10 : " + stockOfNoteOf10);
        System.out.println("Pièces de 2 : " + stockOfCoinsOf2);
        System.out.println("Pièces de 1 : " + stockOfCoinsOf1);


    }
}