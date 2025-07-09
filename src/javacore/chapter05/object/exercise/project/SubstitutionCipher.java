package javacore.chapter05.object.exercise.project;

import java.util.Scanner;

public class SubstitutionCipher {

    String defaultAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String userSubstitutionAlphabet = "";
    String textToEncrypt = "";
    String textEncrypt = "";
    String textUser = "";

    public SubstitutionCipher (String alphabet, String userSubstitutionAlphabet) {

        this.defaultAlphabet = alphabet;
        this.userSubstitutionAlphabet = cipherMethod(textToEncrypt, 3);
    }
    public static void main(String[] args) {
        /*
        * Création et initialisation des variables stockant l'alphabet ainsi que l'alphabet de substitution fourni par l'utilisateur
         */
        String defaultAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String userSubstitutionAlphabet = "";

        /*
        * Création de l'objet cipher avec en paramètre l'alphabet ainsi que l'alphabet de substitution fourni par l'utilisateur
         */
        SubstitutionCipher cipher = new SubstitutionCipher(defaultAlphabet, userSubstitutionAlphabet);

        /*
        * Création et initialisation des variable devant stocker le texte à encrypter, le texte crypter et le texte que souhaite crypter l'utilisateur
         */
        String textToEncrypt = "";
        String textEncrypt = "";
        String textUser = "";

        /*
        * Création et initialisation des des variables devant stocker chaque charactère devant être crypter pour vérification
         */
        char charSubstitionAlphabet = ' ';
        char charLatinAlphabet = ' ';

        /*
        * Création du scanner
         */
        Scanner scanner = new Scanner(System.in);

        /*
        * Boucle devant vérifier si le nombre de charactère est correct, ne contient pas de doublons, ni de chiffres
         */
        do {
            // Demande via la méthode inputUser d'entrer l'alphabet de substitution et le stock dans la variable d'instance substitionAlphabet
            cipher.userSubstitutionAlphabet = inputUser(textUser, "Entrez l'alphabet de substitution souhaité : ", scanner);

            // Affiche un message si l'alphabet de substition n'est pas égale à 26
            if (cipher.userSubstitutionAlphabet.length() != 26) {
                System.out.println("Votre alphabet ne contient pas 26 charactères ou contient des charactères non autorisé. Veuillez le ressaisir : ");
            }

            for (int indexSubstitutionAlphabet = 0; indexSubstitutionAlphabet < cipher.userSubstitutionAlphabet.length(); indexSubstitutionAlphabet++) {

                // Passe chaque charactère dans la variable charSubstitutioAlphabet
                charSubstitionAlphabet = cipher.userSubstitutionAlphabet.charAt(indexSubstitutionAlphabet);

                // Affiche un message si un charactère est en double que c'est un chiffre
                if (cipher.userSubstitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.userSubstitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.userSubstitutionAlphabet.matches(".*\\d.*")) { // Vérifie si un charactère est en double ou pas, si oui, demande une nouvelle saisie
                    System.out.println("Charactère double ou présence de chiffre. Veuillez re-saisir l'alphabet de substitution : ");
                    break;
                }
            }
        // Booucle tant que l'alphabet de substituin n'est pas égale à 26 ou qu'un charactère est en double ou qu'il contient un chiffre
        }while (cipher.userSubstitutionAlphabet.length() != 26 || cipher.userSubstitutionAlphabet.indexOf(charSubstitionAlphabet) != cipher.userSubstitutionAlphabet.lastIndexOf(charSubstitionAlphabet) || cipher.userSubstitutionAlphabet.matches(".*\\d.*"));

        // Demande à l'utilisateur d'entrer le texte qu'il souhaite crypter et stock sa réponse dans textUser
        textUser = inputUser(textUser, "Entrez le texte à crypter : ", scanner);

        //textUser est désormais stocker dans textToEncrypt
        textToEncrypt = textUser;

        // Le texte est crypté grace à la méthode cipherMethod, et son résultat est stocké dans textToEncrypt
        textToEncrypt = cipher.cipherMethod(textToEncrypt, 3);

        // Le texte encrypté est affiché
        System.out.println(textToEncrypt);
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
                        charSubstitionAlphabet = userSubstitutionAlphabet.charAt(index);
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

