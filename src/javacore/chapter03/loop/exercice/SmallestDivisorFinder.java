package javacore.chapter03.loop.exercice;

public class SmallestDivisorFinder {

    public static void main (String[] args) {

        // 10 / 2, 15 / 2, 20 / 2
        int number = 1225;
        int divisor = 2;
        int smallDivisor = 2;

        while (number % divisor != 0) {
            divisor++;
        }

        System.out.println("Le plus petit diviseur trouvé est : " + divisor);

    }

    // Question bonus non faite, car j'ai demandé un exemple avec du code à ChatGPT

}
