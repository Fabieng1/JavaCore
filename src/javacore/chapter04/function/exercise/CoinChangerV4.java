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
        int amountPaid = 120;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est négatif
        int amountToReturn = amountPaid - totalBill;
        int bottomOfCash = (NOTE_OF_50 * stockOfNoteOf50) + (NOTE_OF_20 * stockOfNoteOf20) + (NOTE_OF_10 * stockOfNoteOf10) + (COIN_OF_2 * stockOfCoinsOf2) + (COIN_OF_1 * stockOfCoinsOf1);
        System.out.println("Stock caisse : " + bottomOfCash + "€");

        if (amountToReturn > bottomOfCash) {
            display("Rendu monnaie complet impossible");
            display("Montant maximal à rendre possible : " + bottomOfCash);
        } else if (amountToReturn < 0) {
            display("Il reste à payer : " + amountToReturn + "€");
        } else if (amountToReturn == 0) {
            display("Il ne reste rien à payer");
        } else {

            changeDue(amountToReturn);

            amountToReturn = calculatorMoney(amountToReturn, NOTE_OF_50, stockOfNoteOf50, numberChangeGiven(amountToReturn, NOTE_OF_50));
            amountToReturn = calculatorMoney(amountToReturn, NOTE_OF_20, stockOfNoteOf20, numberChangeGiven(amountToReturn, NOTE_OF_20));
            amountToReturn = calculatorMoney(amountToReturn, NOTE_OF_10, stockOfNoteOf10, numberChangeGiven(amountToReturn, NOTE_OF_10));
            amountToReturn = calculatorMoney(amountToReturn, COIN_OF_1, stockOfCoinsOf2, numberChangeGiven(amountToReturn, COIN_OF_1));
            amountToReturn = calculatorMoney(amountToReturn, COIN_OF_2, stockOfCoinsOf1, numberChangeGiven(amountToReturn, COIN_OF_2));

            display("Il reste à rendre : " + amountToReturn + "€");
            // Tests. Sert à tester si les stocks de coupures ne sont pas dépassé
            display("Billets de 50 : " + stockOfNoteOf50);
            display("Billets de 20 : " + stockOfNoteOf20);
            display("Billets de 10 : " + stockOfNoteOf10);
            display("Pièces de 2 : " + stockOfCoinsOf2);
            display("Pièces de 1 : " + stockOfCoinsOf1);

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

        int stockOfNote50 = 2;
        int stockOfNote20 = 4;
        int stockOfNote10 = 5;
        int stockOdCoins2 = 15;
        int stockOdCoins1 = 30;

        stockOfNote50 = stockChangeBank(amountToReturn, stockOfNote50);
        stockOfNote20 = stockChangeBank(amountToReturn, stockOfNote20);
        stockOfNote10 = stockChangeBank(amountToReturn, stockOfNote10);
        stockOdCoins2 = stockChangeBank(amountToReturn, stockOfNote50);
        stockOdCoins1 = stockChangeBank(amountToReturn, stockOfNote50);



        int requiredNoteOf50 = numberChangeGiven(amountToReturn, NOTE_OF_50);

        return amountToReturn;
    }

    public static int calculatorMoney(int amountToReturn, int bankOfValue, int valueInStock, int requiredCoin) {

        requiredCoin = numberChangeGiven(amountToReturn, bankOfValue);
        if (valueInStock > 0 && requiredCoin > 0) {
            if (requiredCoin > valueInStock) {
                requiredCoin = valueInStock;
            }

            amountToReturn = amountToReturn - (requiredCoin * bankOfValue);

        }
        return amountToReturn;
    }

    public static int stockChangeBank(int amountToReturn, int stockInBank) {

            if (stockInBank > 0) {
                stockInBank -= 1;
            }

        return stockInBank;
    }
}


