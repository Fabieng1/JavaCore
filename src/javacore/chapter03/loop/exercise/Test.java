package javacore.chapter03.loop.exercise;

public class Test {

    public static void main (String[] args) {

       int number = 1;

       int resultDivision = number / 10;
       int modulo = number % 10;

        System.out.println("R1 : " + resultDivision);
        System.out.println("M1 : " + modulo);
        System.out.println();

        modulo = resultDivision % 10;
        resultDivision = resultDivision / 10;

        System.out.println("R2 : " + resultDivision);
        System.out.println("M2 : " + modulo);
        System.out.println();

        modulo = resultDivision % 10;
        resultDivision = resultDivision / 10;

        System.out.println("R3 : " + resultDivision);
        System.out.println("M3 : " + modulo);
        System.out.println();

        modulo = resultDivision % 10;
        resultDivision = resultDivision / 10;

        System.out.println("R4 : " + resultDivision);
        System.out.println("M4 : " + modulo);
    }
}

