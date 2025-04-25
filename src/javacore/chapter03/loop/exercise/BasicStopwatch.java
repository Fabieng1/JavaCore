package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main (String[] args) throws InterruptedException {


        int i = 0;

        int hours = 0;
        int minutes = 0;
        int secondes = 0;

        // Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)

        while(i < 100) {

            secondes++;

            if (secondes == 60) {
                secondes = 0;
                minutes++;
            }

            if (minutes == 60) {
                hours++;
                minutes = 0;
            }

            if (hours > 23) {
                hours = 0;
            }
            System.out.println(hours + ":" + minutes + ":" + secondes );

            //  Effectue une "pause" de 1000 millisecondes / 1 seconde

            Thread.sleep(1000);
            //System.out.println("1 seconde s'est écoulée");


            // Incrémente "i = i + 1;" pour atteindre la condition de la boucle while

            i++;
        }
    }
}

