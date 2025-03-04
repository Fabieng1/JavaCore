package javacore.chapter03.loop.exercice;

public class AlphabetPrinter {

    public static void main (String[] args) {

        char letter = 'A';
        char lettresMinuscules = 'a';

        while (letter <= 90) {

            System.out.print(letter + " ");
            letter++;

        }
        while (lettresMinuscules >= 97 && lettresMinuscules <= 122) {

            System.out.print(lettresMinuscules + " ");
            lettresMinuscules++;
        }

        System.out.println(letter = 97);

    }

}
