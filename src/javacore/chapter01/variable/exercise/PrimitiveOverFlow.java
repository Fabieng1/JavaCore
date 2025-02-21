package javacore.chapter01.variable.exercise;

public class PrimitiveOverFlow {

    public static void main (String[] args) {

        short hourSeconds = 3600;

        System.out.println(hourSeconds);

        int daySeconds = hourSeconds * 24;

        System.out.println(daySeconds);

        int weekSeconds = hourSeconds * 7;

        System.out.println(weekSeconds);

        int monthSeconds = weekSeconds * 30;

        System.out.println(monthSeconds);

        int yearsSeconds = daySeconds * 365;

        System.out.println(yearsSeconds);

    }

}
