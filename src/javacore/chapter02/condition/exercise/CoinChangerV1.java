package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;


        // Nombres à tester pour totalBill : 200, 100, 50, 30, 10
        // Total à payer
        int totalBill = 1255;
        //Ce qu'à donner le client
        int amountPaid = 2000;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie. Sinon, aucun rendu monnaie n'est fait
        if (amountToReturn <= 0) {
            if (amountToReturn + NOTE_OF_50 < 0) {

                int nbNote50 = amountToReturn / NOTE_OF_50;
                amountToReturn = amountToReturn - (nbNote50 * NOTE_OF_50);
            }
            if (amountToReturn + NOTE_OF_20 <= 0) {
                int nbNote20 = amountToReturn / NOTE_OF_20;
                amountToReturn = amountToReturn - (nbNote20 * NOTE_OF_20);
            }
            if (amountToReturn + NOTE_OF_10 <= 0) {
                int nbNote10 = amountToReturn / NOTE_OF_10;
                amountToReturn = amountToReturn - (nbNote10 * NOTE_OF_10);
            }
            if (amountToReturn + COIN_OF_2 <= 0) {
                int nbCoins2 = amountToReturn / COIN_OF_2;
                amountToReturn = amountToReturn - (nbCoins2 * COIN_OF_2);
            }
            if (amountToReturn + COIN_OF_1 <= 0) {
                int nbCoins1 = amountToReturn / COIN_OF_1;
                amountToReturn = amountToReturn - (nbCoins1 * COIN_OF_1);
            }
            System.out.println("Il reste à rendre " + amountToReturn + "€");
        }
        if (amountToReturn > 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        if (amountToReturn == 0) {
            System.out.println("Il ne reste rien à payer");
        }
    }
}
