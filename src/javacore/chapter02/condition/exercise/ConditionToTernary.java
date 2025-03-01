package javacore.chapter02.condition.exercise;

public class ConditionToTernary {


    public static void main(String[] args) {

        /**
         * Le code doit s'adapter aux différentes valeurs que vous mettrez à la variable age.
         */
        Integer age = 18;

        Integer pourcentageReduction = 0;

        /*
        Code à convertir en condition ternaire
        if (age < 18) {
            pourcentageReduction = 50;
        } else {
            pourcentageReduction = 10;
        }*/

       pourcentageReduction = age < 18 ? pourcentageReduction = 50 : pourcentageReduction = 10;

        System.out.println(pourcentageReduction);

        System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + " ans");

    }
}