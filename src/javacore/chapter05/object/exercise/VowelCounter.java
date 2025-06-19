package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String vowelsA = "aàáâãäåæAÀÁÂÃÄÅÆ";
        String vowelsE = "eèéêëEÈÉÊË";
        String vowelsI = "iìíîïIÌÍÎÏ";
        String vowelsO = "oòóôõöœOÒÓÔÕÖŒ";
        String vowelsU = "uùúûüUÙÚÛÜ";
        String vowelsY = "yýÿYÝŸ";

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

        for (int indexLoremIpsum = 0; indexLoremIpsum < loremIpsum.length(); indexLoremIpsum++) {
            Character charLoremIpsum = loremIpsum.charAt(indexLoremIpsum);

            if (vowelsA.indexOf(charLoremIpsum, 5) != -1) {
                counterA++;
            }

            if (vowelsE.indexOf(charLoremIpsum, 10) != -1) {
                counterE++;
            }

            if (vowelsI.indexOf(charLoremIpsum, 2) != -1) {
                counterI++;
            }

            if (vowelsO.indexOf(charLoremIpsum, 15) != -1) {
                counterO++;
            }

            if (vowelsU.indexOf(charLoremIpsum, 20) != -1) {
                counterU++;
            }

            if (vowelsY.indexOf(charLoremIpsum, 25) != -1) {
                counterY++;
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
