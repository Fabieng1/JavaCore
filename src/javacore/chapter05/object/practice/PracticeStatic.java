package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeStatic {

    public static void main (String[] args) {

        PracticeStaticCar car1 = new PracticeStaticCar("Ferrari", "F458", 260000);
        PracticeStaticCar car2 = new PracticeStaticCar("Ford", "Mustang", 120000);

        System.out.println("Nombres de voitures créées : " + PracticeStaticCar.carCounter);

        // Scanner scanner = new Scanner(System.in);

        System.out.println("Résltat de 5 + 2 : " + PracticeStaticCalculator.sum(5, 2));
    }
}
