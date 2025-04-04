package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main (String[] args) {

        // Valeurs des coupures
        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        // Stock disponible des valeurs
        int stockBanknoteOf50 = 0;
        int stockBanknoteOf20 = 4;
        int stockBanknoteOf10 = 8;
        int stockPiecesOf2    = 15;
        int stockPiecesOf1    = 30;

        // Nombres à tester pour totalBill : 200, 100, 50, 30, 10
        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 205;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie. Sinon, aucun rendu monnaie n'est fait
        if (amountToReturn < 0) {
            if (stockBanknoteOf50 >= 1 && amountToReturn + NOTE_OF_50 <= 0) {

                int nbNote50 = amountToReturn / NOTE_OF_50;
                amountToReturn = amountToReturn - (nbNote50 * NOTE_OF_50);

                stockBanknoteOf50 = stockBanknoteOf50 + nbNote50;


            }
            if (stockBanknoteOf20 >= 1 && amountToReturn + NOTE_OF_20 <= 0) {
                int nbNote20 = amountToReturn / NOTE_OF_20;
                amountToReturn = amountToReturn - (nbNote20 * NOTE_OF_20);

                stockBanknoteOf20 = stockBanknoteOf20 + nbNote20;
            }
            if (stockBanknoteOf10 >= 1 && amountToReturn + NOTE_OF_10 <= 0) {
                int nbNote10 = amountToReturn / NOTE_OF_10;
                amountToReturn = amountToReturn + (nbNote10 * NOTE_OF_10);

                stockBanknoteOf10 = stockBanknoteOf10 + nbNote10;
            }
            if (stockPiecesOf2 >= 1 && amountToReturn + COIN_OF_2 <= 0) {
                int nbCoins2 = amountToReturn / COIN_OF_2;
                amountToReturn = amountToReturn - (nbCoins2 * COIN_OF_2);

                stockPiecesOf2 = stockPiecesOf2 + nbCoins2;
            }
            if (stockPiecesOf1 >= 1 && amountToReturn + COIN_OF_1 <= 0) {
                int nbCoins1 = amountToReturn / COIN_OF_1;
                amountToReturn = amountToReturn - (nbCoins1 * COIN_OF_1);

                stockPiecesOf1 = stockPiecesOf1 + nbCoins1;
            }
            System.out.println("Il reste à rendre " + amountToReturn + "€");
        }
        else if (amountToReturn > 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else {
            System.out.println("Il ne reste rien à payer");
        }
        System.out.println("50 : " + stockBanknoteOf50);
        System.out.println("20 : " + stockBanknoteOf20);
        System.out.println("10 : " + stockBanknoteOf10);
        System.out.println("2 : " + stockPiecesOf2);
        System.out.println("1 : " + stockPiecesOf1);



    }
}
