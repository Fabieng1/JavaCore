package javacore.chapter05.object.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class GradesAnalyzerV2 {

    public static void main(String[] args) {

        String stopOrAgain;

        int numberGrade = 1;
        int indexGrade = 0;
        ArrayList<Double> gradeArray = new ArrayList<>();

        double[] inputUserGrade;

        double averageMain;

        boolean done = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Entrez une note : ");
            gradeArray.add(scanner.nextDouble());

            scanner.nextLine();

            System.out.print("Souhaitez-vous continuer ? Oui/Non ");
            stopOrAgain = scanner.nextLine().toLowerCase();

            if (stopOrAgain.equalsIgnoreCase("non")) {
                done = false;
                for (int displayGrades = 0; displayGrades < gradeArray.size(); displayGrades++) {

                    // Affichage du tableau à - 1. Reste que le tableau à une donnée de plus que nécessaire
                    // Doit afficher le contenu du tableau
                    System.out.println("Tableau de notes : " + gradeArray);
                }

            }
            indexGrade++;
        } while (done);

        averageMain = getAverage(gradeArray.get(indexGrade - 1));

        for (int indexGradeMinimal = 0; indexGradeMinimal < gradeArray.size(); indexGradeMinimal++) {
            ArrayList<Double> gradesMinimal = getMinGrades(gradeArray);
        }
        ArrayList<Double> gradesMinimal = getMinGrades(gradeArray);
        ArrayList<Double> gradeMaximal = getMaxGrades(gradeArray);
        Double gradesAboveMain = getGradeCountAboveThreshold(gradeArray, 10.0);
        ArrayList<Double> gradesFromTo = getGradesCountBetweenRange(gradeArray, 10, 20);

        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("Votre note minumum est " + gradesMinimal);
        System.out.println("Votre note maximal est " + gradeMaximal);
        System.out.println("Vous avez " + gradesAboveMain + " note(s) au dessus de 10");
        System.out.println("Nombre total de notes: " + gradesFromTo);
    }

    public static double getAverage (double gradesArray) {

        double average;

        double sumGrades = 0.0;

        for (int indexGrades = 0; indexGrades < gradesArray; indexGrades++) {
            sumGrades = sumGrades + gradesArray;
        }

        average = sumGrades / gradesArray;

        return average;
    }

    public static ArrayList<Double> getMinGrades(ArrayList<Double> gradesArray) {

        ArrayList<Double> gradesMin = new ArrayList<>();
        gradesMin.add(20.0);
        for (int indexGrades = 0; indexGrades < gradesArray.size(); indexGrades++) {

            if (gradesArray.get(indexGrades) < gradesMin.get(indexGrades)) {
                gradesMin = gradesArray;
            }
        }
        return gradesMin;
    }

    public static ArrayList<Double> getMaxGrades(ArrayList<Double> gradesArray) {

        ArrayList<Double> gradesMax = new ArrayList<>();
        gradesMax.add(0.0);

        for (int indexGrades = 0; indexGrades < gradesArray.size(); indexGrades++) {

            if (gradesArray.get(indexGrades) > gradesMax.get(indexGrades)) {
                gradesMax.set(indexGrades, gradesMax.get(indexGrades));
            }
        }
        return gradesMax;
    }

    public static Double getGradeCountAboveThreshold(ArrayList<Double> gradesArray, Double threshold) {

        double above = 0;

        double[] gradesAboveThreshold;
        for (int indexGrades = 0; indexGrades < gradesArray.size(); indexGrades++) {

            if (gradesArray.get(indexGrades) > threshold) {

                gradesAboveThreshold = new double[] {gradesArray.get(indexGrades)};
                above++;
            }
        }

        double percentage = (above / gradesArray.size()) * 100;

        System.out.println("Cela représente " + percentage + "%");

        return above;
    }

    public static ArrayList<Double> getGradesCountBetweenRange(ArrayList<Double> gradesArray, double from, double to) {
;;
        int indexGrades = 0;

        ArrayList<Double> above = new ArrayList<>();
        above.add(0.0);

        double sum = above.get(0);
        sum++;
        above.set(0, sum);

        int count0to5 = 0;
        int count6to10 = 0;
        int count11to15 = 0;
        int count16to20 = 0;
        int countFromTo = 0;

        for (int indexContainsGrades = 0; indexContainsGrades < gradesArray.size(); indexContainsGrades++) {
            if (gradesArray.get(indexGrades) >= from) {
                countFromTo++;
            }
        }


        for (indexGrades = 0; indexGrades < gradesArray.size(); indexGrades++) {



            if (gradesArray.get(indexGrades) >= from) {
                countFromTo++;
            }

            if (gradesArray.get(indexGrades) <= 5) {
                count0to5++;
            }
            else if (gradesArray.get(indexGrades) <= 10) {
                count6to10++;
            }
            else if (gradesArray.get(indexGrades) <= 15) {
                count11to15++;
            }
            else if (gradesArray.get(indexGrades) <= 20) {
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