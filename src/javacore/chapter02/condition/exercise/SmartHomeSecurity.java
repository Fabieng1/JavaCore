package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static void main (String[] args) {

        boolean isHouseEmpty = false;
        boolean isOwnerAsleep = true;
        boolean areAllDoorAndWindowsClosed = false;
        boolean isAlarmActivated = false;

        boolean isSafeModeActivated;


        if (isHouseEmpty || isOwnerAsleep && (areAllDoorAndWindowsClosed || isAlarmActivated)) {


            isSafeModeActivated = true;


            System.out.println("L'alarme est activé !");

        }
        else {

            isSafeModeActivated = false;

            System.out.println(isSafeModeActivated);

            System.out.println("Le mode sécurité est désactivé");

        }



    }

}
