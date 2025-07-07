package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyser {

    public static void main(String[] args) {

        int numberGrade;

        double indexGrade;
        double averageMain;
        double gradeMinMain = 0.0;

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

        int[] grade = new int[numberGrade];

        for (indexGrade = 0; indexGrade < grade.length; indexGrade++) {
            do {
                if (grade[(int)indexGrade] < 0 || grade[(int)indexGrade] > 20) {
                    System.out.println("Votre note doit aller de 0 à 20");
                }
                System.out.print("Entrez une note : ");
                grade[(int)indexGrade] = scanner.nextInt();
            } while (grade[(int)indexGrade] < 0.0 || grade[(int)indexGrade] > 20.0);
        }

        averageMain = getAverage(grade, numberGrade);

        double gradeMinimal = getMinGrades(grade, gradeMinMain);



        System.out.println("Votre moyenne générale est de " + averageMain);
        System.out.println("La plus petite note est " + gradeMinimal);
    }

    public static double getAverage(int[] gradesArray, int numberGrades) {

        double average;

        int sumGrades = 0;

        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            sumGrades = sumGrades + gradesArray[indexGrades];
        }

        average = (double) sumGrades / numberGrades;

        return average;
    }

    public static double getMinGrades(int[] gradesArray, double gradesMin) {


        for (int indexGrades = 0; indexGrades < gradesArray.length; indexGrades++) {

            if (gradesArray[indexGrades] < gradesMin) {
                gradesMin = gradesArray[indexGrades];
            }
        }
        return gradesMin;
    }
}