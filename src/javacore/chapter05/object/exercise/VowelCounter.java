package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String vowels = "aAeEiIoOuUyY";

        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        int counterY = 0;

        int totalVowels = 0;

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Entrez le texte dont vous souhaitez compter les voyelles : ");
        String userText = scanner.nextLine();*/




        for (int indexVowel = 0; indexVowel < vowels.length(); indexVowel++) {
            Character charVowels = vowels.charAt(indexVowel);
            int index = 0;
            while ((index = loremIpsum.indexOf(charVowels, index)) != -1) {
                switch (charVowels) {


                    case 'a':
                    case 'A':
                        counterA++;
                        break;

                    case 'e':
                    case 'E':
                        counterE++;
                        break;

                    case 'i':
                    case 'I':
                        counterI++;
                        break;

                    case 'o':
                    case 'O':
                        counterO++;
                        break;

                    case 'u':
                    case 'U':
                        counterU++;
                        break;

                    case 'y':
                    case 'Y':

                        counterY++;
                        break;
                }
                index++;
            }




        }

        System.out.println("Nombre de A : " + counterA);
        System.out.println("Nombre de E : " + counterE);
        System.out.println("Nombre de I : " + counterI);
        System.out.println("Nombre de O : " + counterO);
        System.out.println("Nombre de U : " + counterU);
        System.out.println("Nombre de Y : " + counterY);

        totalVowels = counterA + counterE + counterI + counterO + counterU + counterY;

        System.out.println("Nombre total de voyelles : " + totalVowels);
        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    }
}
