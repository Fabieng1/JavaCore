package javacore.chapter01.variable.exercise;

public class FirstInstructions {

    public static void main (String[] args) {

        int age = 37;
        String displayAge = "J'ai " + age + " ans.";
        String firstName = "Fabien";
        String displayFirstName = "Je m'appelle " + firstName + ". ";

        System.out.println(age);

        System.out.println("J'ai " + age + " ans.");
        System.out.println(displayAge);
        System.out.println(firstName);
        System.out.println(displayFirstName + displayAge);
    }

}
