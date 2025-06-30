package javacore.chapter05.object.exercise.project;

import java.util.Locale;
import java.util.Scanner;

public class SubsitutionCipher {

    public static void main(String[] args) {

        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "";
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncrypt = "";
        String textUser = "";
        String inputUser = "";

        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';
        char charTextUser = ' ';
        Character charTextToEncrypt;

        /*
        Consigne 1

        for (int charCurrentTexTotEncrypt = 0; charCurrentTexTotEncrypt < textToEncrypt.length(); charCurrentTexTotEncrypt++) {
            charTextToEncrypt = textToEncrypt.charAt(charCurrentTexTotEncrypt);

            if (Character.isLetter(charTextToEncrypt)) {
                char charLower = textToEncrypt.charAt(charCurrentTexTotEncrypt);
                int index = latinAlphabet.indexOf(charLower);

                if (index != -1) {
                    charSubstitionAlphabet = substitutionAlphabet.charAt(index);
                    textEncrypt = textEncrypt + charSubstitionAlphabet;
                }
                else {
                    textEncrypt = textEncrypt + charTextToEncrypt;
                }
            }
            else {
                textEncrypt = textEncrypt + charTextToEncrypt;
            }
        }
        System.out.println(textEncrypt); */

        Scanner scanner = new Scanner(System.in);

        substitutionAlphabet = inputUser;

        textUser = inputUser(textUser, "Entrez le texte à chiffrer : ", scanner, charTextUser);

        textEncrypt = cipher(textUser, latinAlphabet, scanner, substitutionAlphabet, 3);

        cipher(textUser, latinAlphabet, scanner, substitutionAlphabet, 3);

        System.out.println(textEncrypt);
    }

    public static String cipher (String textToEncrypt, String alphabet, String substitutionAlphabet) {

        String textEncrypt = "";
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';

        textEncrypt = textToEncrypt;

        for (int currentLatinAlphabet = 0; currentLatinAlphabet < latinAlphabet.length(); currentLatinAlphabet++) {
            charLatinAlphabet = latinAlphabet.charAt(currentLatinAlphabet);
            charSubstitionAlphabet = substitutionAlphabet.charAt(currentLatinAlphabet);

            textEncrypt = textEncrypt.replaceAll(String.valueOf(charLatinAlphabet), String.valueOf(charSubstitionAlphabet));
        }

        return textEncrypt;
    }

    public static String cipher (String textToEncrypt, String alphabet, Scanner scanner, String substitutionAlphabet, int cipherIteration) {

        String textEncrypt = "";
        String inputUser = "";
        String textUser = "";

        char charSubstitionAlphabet = ' ';
        char charTextUser = ' ';
        Character charTextToEncrypt;

        do {

            inputUser(textUser, "Entrez l'alphabet de substitutuin souhaité : ", scanner, charTextUser);

            int index = inputUser.indexOf()
        }while (inputUser.length() != 26);


        textEncrypt = textToEncrypt;

        for (int indexIteration = 0; indexIteration < cipherIteration; indexIteration++) {
            textEncrypt = "";
            for (int charCurrentTexTotEncrypt = 0; charCurrentTexTotEncrypt < textToEncrypt.length(); charCurrentTexTotEncrypt++) {
                charTextToEncrypt = textToEncrypt.charAt(charCurrentTexTotEncrypt);

                if (Character.isLetter(charTextToEncrypt)) {
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

    public static String inputUser (String textUser, String message, Scanner scanner, char charTextUser) {

        do {
            System.out.print(message);
            textUser = scanner.nextLine().toLowerCase();
            for (int indexTextUser = 0; indexTextUser < textUser.length(); indexTextUser++) {
                charTextUser = textUser.charAt(indexTextUser);
            }

        }while (!Character.isLetter(charTextUser));

        return textUser;
    }
}



