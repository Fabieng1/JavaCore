package javacore.chapter01.variable.exercise;

public class FirstOperations {

    public static void main (String[] args) {

        int a = 10;
        int b = 2;
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        System.out.println("La somme de " + a + " + " + b + " est égale à : " + sum);
        System.out.println("La soustraction de " + a + " - " + b + " est égale à : " + subtraction);
        System.out.println("Le produit de " + a + " x " + b + " est égale à : " + multiplication);
        System.out.println("La division de " + a + " / " + b + " est égale à : " + division);

    }

}
