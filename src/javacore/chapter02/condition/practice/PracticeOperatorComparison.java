package javacore.chapter02.condition.practice;

public class PracticeOperatorComparison {

    public static void main (String[] args) {

        int a = 30;
        int b = 40;

        boolean isEquals = a == b;

        System.out.println("Est-ce que " +  a + " est égale à " + b + " ? " + isEquals);

        boolean isNotEquals = a != b;

        System.out.println("Est-ce que " + a + " n'est pas égale à " + b + " ? " + isNotEquals);

        boolean isLessThan = a < b;

        System.out.println("Est-ce que " + a + " plus petit que " + b + " ? " + isLessThan);

        boolean isLessThanOrEquals = a <= b;

        System.out.println("Est-ce que " + a + " est inférieur ou égale à " + b + " ? " + isLessThanOrEquals);

        boolean isGreaterThan = a > b;

        System.out.println("Est-ce que " + a + " est supérieur à " + b + " ? " + isGreaterThan);

        boolean isGreaterThanOrEquals = a >= b;

        System.out.println("Est-ce que " + a + " est supérieur ou égale à " + b + " ? " + isGreaterThanOrEquals);

        boolean priorityTest = 10 + a == 40;

        System.out.println("Test de priorité (10 + a == 40) : " + priorityTest);

        boolean isDoubleLessThanIt = 5.5 < 6.0;

        System.out.println("Test Inter-Type (5.5 < 6.0) : " + isDoubleLessThanIt);





    }

}
