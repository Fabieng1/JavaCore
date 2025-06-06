package javacore.chapter04.function.exercise;

public class CoinChangerV4 {

    // Stocks globaux accessibles et modifiables depuis les fonctions
    static int stock50 = 2;
    static int stock20 = 4;
    static int stock10 = 5;
    static int stock2 = 15;
    static int stock1 = 30;

    public static void main(String[] args) {

        final int NOTE_50 = 50;
        final int NOTE_20 = 20;
        final int NOTE_10 = 10;
        final int COIN_2 = 2;
        final int COIN_1 = 1;

        int totalBill = 100;
        int amountPaid = 101;
        int amountToReturn = amountPaid - totalBill;

        int bottomOfCash = (NOTE_50 * stock50) + (NOTE_20 * stock20) + (NOTE_10 * stock10) + (COIN_2 * stock2) + (COIN_1 * stock1);

        display("Stock caisse : " + bottomOfCash + "€");

        if (amountToReturn > bottomOfCash) {
            display("Rendu monnaie complet impossible");
            display("Montant maximal à rendre possible : " + bottomOfCash + "€");
        }
        else if (amountToReturn < 0) {
            display("Il reste à payer : " + (-amountToReturn) + "€");
        }
        else if (amountToReturn == 0) {
            display("Il ne reste rien à payer");
        }
        else {
            display("Montant à rendre : " + amountToReturn + "€");

            amountToReturn = giveChange(amountToReturn, NOTE_50);
            amountToReturn = giveChange(amountToReturn, NOTE_20);
            amountToReturn = giveChange(amountToReturn, NOTE_10);
            amountToReturn = giveChange(amountToReturn, COIN_2);
            amountToReturn = giveChange(amountToReturn, COIN_1);

            display("Il reste à rendre : " + amountToReturn + "€");

            display("Billets de 50 restants : " + stock50);
            display("Billets de 20 restants : " + stock20);
            display("Billets de 10 restants : " + stock10);
            display("Pièces de 2 restantes : " + stock2);
            display("Pièces de 1 restantes : " + stock1);

            int finalCash = (NOTE_50 * stock50) + (NOTE_20 * stock20) + (NOTE_10 * stock10) + (COIN_2 * stock2) + (COIN_1 * stock1);

            display("Fond de caisse restant : " + finalCash + "€");
        }
    }

    public static int giveChange(int amountToReturn, int denomination) {
        int stock = getStock(denomination);
        int required = amountToReturn / denomination;

        int toGive;
        if (required <= stock) {
            toGive = required;
        }
        else {
            toGive = stock;
        }

        if (toGive > 0) {
            display("Rendu de " + toGive + " x " + denomination + "€");
        }

        amountToReturn = amountToReturn - (toGive * denomination);
        updateStock(denomination, stock - toGive);

        return amountToReturn;
    }

    public static int getStock(int denomination) {

        if (denomination == 50) {
            return stock50;
        }
        else if (denomination == 20) {
            return stock20;
        }
        else if (denomination == 10) {
            return stock10;
        }
        else if (denomination == 2) {
            return stock2;
        }
        else if (denomination == 1) {
            return stock1;
        }
        else {
            return 0;
        }
    }

    public static void updateStock(int denomination, int newValue) {

        if (denomination == 50) {
            stock50 = newValue;
        }
        else if (denomination == 20)
        {
            stock20 = newValue;
        }
        else if (denomination == 10) {
            stock10 = newValue;
        }
        else if (denomination == 2) {
            stock2 = newValue;
        }
        else if (denomination == 1) {
            stock1 = newValue;
        }
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
