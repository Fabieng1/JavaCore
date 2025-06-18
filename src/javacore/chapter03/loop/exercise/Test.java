package javacore.chapter03.loop.exercise;

public class Test {

    public static void main (String[] args) {

        int[] integerArray = new int[10];

        int number = 1;


        for(int index = 0; index < integerArray.length; index++) {

            integerArray[index] += number++;

            displayArray(integerArray, index);
        }

        for(int index = 0; index < integerArray.length; index++) {

            if (integerArray[index] % 3 == 0 && index > 0) {
                integerArray[index-1] = 0;
            }



        }
        for (int index = 0; index < integerArray.length; index++) {
            System.out.println(integerArray[index]);
        }

    }

    public static void displayArray(int[] array, int index) {

        System.out.println(array[index]);
    }
}

