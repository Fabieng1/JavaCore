package javacore.chapter05.object.practice;

public class PracticeVariableReference {

    public static void main (String[] args) {

        /**
         * Exemple variabl primitives
         */

        int age1 = 20;
        int age2 = age1;

        System.out.println("Premier âge : " + age1);
        System.out.println("Deuxième âges : " + age2);

        age2 = 35;

        System.out.println("Premier âge : " + age1);
        System.out.println("Deuxième âges : " + age2);

        afficherAge(age2);

        System.out.println("Troisième valeur d'age2" + age2);

        /**
         * Exemple variabl primitives
         */

        PracticeObjectCar car1 = new PracticeObjectCar("lfrkfev4516klvvl", "Ferrari", "F458", "Red", 1);
        PracticeObjectCar car2 = car1;

        System.out.println("Première valeur de cars1 : " + car1);
        System.out.println("Deuxième valeurs de  cars2 : " + car2);

        System.out.println("Première valeur de (Numéro de Série) cars1 : " + car1.serialNumber);
        System.out.println("Deuxième valeurs de (Numéro de Série) cars2 : " + car2.serialNumber);

        car2.serialNumber = "ABCDEF";

        System.out.println("Seconde valeur de (Numéro de Série) cars1 : " + car1.serialNumber);
        System.out.println("Seconde valeurs de (Numéro de Série) cars2 : " + car2.serialNumber);
    }

    public static void afficherAge(int age) {

        age = 40;

        System.out.println("Âge : " + age);
    }
}
