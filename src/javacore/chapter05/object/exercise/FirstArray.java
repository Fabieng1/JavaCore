package javacore.chapter05.object.exercise;

public class FirstArray {

    public static void main(String[] args) {

        int[] integerArray = new int[10];

        int number = 1;

        for(int index = 0; index < integerArray.length; index++) {

            integerArray[index] += number++;

            displayArray(integerArray, index);
        }

        for(int index = 0; index < integerArray.length; index++) {

            integerArray[index] = integerArray[index] * 3;

            displayArray(integerArray, index);
        }

        for(int index = 0; index < integerArray.length; index++) {

            if (integerArray[index] % 2 == 0) {
                displayArray(integerArray, index);
            }
        }

        for(int index = 0; index < integerArray.length; index++) {

            if (integerArray[index] % 3 == 0 && index > 0) {
                integerArray[index-1] = 0;
            }
        }

        for(int index = 0; index < integerArray.length; index++) {

            displayArray(integerArray, index);
        }
    }

    public static void displayArray(int[] array, int index) {

        System.out.println(array[index]);
    }
}
