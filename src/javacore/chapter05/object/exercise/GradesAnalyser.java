package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyser {

    public static void main(String[] args) {

        int numberGrade = 0;
        int indexGrade = 0;

        double averageMain;
        double[] from = new double[indexGrade];
        double[] to = new double[indexGrade];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Combien de notes souhaitez-vous entrez ?");
            numberGrade = scanner.nextInt();

            if (numberGrade < 2.0) {
                System.out.println("Nombre minimum 2");
            }
            else if (numberGrade > 30.0) {
                System.out.println("Nombre maximal 30");
            }

        } while (numberGrade < 2.0 || numberGrade > 30.0);

        double[] grade = new double[numberGrade];

        for (indexGrade = 0; indexGrade < grade.length; indexGrade++) {
            do {
                if (grade[indexGrade] < 0.0 || grade[indexGrade] > 20.0) {
                    System.out.println("Votre note doit aller de 0 à 20");
                }
                System.out.print("Entrez une note : ");
                grade[indexGrade] = scanner.nextDouble();
            } while (grade[indexGrade] < 0.0 || grade[indexGrade] > 20.0);
        }

        averageMain = getAverage(grade, numberGrade);

        double gradeMinimal = getMinGrades(grade);
        double gradeMaximal = getMaxGrades(grade);
        double grabesAboveMain = getGradeCountAboveThreshold(grade, 10, numberGrade);
        double gradesFromTo = getGradeCountBetweenRange(grade, from, to, numberGrade);

        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("Votre note minumum est " + gradeMinimal);
        System.out.println("Votre note maximal est " + gradeMaximal);
        System.out.println("Vous avez " + grabesAboveMain + " note(s) au dessus de 10");
        System.out.println("fromTo : " + gradesFromTo);
    }

    public static double getAverage(double[] gradesArray, double numberGrades) {

        double average;

        double sumGrades = 0.0;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            sumGrades = sumGrades + gradesArray[indexGrades];
        }

        average = sumGrades / numberGrades;

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
    public static double getGradeCountAboveThreshold(double[] gradeArray, int threshold, int numberGrades) {

        double above = 0;

        double[] gradesAboveThreshold = new double[numberGrades];

        for (int indexGrades = 0; indexGrades < gradeArray.length; indexGrades++) {

            if (gradeArray[indexGrades] > threshold) {
                gradesAboveThreshold = new double[]{gradeArray[indexGrades]};
                above++;
            }
        }

        double percentage = (above / gradeArray.length) * 100;

        System.out.println("Cela représente " + percentage + "%");

        return above;
    }

    public static double getGradeCountBetweenRange(double[] gradesArray, double[] from, double[] to, int numberGradesStudent) {

        double[] numberGrades = new double[numberGradesStudent];

        int count0to5 = 0;
        int count6to10 = 0;
        int count11to15 = 0;
        int count16to20 = 0;
        int countGeneralsGrades = count0to5 + count6to10 + count11to15 + count16to20;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {
            numberGrades = new double[]{};

            if (numberGrades[indexGrades] <= 5) {
                count0to5++;
            }
            else if (numberGrades[indexGrades] <= 10) {
                count6to10++;
            }
            else if (numberGrades[indexGrades] <= 15) {
                count11to15++;
            }
            else if (numberGrades[indexGrades] <= 20) {
                count16to20++;
            }
        }
        return numberGradesStudent;
    }
}