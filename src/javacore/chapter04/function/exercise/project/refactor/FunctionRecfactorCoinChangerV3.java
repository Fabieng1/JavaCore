package javacore.chapter04.function.exercise.project.refactor;

public class FunctionRecfactorCoinChangerV3 {

    public static void main(String[] args) {

        // Total à payer
        int totalBill = 100;
        //Ce qu'à donner le client
        int amountPaid = 1210;
        // Ce qu'il doit être rendu pour pas. Rendre seulement si le résultat est positif
        int amountToReturn = amountPaid - totalBill;

        if (amountToReturn < 0)
            System.out.println("Il reste à payer : " + amountToReturn + "€");
        else if (amountToReturn == 0) {
            System.out.println("Il ne reste rien à payer");
        }
        else {

            change(amountToReturn);
        }
    }

    public static void change (int amountToReturn) {

        int countNote50 = 0;
        int countNote20 = 0;
        int countNote10 = 0;
        int countCoin2 = 0;
        int countCoin1 = 0;

        while (amountToReturn > 0) {

            if (amountToReturn >= 50) {
                amountToReturn -= 50;
                countNote50++;
            }

            else if (amountToReturn >= 20) {
                amountToReturn -= 20;
                countNote20++;
            }

            else if (amountToReturn >= 10) {
                amountToReturn -= 10;
                countNote10++;
            }

            else if (amountToReturn >= 2) {
                amountToReturn -= 2;
                countCoin2++;
            }

            else if (amountToReturn >= 1) {
                amountToReturn -= 1;
                countCoin1++;
            }
        }

        // Affichage des résultats
        System.out.println("Il reste à rendre " + (amountToReturn) + "€");
        System.out.println(countNote50 + " billets de 50 ont été rendus");
        System.out.println(countNote20 + " billets de 20 ont été rendus");
        System.out.println(countNote10 + " billets de 10 ont été rendus");
        System.out.println(countCoin2 + " pièces de 2 ont été rendues");
        System.out.println(countCoin1 + " pièces de 1 ont été rendues");
    }
}
