package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;


        // Nombres à tester pour totalBill : 100, 50, 30, 10
        // Total à payer
        int totalBill = 50;
        //Ce qu'à donner le client
        int amountPaid = 100;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie. Sinon, aucun rendu monnaie n'est fait
        if (amountToReturn < 0) {
            if (amountToReturn - NOTE_OF_50 < 0) {
                // Je met à jour le montant à rendre
                amountToReturn = amountToReturn - NOTE_OF_50;
            }
            if (amountToReturn - NOTE_OF_20 < 0) {
                // Je met à jour le montant à rendre
                amountToReturn = amountToReturn - NOTE_OF_20;
            }
            if (amountToReturn - NOTE_OF_10 < 0) {
                // Je met à jour le montant à rendre
                amountToReturn = amountToReturn - NOTE_OF_10;
            }
            if (amountToReturn - COIN_OF_2 < 0) {
                // Je met à jour le montant à rendre
                amountToReturn = amountToReturn - COIN_OF_2;
            }
            if (amountToReturn - COIN_OF_1 < 0) {
                // Je met à jour le montant à rendre
                amountToReturn = amountToReturn - COIN_OF_1;
            }
        }
        int result = amountToReturn % 50;
        System.out.println("Résultat : " + result);
        System.out.println("Il reste à rendre : " + amountToReturn);
    }
}
