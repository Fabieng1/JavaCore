package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main (String[] args) {

        int number = 20;
        long result = 1;

        if (number < 0) {
            System.out.println("Le nombre ne peut pas être négatif");
        }
        else if (number == 0) {
            System.out.println(result = 1);
        }
        else {

            while (number > 0) {

                result = result * number;
                number--;
            }

            System.out.println(result);
        }
        }


}
