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

        textEncrypt = textToEncrypt;
        for (int currentLatinAlphabet = 0; currentLatinAlphabet < latinAlphabet.length(); currentLatinAlphabet++) {
            charLatinAlphabet = latinAlphabet.charAt(currentLatinAlphabet);
            textEncrypt = textEncrypt.replaceAll(String.valueOf(charLatinAlphabet), String.valueOf(charLatinAlphabet + 13));
        }
        System.out.println(textEncrypt);
    }
}
