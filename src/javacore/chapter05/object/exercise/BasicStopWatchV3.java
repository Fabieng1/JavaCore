package javacore.chapter05.object.exercise;

public class BasicStopWatchV3 {

    String name = "Fabien";

    int start = 0;

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public BasicStopWatchV3 () {
    }


    public static void main (String[] args) throws InterruptedException {
        BasicStopWatchV3 chronometer = new BasicStopWatchV3();

        chronometer.launch("Fabien");
    }

    public void launch(String name) throws InterruptedException{


        int start = 0;

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while(start < 10000) {

            Thread.sleep(1);

            seconds++;

            if (seconds == 60) {
                seconds = 0;
                minutes++;

                if (minutes == 60) {
                    hours++;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
            displayTime(name, hours, minutes, seconds);

            start++;
        }
    }

    public void displayTime(String name, int hours, int minutes, int seconds) {

        String displayHours = hours < 10  ? "0" + hours  : "" + hours;
        String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
        String displaySecondes = seconds < 10  ? "0" + seconds  : "" + seconds;
        System.out.println(name + " : " + displayHours + ":" + displayMinutes  + ":" +  displaySecondes);
    }
}



