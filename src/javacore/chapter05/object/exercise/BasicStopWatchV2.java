package javacore.chapter05.object.exercise;

public class BasicStopWatchV2 {

    int start = 0;

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public static void main (String[] args) throws InterruptedException {

        BasicStopWatchV2 chronometre = new BasicStopWatchV2();

        chronometre.launch();
    }

    public void launch() throws InterruptedException{

        BasicStopWatchV2 chronometre = new BasicStopWatchV2();

        while(start < 10000) {

            Thread.sleep(1000);

            this.seconds++;

            if (this.seconds == 60) {
                this.seconds = 0;
                this.minutes++;

                if (this.minutes == 60) {
                    this.hours++;
                    this.minutes = 0;

                    if (this.hours > 23) {
                        this.hours = 0;
                    }
                }
            }

            displayTime(hours, minutes, seconds);

            start++;
        }
    }

    public static void displayTime(int hours, int minutes, int seconds) {

        String displayHours = hours < 10  ? "0" + hours  : "" + hours;
        String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
        String displaySecondes = seconds < 10  ? "0" + seconds  : "" + seconds;
        System.out.println(displayHours + ":" + displayMinutes  + ":" +  displaySecondes);
    }
}
