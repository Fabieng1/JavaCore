package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main (String[] args) throws InterruptedException {


        int start = 0;

        int hours = 0;
        int minutes = 0;
        int secondes = 0;


        while(start < 10000) {

            Thread.sleep(1);

            secondes++;

            if (secondes == 60) {
                secondes = 0;
                minutes++;

                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                    
                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }

            String displayHours = hours < 10  ? "0" + hours  : "" + hours;
            String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
            String displaySecondes = secondes < 10  ? "0" + secondes  : "" + secondes;
            System.out.println(displayHours + ":" + displayMinutes  + ":" +  displaySecondes);

            start++;
        }
    }
}

