package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main (String[] args) {

        float tauxHoraireBrut = 25.0f;
        float heuresjournalieres = 7.7f;
        float heuresSemaines = 38.5f;

        float salaireBrutJournalier = tauxHoraireBrut * heuresjournalieres;

        System.out.println("Le salaire brut journalier est de : " + salaireBrutJournalier + "€");

        float salaireBruthebdomadaire = salaireBrutJournalier * 5;

        System.out.println("Le salaire brut hebdomadaire est de : " + salaireBruthebdomadaire + "€");

        float salaireBrutMensuel = salaireBruthebdomadaire * 4;

        System.out.println("Le salaire brut mensuel est de : " + salaireBrutMensuel + "€");

        float salaireBrutAnuelle =salaireBrutMensuel * 12;

        System.out.println("Le salaire brut annuel est de : " + salaireBrutAnuelle + "€");

        float salaireNetMensuelImposable = salaireBrutMensuel - (salaireBrutMensuel * 25.0f / 100.0f);

        System.out.println("Le salaire net mensuel imposable est de : " + salaireNetMensuelImposable + "€");

        float salaireNetAnnuelImpossable = salaireBrutAnuelle - (salaireBrutAnuelle * 25.0f / 100.0f);

        System.out.println("Le salaire net annuel imposable est de : " + salaireNetAnnuelImpossable + "€");

        float salaireNetMensuel = salaireNetMensuelImposable - (salaireNetMensuelImposable * 10.5f / 100.0f);

        System.out.println("Le salaire net mensuel, après impôt sur le revenu est de : " + salaireNetMensuel + "€");

        float salaireNetAnnuel = salaireNetAnnuelImpossable - (salaireNetAnnuelImpossable * 10.5f / 100.0f);

        System.out.println("Le salaire net annuel, après impôt sur le revenu est de : " + salaireNetAnnuel + "€");


    }

}
