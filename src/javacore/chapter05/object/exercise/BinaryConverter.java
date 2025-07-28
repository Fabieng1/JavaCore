package javacore.chapter05.object.exercise;

public class BinaryConverter {

    public static void main (String[] args) {

        // String.valueOf(char c) :  Convertit un caractère (char) en une chaîne de caractères (String)
        // Integer.parseInt(String s) : Convertit une chaîne de caractères représentant un entier en une valeur int
        // Math.pow(double a, double b) : Calcule la puissance a exposant b (i.e. a^b), en renvoyant un double

        String binaryText = "10110110";
        String binaryReverse = "";
        String charConvert = "";
        char binary = ' ';

        int converterInt = 0;
        int indexPower = 0;
        double sum = 0.0;
        double result = 0;

        for (int indexBinary = binaryText.length(); indexBinary > 0; indexBinary--) {
            binary = binaryText.charAt(indexBinary - 1);
            charConvert = String.valueOf(binary);
            converterInt = Integer.parseInt(charConvert);


                if (converterInt == 1) {
                    result = Math.pow(2, indexPower);
                    indexPower++;
                }
                else {
                    indexPower++;
                    continue;
                }

                sum += result;

                // Affichage du produit des puissances
                System.out.println(result);

            binaryReverse = binaryReverse + binary;
        }
        // Somme des puissances
        System.out.println("Somme : " + sum);
    }
}
