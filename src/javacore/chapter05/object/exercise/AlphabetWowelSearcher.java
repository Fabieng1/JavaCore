package javacore.chapter05.object.exercise;

public class AlphabetWowelSearcher {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        for (int indexVowel = 0; indexVowel < vowels.length(); indexVowel++) {
            char charVoyel = vowels.charAt(indexVowel);
            for (int indexAlphabet = 0; indexAlphabet < alphabet.length(); indexAlphabet++) {
                char charAlphabet = alphabet.charAt(indexAlphabet);

                if (charVoyel == charAlphabet) {
                    System.out.println(charVoyel + " est à la position : " + alphabet.indexOf(charVoyel));
                }
            }
        }
    }
}
