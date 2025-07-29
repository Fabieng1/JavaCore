package javacore.chapter05.object.exercise;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BinaryConverter {

    public static void main (String[] args) {

        // String.valueOf(char c) :  Convertit un caractère (char) en une chaîne de caractères (String)
        // Integer.parseInt(String s) : Convertit une chaîne de caractères représentant un entier en une valeur int
        // Math.pow(double a, double b) : Calcule la puissance a exposant b (i.e. a^b), en renvoyant un double

        String binaryText = "1011001010110111101011001001011010101001011111010111001010101101";
        String binaryReverse = "";
        String charConvert = "";
        char binary = ' ';
        char charVerif = ' ';

        int converterInt = 0;
        int indexPower = 0;
        double sum = 0.0;
        double result = 0.0;

        Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Seul le binaire est autotisé !");
                System.out.println("Entrez le code binaire à convertire : ");
                binaryText = scanner.nextLine();

            }while (!binaryText.matches("[0-1]+"));

        for (int indexBinary = binaryText.length(); indexBinary > 0; indexBinary--) {

            binary = binaryText.charAt(indexBinary - 1);
            charConvert = String.valueOf(binary);
            converterInt = Integer.parseInt(charConvert);


            if (converterInt == 1) {
                result = Math.pow(2, indexPower);
                sum += result;
            }



            indexPower++;

            // Affichage du produit des puissances
            System.out.println(result);

        }
        // Somme des puissances

        System.out.printf(Locale.FRENCH, "Somme : %, .0f%n", sum);
    }
}
