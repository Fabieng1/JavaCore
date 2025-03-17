package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcher {

    public static void main(String[] args) {

        int number = 10;

        boolean isPrime = true;

        for (int i = 2; i < number; i++) { // Je veux aller de 2 à 100
            for (int potentialDivisor = 2; potentialDivisor <= i; potentialDivisor++) { // Tant que i est inférieur à number, on augmente de 1 le diviseur

                int resultatsDivision = i / potentialDivisor;
                System.out.println("Résultats de la division " + i + " / " + potentialDivisor + " = " + resultatsDivision);
                int reste = i % potentialDivisor;
                System.out.println("Reste de la division " + reste);
                System.out.println();

                if (reste == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime == true) {

            System.out.println (number + " est premier");
        }
        else {
            System.out.println(number + " n'est pas un nombre premier");
        }

    }
}
