package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main (String[] args) {

        int endNumber = 200;

        int digitNumber = 1;

        for (int currentNumber = 1; currentNumber < endNumber; currentNumber++) {

                if (currentNumber > 9) {
                    digitNumber = 2;
                }
                if (currentNumber > 99) {
                    digitNumber = 3;
                }
        }
    }
}
