package javacore.chapter05.object.exercise;

public class BinaryConverter {

    public static void main (String[] args) {

        // String.valueOf(char c) :  Convertit un caractère (char) en une chaîne de caractères (String)
        // Integer.parseInt(String s) : Convertit une chaîne de caractères représentant un entier en une valeur int
        // Math.pow(double a, double b) : Calcule la puissance a exposant b (i.e. a^b), en renvoyant un double

        String binaryText = "10110110";
        char number = ' ';
        String converterString = "";

        int converterNumber = 0;
        int intBinary = Integer.parseInt(binaryText);

        for (int indexBinary = binaryText.length() - 1; indexBinary >= 0; indexBinary--) {

            number = binaryText.charAt(indexBinary);
            converterString = String.valueOf(number);
            converterNumber = Integer.parseInt(converterString);

            System.out.print(converterNumber);

        }
    }
}
