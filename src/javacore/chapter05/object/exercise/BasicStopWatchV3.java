package javacore.chapter05.object.exercise;

public class BasicStopWatchV3 {

    String name;

    int start = 0;

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public BasicStopWatchV3 (String name) {

        this.name = name;
    }

    public static void main (String[] args) throws InterruptedException {
        BasicStopWatchV3 chronometer = new BasicStopWatchV3("Fabien");

        chronometer.launch(10000);
    }

    public void launch(int end) throws InterruptedException{


        while(start < end) {

            Thread.sleep(1);

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
            displayTime(name, this.hours, this.minutes, this.seconds);

            start++;
        }
    }

    public void displayTime(String name, int hours, int minutes, int seconds) {

        String displayHours = hours < 10  ? "0" + hours  : "" + hours;
        String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
        String displaySecondes = seconds < 10  ? "0" + seconds  : "" + seconds;
        System.out.println(this.name + " : " + displayHours + ":" + displayMinutes  + ":" +  displaySecondes);
    }
}



