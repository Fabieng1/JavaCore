package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {

    public static void main (String[] args) {

        boolean isPreniumMember = true; // Est-ce que le passager est VIP ?

        boolean isVipFlight = false; // Est-ce que le vol est VIP ?

        boolean isLoggedIn = false; // L'utilisateur est-il connecté ?
        int age = 15; // Age de l'utilisateur
        int seatAvailable = 40; // Nombre de place disponible dans l'avion

        //Si isVipFlight est initialisé à false, le fait de mettre un "!" le rend true. Ca ne risque pas de poser problème dans certains cas ?
        if (isLoggedIn && age >= 18 && seatAvailable > 0 && (!isVipFlight || isPreniumMember)) {

            System.out.println("Réservation effectuée avec succès !");
            seatAvailable--; // seatAvailable -=1; seatAvailable = seatAvailable - 1;

        }
        else if (isLoggedIn == false) {
            System.out.println("Réservation Impossible ! Vous devez être connccté pour pouvoir en effectuée une");
        }
        else if (age < 18) {
            System.out.println("Vous devez être majeur pour pouvoir effectué une réservation.");
        }
        else if (seatAvailable <= 0) {
            System.out.println("Le vol est complet");
        }
        else if (isVipFlight && isPreniumMember == false) {
            System.out.println("Réservation impossible. Il est nécessaire d'être membre prénium pour pouvoir réservé sur ce vol");
        }
        else {

            System.out.println("Réservation impossible, rééssayez plus tard.");

        }

    }

}
