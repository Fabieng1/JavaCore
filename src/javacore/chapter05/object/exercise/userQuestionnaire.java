package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class userQuestionnaire {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        boolean continuer = true;

        while (continuer) {

            System.out.print("Quel est votre prénom ?");
            String prenom = scanner.nextLine();

            System.out.print("Quel est votre âge ?");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Souhaitez-vous continuer ? Oui/Non");
            String reponse = scanner.nextLine();

            if (reponse.toLowerCase().equals("non")) {
                continuer = false;
                System.out.println("Prénom : " + prenom);
                System.out.println("Age : " + age);
            }



        }

    }
}









