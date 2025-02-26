package javacore.chapter02.condition.practice;

public class PracticeOperatoLogical {

    public static void main (String[] args) {

        boolean trueAndTrue   = true && true;   // true (vrai)
        boolean trueAndFalse  = true && false;  // false (faux)
        boolean falseAndTrue  = false && true;  // false (faux)
        boolean falseAndFalse = false && false; // false (faux)

        boolean trueOrTrue   = true || true;   // true
        boolean trueOrFalse  = true || false;  // true
        boolean falseOrTrue  = false || true;  //true
        boolean falseOrFalse = false || false; //false

        boolean notTrue =  !true;   // faux
        boolean notFalse = !false;  // vrai

        boolean trueAndTrueAndTrue  = true && true && true;  // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean trueOrTrueOrTrue =  true || true || true;  // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue = !!true;
        boolean notNotFalse = !!false;

        boolean isLoggedIn = true; // L'utilisateur est-il connecté ?
        int age = 15; // Age de l'utilisateur
        int seatAvailable = 40; // Nombre de place disponible dans l'avion

        if (isLoggedIn && age >= 18 && seatAvailable > 0) {

            System.out.println("Réservation effectuée avec succès !");
            seatAvailable--; // seatAvailable -=1; seatAvailable = seatAvailable - 1;

        }
        else {

            System.out.println("Réservation impossible, rééssayez plus tard.");

        }

    }

}
