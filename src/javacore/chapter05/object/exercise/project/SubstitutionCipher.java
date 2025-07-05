package javacore.chapter05.object.exercise.project;

import java.util.Scanner;

public class SubstitutionCipher {

    String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String substitutionAlphabet = "";
    String textToEncrypt = "";
    String textEncrypt = "";
    String textUser = "";

    public SubstitutionCipher (String alphabet, String substitutionAlphabet) {

        this.latinAlphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }
    public static void main(String[] args) {

        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "";

        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);


        String textToEncrypt = "";
        String textEncrypt = "";
        String textUser = "";

        char charSubstitionAlphabet = ' ';
        char charLatinAlphabet = ' ';

        Scanner scanner = new Scanner(System.in);

        do {
            cipher.substitutionAlphabet = inputUser(textUser, "Entrez l'alphabet de substitution souhaité : ", scanner);
            if (cipher.substitutionAlphabet.length() != 26) {
                System.out.println("Votre alphabet ne contient pas 26 charactères ou contient des charactères non autorisé. Veuillez le ressaisir : ");
            }

            for (int indexSubstitutionAlphabet = 0; indexSubstitutionAlphabet < cipher.substitutionAlphabet.length(); indexSubstitutionAlphabet++) {

                charSubstitionAlphabet = cipher.substitutionAlphabet.charAt(indexSubstitutionAlphabet);

                if (cipher.substitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.substitutionAlphabet.matches(".*\\d.*")) {
                    System.out.println("Charactère double ou présence de chiffre. Veuillez re-saisir l'alphabet de substitution : ");
                    break;
                }
            }

        }while (cipher.substitutionAlphabet.length() != 26 || cipher.substitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.substitutionAlphabet.matches(".*\\d.*"));

        textUser = inputUser(textUser, "Entrez le texte à crypter : ", scanner);

        textToEncrypt = textUser;

        textEncrypt =  cipher.cipherMethod(textToEncrypt, 3);

        System.out.println(textEncrypt);
    }

    public String cipherMethod (String textToEncrypt, int cipherIteration) {

        String textEncrypt = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';
        Character charTextToEncrypt;

        textEncrypt = textToEncrypt;

        for (int indexIteration = 0; indexIteration < cipherIteration; indexIteration++) {
            textEncrypt = "";
            for (int charCurrentTexTotEncrypt = 0; charCurrentTexTotEncrypt < textToEncrypt.length(); charCurrentTexTotEncrypt++) {
                charTextToEncrypt = textToEncrypt.charAt(charCurrentTexTotEncrypt);

                if (charTextToEncrypt != charLatinAlphabet) {
                    char charLower = textToEncrypt.charAt(charCurrentTexTotEncrypt);
                    int index = alphabet.indexOf(charLower);

                    if (index != -1) {
                        charSubstitionAlphabet = substitutionAlphabet.charAt(index);
                        textEncrypt = textEncrypt + charSubstitionAlphabet;
                    } else {
                        textEncrypt = textEncrypt + charTextToEncrypt;
                    }
                } else {
                    textEncrypt = textEncrypt + charTextToEncrypt;
                }
            }
            textToEncrypt = textEncrypt;
        }
        return textEncrypt;
    }

    public static String inputUser (String textUser, String message, Scanner scanner) {

        System.out.print(message);
        textUser = scanner.nextLine().toLowerCase();

        return textUser;
    }
}

