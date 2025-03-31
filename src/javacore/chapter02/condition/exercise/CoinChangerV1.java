package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main (String[] args) {

        // Nombres à tester pour totalBill : 100, 50, 30, 10
        // Total à payer
        int totalBill = 50;
        //Ce qu'à donner le client
        int amountPaid = 100;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = totalBill - amountPaid;

        // Stock dans la caisse
        int notes50 = 2;
        int notes20 = 5 ;
        int notes10 = 10;
        int coinsOf2 = 20;
        int coinsOf1 = 30;

        // Si le nombre d'amountToReturn est négatif, on fait un rendu monnaie
        if (amountToReturn < 0) {
            if (amountToReturn < 100 && notes50 > 50) {
                notes50--;
                amountToReturn = amountToReturn - notes50;

            }
        }
    }
}
