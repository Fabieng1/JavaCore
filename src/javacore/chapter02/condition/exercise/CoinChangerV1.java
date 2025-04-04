package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 2;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie. Sinon, aucun rendu monnaie n'est fait
        if (amountToReturn < 0) {
            int requiredAmountNote50 = amountToReturn / NOTE_OF_50;
            if (requiredAmountNote50 < 0) {

                amountToReturn = amountToReturn - (requiredAmountNote50 * NOTE_OF_50);
            }
            int requiredAmountNote20 = amountToReturn / NOTE_OF_20;
            if (requiredAmountNote20 < 0) {

                amountToReturn = amountToReturn - (requiredAmountNote20 * NOTE_OF_20);
            }
            int requiredAmountNote10 = amountToReturn / NOTE_OF_10;
            if (requiredAmountNote10 < 0) {
                amountToReturn = amountToReturn - (requiredAmountNote10 * NOTE_OF_10);
            }
            int requiredAmountCoins2 = amountToReturn / COIN_OF_2;
            if (requiredAmountCoins2 < 0) {
                amountToReturn = amountToReturn - (requiredAmountCoins2 * COIN_OF_2);
            }
            int requiredAmountCoins1 = amountToReturn / COIN_OF_1;
            if (requiredAmountCoins1 < 0) {
                amountToReturn = amountToReturn - (requiredAmountCoins1 * COIN_OF_1);
            }
            System.out.println("Il reste à rendre " + amountToReturn + "€");
        }

        else if (amountToReturn > 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else {
            System.out.println("Il ne reste rien à payer");
        }

    }
}
