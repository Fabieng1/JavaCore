package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class UserQuestionnaire {

    String name;
    String city;

    int postalCode;
    int age;

    float resultDivision;

    boolean continuer;

    public UserQuestionnaire(String name, String city, int age, int postalCode, float resultDivision) {
        this.name = name;
        this.city = city;

        this.age = age;
        this.postalCode = postalCode;

        this.resultDivision = resultDivision;
    }
    public static void main(String[] args) {
        String prenom = "";
        String ville = "";
        String response = "";

        int age = 0;
        int postalCode = 0;

        float resultDivision = 0.0f;
        UserQuestionnaire userQuestionnaire = new UserQuestionnaire(prenom, ville, age, postalCode, resultDivision);

        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {

            System.out.print("Quel est votre prénom ?");
            userQuestionnaire.name = scanner.nextLine();

            System.out.print("Quel est votre âge ?");
            userQuestionnaire.age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Combien font 5 / 2 ?");
            userQuestionnaire.resultDivision = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Dans quelle ville habitez-vous ?");
            userQuestionnaire.city = scanner.nextLine();

            System.out.print("Quel est votre code postal ?");
            userQuestionnaire.postalCode = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Souhaitez-vous continuer ? Oui/Non");
            response = scanner.nextLine();

            if (response.toLowerCase().equals("non")) {
                continuer = false;
                userQuestionnaire.displayInformation(userQuestionnaire);
            }
        }
    }



    public void displayInformation(UserQuestionnaire object) {
        continuer = false;
        System.out.println("Prénom : " + name);
        System.out.println("Age : " + object.age);
        System.out.println("Résultat de la division : " + object.resultDivision);
        System.out.println("Ville : " + city);
        System.out.println("Code Postal : " + object.postalCode);


    }
}









