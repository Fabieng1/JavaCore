package javacore.chapter02.condition.exercise;

public class ConditionError {


    public static void main(String[] args) {

        int age = 100;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        else if(age < 60) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

        /* Le compilateur a pris la première condition répondant au critère
           Dans (age > 18), 80 est bien supérieur à 18 tous comme (age > 60 && age < 100),
           mais (age > 18) arrivant étant tester en premier dans l'ordre d'execution,
           c'est celui-ci qui est retenu


         */

    }

}
