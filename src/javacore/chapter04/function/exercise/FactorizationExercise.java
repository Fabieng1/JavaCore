package javacore.chapter04.function.exercise;

public class FactorizationExercise {

    public static void main (String[] args) {

        // Afficher les nombres de 1 à 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nombre: " + i);
        }



        // Afficher la table de multiplication de 2
        multiplication(2);

        // Afficher la table de multiplication de 3
        multiplication(3);

        // Afficher la table de multiplication de 6
        multiplication(6);

        // Afficher les carrés
        square(1, 6);
    }

    public static void afficher(String message) {
        System.out.println(message);
    }

    public static void multiplication (int table) {

        afficher("Table de multiplication de " + table + " : ");
        for (int i = 1; i <= 10; i++) {
            afficher(table + " x " + i + " = " + (table * i));
        }
    }

    public static void square(int squareNumberStart, int squareNumberEnd) {
        afficher("Carrés des nombres de 1 à 5 :");
        for (int i = squareNumberStart; i <= squareNumberEnd; i++) {
            afficher(i + " au carré = " + (i * i));
        }

    }

}