package javacore.chapter03.loop.exercise;

public class WhileLoopExample {

    public static void main (String[] args) {

       int loopCounter = 1;
       int loopCounter2 = 10;
       boolean chiffrePair;

       /* while (loopCounter <= 1000) {

            System.out.println("Tour de boucle n° " + loopCounter);
            System.out.println(loopCounter + " Hello World");
            loopCounter++;
        }*/

        /*while (loopCounter <= 10) {
            System.out.println(loopCounter);
            loopCounter++;
        }*/



        /*while (loopCounter2 > 0) {
            System.out.println(loopCounter2);
            loopCounter2--;
        }*/

        if (loopCounter2 % 2 == 0) {
            chiffrePair = true;
        }
        else {
            chiffrePair = false;
        }

        while (loopCounter2 < 10 && chiffrePair == true) {
            System.out.println(chiffrePair);
        }


    }

}
