package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {

    public static void main (String[] args) {

        // 3.5, 2,5, 2
        float studentGpa = 3.5f;
        // 35000, 50000, 70000
        int houseHoldIncome = 70000;
        // true, false
        boolean hasExtracurricular = true;

        if (studentGpa > 3.5f && houseHoldIncome < 40000 && hasExtracurricular) {
            System.out.println("Vous êtes éligible à une bourse à taux plein");
        }
        else if (studentGpa > 3.5f && houseHoldIncome < 60000 && hasExtracurricular) {
            System.out.println("Vous êtes éligible à une bourse partielle");
        }
        else {
            System.out.println("Vous n'êtes pas éligible à la bourse");
        }

    }
}
