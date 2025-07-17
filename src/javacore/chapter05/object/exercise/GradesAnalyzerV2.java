package javacore.chapter05.object.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class GradesAnalyzerV2 {

    public static void main(String[] args) {

        String stopOrAgain;

        double[] gradesTab = {};

        int indexGrade = 0;

        double averageMain;

        boolean done = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Entrez une note : ");
            int newGrades = scanner.nextInt();
            scanner.nextLine();

            double[] tempTab = new double[gradesTab.length + 1];

            for (int indexTab = 0; indexTab < gradesTab.length; indexTab++) {
                tempTab[indexTab] = (int) gradesTab[indexTab];
            }

            tempTab[gradesTab.length] = newGrades;

            gradesTab = tempTab;

            System.out.print("Souhaitez-vous continuer ? Oui/Non ");
            stopOrAgain = scanner.nextLine().toLowerCase().trim();

            if (stopOrAgain.equals("non")) {
                done = false;
                for (int displayGrades = 0; displayGrades < gradesTab.length; displayGrades++) {

                    // Affichage du tableau à - 1. Reste que le tableau à une donnée de plus que nécessaire
                    // Doit afficher le contenu du tableau
                    System.out.println("Tableau de notes : " + gradesTab[displayGrades]);
                }

            }
            indexGrade++;
        } while (done);

        averageMain = getAverage(gradesTab);

        for (int indexGradeMinimal = 0; indexGradeMinimal < gradesTab.length; indexGradeMinimal++) {
            double gradesMinimal = getMinGrades(gradesTab);
        }
        double gradesMinimal = getMinGrades(gradesTab);
        double gradeMaximal = getMaxGrades(gradesTab);
        double gradesAboveMain = getGradeCountAboveThreshold(gradesTab, 10);
        double gradesFromTo = getGradesCountBetweenRange(gradesTab, 10, 20);

        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("Votre note minumum est " + gradesMinimal);
        System.out.println("Votre note maximal est " + gradeMaximal);
        System.out.println("Vous avez " + gradesAboveMain + " note(s) au dessus de 10");
        System.out.println("Le nombre de notes au dessus de votre choix est de " + gradesFromTo);
    }

    public static double getAverage (double[] gradesTab) {

        double average = 0.0;

        double sumGrades = 0.0;

        for (int indexGrades = 0; indexGrades < gradesTab.length; indexGrades++) {

            sumGrades = sumGrades + gradesTab[indexGrades];
        }

        average = sumGrades / gradesTab.length;

        return average;
    }

    public static double getMinGrades(double[] gradesTab) {

        double gradesMin = 20;

        for (int indexGrades = 0; indexGrades < gradesTab.length; indexGrades++) {

            if (gradesTab[indexGrades] < gradesMin) {
                gradesMin = gradesTab[indexGrades];
            }
        }
        return gradesMin;
    }

    public static double getMaxGrades(double[] gradesTab) {

        double gradesMax = 0;

        for (int indexGrades = 0; indexGrades < gradesTab.length; indexGrades++) {

            if (gradesTab[indexGrades] > gradesMax) {
                gradesMax = gradesTab[indexGrades];
            }
        }
        return gradesMax;
    }

    public static double getGradeCountAboveThreshold(double[] gradesArray, int threshold) {

        double above = 0;

        double[] gradesAboveThreshold = new double[gradesArray.length];

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            if (gradesArray[indexGrades] > threshold) {
                gradesAboveThreshold = new double[]{gradesArray[indexGrades]};
                above++;
            }
        }

        double percentage = (above / gradesArray.length) * 100;

        System.out.println("Cela représente " + percentage + "%");

        return above;
    }

    public static double getGradesCountBetweenRange(double[] gradesTab, int from, double to) {

        int indexGrades = 0;

        int above = 0;

        int count0to5 = 0;
        int count6to10 = 0;
        int count11to15 = 0;
        int count16to20 = 0;
        int countFromTo = 0;

        for (int indexContainsGrades = 0; indexContainsGrades < gradesTab.length; indexContainsGrades++) {
            if (gradesTab[indexContainsGrades] > from) {
                above++;
            }
        }

        for (indexGrades = 0; indexGrades < gradesTab.length; indexGrades++) {

            if (gradesTab[indexGrades] > from) {
                countFromTo++;
            }

            if (gradesTab[indexGrades] <= 5) {
                count0to5++;
            }
            else if (gradesTab[indexGrades] <= 10) {
                count6to10++;
            }
            else if (gradesTab[indexGrades] <= 15) {
                count11to15++;
            }
            else if (gradesTab[indexGrades] <= 20) {
                count16to20++;
            }
        }

        System.out.println("Nombre de notes entre 0 et 5 est " + count0to5);
        System.out.println("Nombre de note entre 6 et 10 est " + count6to10);
        System.out.println("Nombre de note entre 11 et 15 est " + count11to15);
        System.out.println("Nombre de note entre 16 et 20 est " + count16to20);

        System.out.println("Notes de 10 à 20 : " + countFromTo);

        return above;
    }
}