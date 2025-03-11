package javacore.chapter02.condition;

public class CoinChangerV1 {

    public static void main (String[] args) {

        // 5, 10, 20, 50, 56, 100
        int totalBill = 50;
        int amountPaid = 100;
        int result = amountPaid - totalBill;
        System.out.println("Montant payé : " + result);

        int billetsDe50 = 3;
        int billetsDe20 = 8;
        int billetsDe10 = 15;
        int piecesDe2 = 20;
        int piecesDe1 = 30;

        if (result > 0) {

           if (result - 50 == 0) {// S'il reste des billets de 50
               if (billetsDe50 > 0) {
                   result = result - 50;
                   billetsDe50--;
               }

           }
           if (result - 20 == 0) { // S'il reste des billets de 20
               if (billetsDe20 > 0) {
                   result = result - 20;
                   billetsDe20--;
               }

           }

            if (result - 10 == 0) {
                if (billetsDe10 > 0) { // S'il reste des billets de 10
                billetsDe10--;
                }
            }
            if (result - 2 == 0) {
                if (piecesDe2 > 0) { // S'il reste des pièces de 2
                piecesDe2--;
                }
            }

            if (result - 1 == 0) {
                if (piecesDe1 > 0) { // S'il reste des pièces de 1
                piecesDe1--;
                }
            }
            System.out.println("Pièces de 1 : " + piecesDe1);
        }


        System.out.println("Le montant à rendre est de " + result + "€");




    }

}
