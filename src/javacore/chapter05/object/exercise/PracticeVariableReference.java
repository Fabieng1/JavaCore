package javacore.chapter05.object.exercise;

public class PracticeVariableReference {

    public static void main (String[] args) {

        int age1 = 20;
        int age2 = age1;

        System.out.println(age1);
        System.out.println(age2);

        age2 = 35;

        System.out.println(age1);
        System.out.println(age2);


    }
}
