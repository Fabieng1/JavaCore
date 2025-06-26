package javacore.chapter05.object.exercise;

public class Tests {

    public static void main (String[] args) {
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncrypt = "";

        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';
        Character charTextToEncrypt;

        int numberIteration = 3;

        for (int cipherIteration = 0; cipherIteration < numberIteration; cipherIteration++) {
            textEncrypt = "";
            for (int charCurrentTexTotEncrypt = 0; charCurrentTexTotEncrypt < textToEncrypt.length(); charCurrentTexTotEncrypt++) {
                charTextToEncrypt = textToEncrypt.charAt(charCurrentTexTotEncrypt);

                if (Character.isLetter(charTextToEncrypt)) {
                    char charLower = textToEncrypt.charAt(charCurrentTexTotEncrypt);
                    int index = latinAlphabet.indexOf(charLower);

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
        System.out.println(textEncrypt);
    }
}
