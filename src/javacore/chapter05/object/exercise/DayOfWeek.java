package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day;

        do {
            System.out.print("Quel jour de la semaine sommes-nous ?");
            day = sc.nextLine().trim();
        } while(!day.equalsIgnoreCase("Lundi") && !day.equalsIgnoreCase("Mardi") && !day.equalsIgnoreCase("Mercredi") && !day.equalsIgnoreCase("Jeudi") && !day.equalsIgnoreCase("Vendredi") && !day.equalsIgnoreCase("SamediS") && !day.equalsIgnoreCase("Dimanche"));

        System.out.println("Merci de m'avoir informer que nous étions " + day);

        System.out.println("Fin de programme");
    }
}
