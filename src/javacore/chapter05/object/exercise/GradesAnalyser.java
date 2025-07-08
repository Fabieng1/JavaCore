package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyser {

    public static void main(String[] args) {

        int numberGrade;
        int indexGrade;

        double averageMain;

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
        double grabesAboveMain = getGradeCountBetweenRange(grade, 10);

        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("Votre note minumum est " + gradeMinimal);
        System.out.println("Votre note maximal est " + gradeMaximal);
        System.out.println("Vous avez " + grabesAboveMain + " note(s) au dessus de 10");
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

    public static double getGradeCountBetweenRange(double[] gradeArray, int threshold) {

        double above = 0;

        double[] gradesAboveThreshold = new double[threshold];

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
}