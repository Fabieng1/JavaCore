package javacore.chapter05.object.exercise.project;

public class SubsitutionCipher {

    public static void main(String[] args) {

        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncrypt = "";

        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';
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


        textEncrypt = cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, 3);

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

    public static String cipher (String textToEncrypt, String alphabet, String substitutionAlphabet, int cipherIteration) {

        String textEncrypt = "";

        char charSubstitionAlphabet = ' ';
        Character charTextToEncrypt;

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
}



