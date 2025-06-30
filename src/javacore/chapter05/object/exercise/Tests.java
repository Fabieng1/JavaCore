package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class Tests {

    public static void main (String[] args) {
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "";
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncrypt = "";

        char charLatinAlphabet = ' ';
        char charSubstitionAlphabet = ' ';
        Character charTextToEncrypt;

        int numberIteration = 3;
        int charCurrentInputUser = 0;


        Scanner scanner = new Scanner(System.in);

        String inputUser = "";

        char charInputUser = ' ';

        int intDuplicate = 0;
        int charCurrentLatinAlphabet = 0;
        do {

            System.out.print("Veuillez entrez l'alphabet de subtitution souhaité : ");
            inputUser = scanner.nextLine();

            for (charCurrentInputUser = 0; charCurrentInputUser < inputUser.length(); charCurrentInputUser++) {

                charInputUser = inputUser.charAt(charCurrentInputUser);


            }

        }while (inputUser.length() != 26);

        substitutionAlphabet = inputUser;


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
