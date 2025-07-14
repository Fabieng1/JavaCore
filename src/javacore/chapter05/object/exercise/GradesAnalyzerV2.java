package javacore.chapter05.object.exercise;

import java.util.Locale;
import java.util.Scanner;

public class GradesAnalyzerV2 {

    public static void main(String[] args) {

        String stopOrAgain;

        int numberGrade = 1;
        int indexGrade = 0;
        double[] gradesArray = new double[1];
        double[] inputUserGrade;

        double averageMain;

        boolean done = true;

        Scanner scanner = new Scanner(System.in);

        do {
            for (int indexInputGrades = 0; indexInputGrades < gradesArray.length; indexInputGrades++) {
                System.out.print("Entrez une note : ");
                gradesArray[indexGrade] = gradesArray[indexGrade] + scanner.nextDouble();
                scanner.nextLine();
            }

            System.out.print("Souhaitez-vous continuer ? Oui/Non ");
            stopOrAgain = scanner.nextLine().toLowerCase();

            if (stopOrAgain.equalsIgnoreCase("non")) {
                done = false;
                for (int displayGrades = 0; displayGrades < gradesArray.length; displayGrades++) {

                    // Affichage du tableau à - 1. Reste que le tableau à une donnée de plus que nécessaire
                    // Doit afficher le contenu du tableau
                    System.out.println("Tableau de notes : " + gradesArray[displayGrades]);
                }

            }
            else if (stopOrAgain.equalsIgnoreCase("oui")) {
                gradesArray = new double[numberGrade++];
            }
            indexGrade++;
        } while (done);

        averageMain = getAverage(gradesArray);

        double gradeMinimal = getMinGrades(gradesArray);
        double gradeMaximal = getMaxGrades(gradesArray);
        double grabesAboveMain = getGradeCountAboveThreshold(gradesArray, 10);
        double gradesFromTo = getGradesCountBetweenRange(gradesArray, 10, 20);

        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("Votre note minumum est " + gradeMinimal);
        System.out.println("Votre note maximal est " + gradeMaximal);
        System.out.println("Vous avez " + grabesAboveMain + " note(s) au dessus de 10");
        System.out.println("Nombre total de notes: " + gradesFromTo);
    }

    public static double getAverage(double[] gradesArray) {

        double average;

        double sumGrades = 0.0;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            sumGrades = sumGrades + gradesArray[indexGrades];
        }

        average = sumGrades / gradesArray.length;

        return average;
    }

    public static double getMinGrades(double[] gradesArray) {

        double gradesMin = 20.0;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            if (gradesArray[indexGrades] < gradesMin) {
                gradesMin = gradesArray[indexGrades];
            }
        }
        return gradesMin;
    }

    public static double getMaxGrades(double[] gradesArray) {

        double gradeMax = 0.0;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            if (gradesArray[indexGrades] > gradeMax) {
                gradeMax = gradesArray[indexGrades];
            }
        }
        return gradeMax;
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

    public static double getGradesCountBetweenRange(double[] gradesArray, double from, double to) {

        int indexGrades = 0;

        int count0to5 = 0;
        int count6to10 = 0;
        int count11to15 = 0;
        int count16to20 = 0;
        int countFromTo = 0;

        for (indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            if (gradesArray[indexGrades] >= from) {
                countFromTo++;
            }



            if (gradesArray[indexGrades] <= 5) {
                count0to5++;
            }
            else if (gradesArray[indexGrades] <= 10) {
                count6to10++;
            }
            else if (gradesArray[indexGrades] <= 15) {
                count11to15++;
            }
            else if (gradesArray[indexGrades] <= 20) {
                count16to20++;
            }
        }

        System.out.println("Nombre de notes entre 0 et 5 est " + count0to5);
        System.out.println("Nombre de note entre 6 et 10 est " + count6to10);
        System.out.println("Nombre de note entre 11 et 15 est " + count11to15);
        System.out.println("Nombre de note entre 16 et 20 est " + count16to20);

        System.out.println("Notes de 10 à 20 : " + countFromTo);
        return gradesArray.length;
    }
}