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


            System.out.print("Combien font 5 / 2 ?");
            float division = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Dans quelle ville habitez-vous ?");
            String city = scanner.nextLine();

            System.out.print("Quel est votre code postal ?");
            int postalCode = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Souhaitez-vous continuer ? Oui/Non");
            String reponse = scanner.nextLine();

            if (reponse.toLowerCase().equals("non")) {
                continuer = false;
                System.out.println("Prénom : " + prenom);
                System.out.println("Age : " + age);
                System.out.println("Résultat de la division : " + division);
                System.out.println("Ville : " + city);
                System.out.println("Code Postal : " + postalCode);

            }



        }

    }
}









