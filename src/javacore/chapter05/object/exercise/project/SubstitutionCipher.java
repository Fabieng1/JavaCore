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

        /*
         * Initialisation de l'alphabet et de l'alphabet de substitution vide pour accueillir celui de l'utilisateur
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String substitutionAlphabet = "";

        /*
         * Création de l'objet cipher
         */
        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);

        /*
         * Création et initialisation à vide des variables à accueilir le texte de l'utilisateur, le texte à encrypter, et le texte une fois encrypter
         */
        String textToEncrypt = "";
        String textEncrypt = "";
        String textUser = "";


        /*
         * Création et initialisation des variables servant à acceuillir charactères par charactère les textes saisies par l'utilisateur
         */
        char charSubstitionAlphabet = ' ';
        char charLatinAlphabet = ' ';

        /*
         * Créarion du Scanner
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * Boucle servant à vérifier que la saisie de l'alphabet de substitution par l'utilisateur réponde bien à certains critères
         */
        do {
            // Est-ce l'alphabet de substitution de l'utilisateur comporte bien 26 lettres
            cipher.substitutionAlphabet = inputUser(textUser, "Entrez l'alphabet de substitution souhaité : ", scanner);
            if (cipher.substitutionAlphabet.length() != 26) {
                System.out.println("Votre alphabet ne contient pas 26 charactères ou contient des charactères non autorisé. Veuillez le ressaisir : ");
            }

            for (int indexSubstitutionAlphabet = 0; indexSubstitutionAlphabet < cipher.substitutionAlphabet.length(); indexSubstitutionAlphabet++) {

                charSubstitionAlphabet = cipher.substitutionAlphabet.charAt(indexSubstitutionAlphabet);

                //Est-ce l'alphabet de substitution de l'utilisateur n'a pas de lettres en double ou de chiffres
                if (cipher.substitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.substitutionAlphabet.matches(".*\\d.*")) {
                    System.out.println("Charactère double ou présence de chiffre. Veuillez re-saisir l'alphabet de substitution : ");
                    break;
                }
            }
            // Continue tant que l'alphabet de substitution ne comporte pas 26 lettres, sans doublons, ni chiffres
        }while (cipher.substitutionAlphabet.length() != 26 || cipher.substitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.substitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.substitutionAlphabet.matches(".*\\d.*"));

        // Méthode demandant le texte à crypter à l'utilisateur. Son renvoie est stocker dans la variable textUser
        textUser = inputUser(textUser, "Entrez le texte à crypter : ", scanner);

        // textUser est stocké dans textToEncrypt
        textToEncrypt = textUser;

        // textToEncrypt est chiffré grace à la méthode chipherMethod et le résultat est stocké dans textEncypt
        textEncrypt = cipher.cipherMethod(textToEncrypt, 3);

        // Le text chiffré est affiché
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

