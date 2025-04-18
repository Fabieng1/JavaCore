package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        int countNote50 = 0;
        int countNote20 = 0;
        int countNote10 = 0;
        int countCoin2 = 0;
        int countCoin1 = 0;



        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 150;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est positif
        int amountToReturn = amountPaid - totalBill;


        if (amountToReturn < 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else if (amountToReturn == 0) {
            System.out.println("Il ne reste rien à payer");
        }
        else {
            while (amountToReturn >= NOTE_OF_50) {
                amountToReturn = amountToReturn - NOTE_OF_50;
                countNote50++;
            }

            while (amountToReturn >= NOTE_OF_20) {
                amountToReturn = amountToReturn - NOTE_OF_20;
                countNote20++;
            }

            while (amountToReturn >= NOTE_OF_10) {
                amountToReturn = amountToReturn - NOTE_OF_10;
                countNote10++;
            }

            while (amountToReturn >= COIN_OF_2) {
                amountToReturn = amountToReturn - COIN_OF_2;
                countCoin2++;
            }

            while (amountToReturn >= COIN_OF_1) {
                amountToReturn = amountToReturn - COIN_OF_1;
                countCoin1++;
            }

            System.out.println("Il reste à rendre " + amountToReturn + "€");
            System.out.println();
            System.out.println(countNote50 + " billets de 50 ont été rendus");
            System.out.println(countNote20 + " billets de 20 ont été rendus");
            System.out.println(countNote10 + " billets de 10 ont été rendus");
            System.out.println(countCoin2 + " pièces de 2 ont été rendues");
            System.out.println(countCoin1 + " Pièces de 1 ont été rendues");
        }




    }
}


