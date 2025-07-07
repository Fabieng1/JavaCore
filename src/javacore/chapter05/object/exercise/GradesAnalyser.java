/*package javacore.chapter05.object.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAnalyser {

    private static int[] note ;

    public GradesAnalyser(int[] note) {

        this.note = note;

    }

    public static void main(String[] args) {

        int numberNote = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Combien de notes souhaitez-vous entrez ?");
            numberNote = scanner.nextInt();

            if (numberNote < 2) {
                System.out.println("Nombre minimum 2");
            }
            else if (numberNote > 30) {
                System.out.println("Nombre maximal 30");
            }

        } while (numberNote < 2 || numberNote > 30);

        int[] note = new int[numberNote];
        int indexNote = 0;

            for (indexNote = 0; indexNote < note.length; indexNote++) {
                do {
                    if (note[indexNote] < 0 || note[indexNote] > 20) {
                        System.out.println("Votre note doit aller de 0 à 20");
                    }
                    System.out.print("Entrez une note : ");
                    note[indexNote] = scanner.nextInt();
                } while (note[indexNote] < 0 || note[indexNote] > 20);
            }
    }

    public static double getAverage(int[] gradesArray) {
        
    }
}*/