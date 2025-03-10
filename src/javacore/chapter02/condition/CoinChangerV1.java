package javacore.chapter02.condition;

public class CoinChangerV1 {

    public static void main (String[] args) {

        // 5, 10, 20, 50, 56, 100
        int totalBill = 50;
        int amountPaid = 100;
        int result = amountPaid - totalBill;

        int billetsDe50 = 3;
        int billetsDe20 = 8;
        int billetsDe10 = 15;
        int piecesDe2 = 20;
        int piecesDe1 = 30;

        if (result > 0) {

           if (result - 50 == 0) {
               if (billetsDe50 > 0) {
                   result = result - 50;
                   billetsDe50--;
               }

           }
           if (result - 20 == 0) {
               if (billetsDe20 > 0) {
                   result = result - 20;
               }

           }

        }


        System.out.println("Le montant à rendre est de " + result + "€");




    }

}
