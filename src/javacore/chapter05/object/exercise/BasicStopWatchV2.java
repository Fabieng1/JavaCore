package javacore.chapter05.object.exercise;

public class BasicStopWatchV2 {

    int start = 0;

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public static void main (String[] args) throws InterruptedException {

        BasicStopWatchV2 chronometer = new BasicStopWatchV2();

        chronometer.launch();


    }


    public void launch() throws InterruptedException{

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

            displayTime(hours, minutes, seconds);

            start++;
        }
    }

    public void displayTime(int hours, int minutes, int seconds) {

        String displayHours = hours < 10  ? "0" + hours  : "" + hours;
        String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
        String displaySecondes = seconds < 10  ? "0" + seconds  : "" + seconds;
        System.out.println(displayHours + ":" + displayMinutes  + ":" +  displaySecondes);
    }
}
