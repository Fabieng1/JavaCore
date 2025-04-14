package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main (String[] args) {

        final int NOTE_OF_50 = 50;
        final int NOTE_OF_20 = 20;
        final int NOTE_OF_10 = 10;
        final int COIN_OF_2 = 2;
        final int COIN_OF_1 = 1;

        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 200;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est positif
        int amountToReturn = amountPaid - totalBill;

        if (amountToReturn < 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else if (amountToReturn == 0){
            System.out.println("Il ne reste rien à payer");
        }

        else {

            for (;amountToReturn >= COIN_OF_1;) {
                amountToReturn = amountToReturn - COIN_OF_1;
                for (;amountToReturn >= COIN_OF_2;) {
                    amountToReturn = amountToReturn - COIN_OF_2;
                    for (;amountToReturn >= NOTE_OF_10;) {
                        amountToReturn = amountToReturn - NOTE_OF_10;
                        for (;amountToReturn >= NOTE_OF_20;) {
                            amountToReturn = amountToReturn - NOTE_OF_20;
                            for (;amountToReturn >= NOTE_OF_50;) {
                                amountToReturn = amountToReturn - NOTE_OF_50;
                            }
                        }

                    }


                }
            }
           /* for (;amountToReturn >= NOTE_OF_50;) {
                amountToReturn = amountToReturn - NOTE_OF_50;
            }

            for (;amountToReturn >= NOTE_OF_20;) {
                amountToReturn = amountToReturn - NOTE_OF_20;
            }

            for (;amountToReturn >= NOTE_OF_10;) {
                amountToReturn = amountToReturn - NOTE_OF_10;
            }

            for (;amountToReturn >= COIN_OF_2;) {
                amountToReturn = amountToReturn - COIN_OF_2;
            }

            for (;amountToReturn >= COIN_OF_1;) {
                amountToReturn = amountToReturn - COIN_OF_1;
            }*/
            System.out.println("Il reste à rendre " + amountToReturn + "€");
        }
    }
}
