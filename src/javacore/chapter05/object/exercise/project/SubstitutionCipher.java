package javacore.chapter05.object.exercise.project;

import java.util.Scanner;

public class SubstitutionCipher {

    String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String substitutionAlphabet = "";

    public SubstitutionCipher (String alphabet, String substitutionAlphabet) {

        this.latinAlphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }
    public static void main(String[] args) {

        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "";
        String textToEncrypt = "";
        String textEncrypt = "";
        String textUser = "";

        char charSubstitionAlphabet = ' ';
        char charLatinAlphabet = ' ';

        Scanner scanner = new Scanner(System.in);

        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);

        do {
            substitutionAlphabet = inputUser(textUser, "Entrez l'alphabet de substitution souhaité : ", scanner);
            if (substitutionAlphabet.length() != 26) {
                System.out.println("Votre alphabet ne contient pas 26 charactères ou contient des charactères non autorisé. Veuillez le ressaisir : ");
            }

            for (int indexSubstitutionAlphabet = 0; indexSubstitutionAlphabet < substitutionAlphabet.length(); indexSubstitutionAlphabet++) {

                charSubstitionAlphabet = substitutionAlphabet.charAt(indexSubstitutionAlphabet);

                if (substitutionAlphabet.indexOf(charSubstitionAlphabet) != substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || substitutionAlphabet.matches(".*\\d.*")) { // Vérifie si un charactère est en double ou pas, si oui, demande une nouvelle saisie
                    System.out.println("Charactère double ou présence de chiffre. Veuillez re-saisir l'alphabet de substitution : ");
                    break;
                }
            }

        }while (substitutionAlphabet.length() != 26 || substitutionAlphabet.indexOf(charSubstitionAlphabet) != substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || substitutionAlphabet.matches(".*\\d.*"));

        inputUser(textUser, "Entrez le texte à crypter : ", scanner);

        textToEncrypt = textEncrypt;

       textEncrypt = cipher.cipherMethod(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);

        System.out.print(textEncrypt);
    }

    public String cipherMethod (String textToEncrypt, String alphabet, String substitutionAlphabet, int cipherIteration) {

        String textEncrypt = "";

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
                        charSubstitionAlphabet = this.substitutionAlphabet.charAt(index);
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

        Character charTextUser = ' ';
        char charLatinAlphabet = ' ';

        System.out.print(message);
        textUser = scanner.nextLine().toLowerCase();

        return textUser;
    }
}

