package de.pcCollege.ersteExperimente;

public class Aufgabe1 {
    public static void main(String[] args) {
        double MenschenDeutschland;
        long MenschenErde;
        boolean Tag;
        int FCRatings;
        char Teilnehmer;
        char ErsteBuchstabeName;
        String Name;
        int PLZ; //besser String
        String Geburtsdatum;
        String Tel;
        String FarbevomAuto;
        boolean AutohatMotor;
        char PreisPizza;


        MenschenDeutschland = 83134618;
        MenschenErde = 795649745;
        Tag = true;
        FCRatings = 78;
        Teilnehmer = 2;
        ErsteBuchstabeName = 'C';
        Name = "Christian Lemke";
        PLZ = 74936;
        Geburtsdatum = "12.12.1988";
        Tel = "01787181826";
        FarbevomAuto = "weiß";
        AutohatMotor = true;
        PreisPizza = 9;

        System.out.printf(String.valueOf(MenschenDeutschland));
        System.out.printf(String.valueOf(MenschenErde));
        System.out.printf(String.valueOf(Tag));
        System.out.printf(String.valueOf(FCRatings));
        System.out.printf(String.valueOf(Teilnehmer));
        System.out.printf(String.valueOf(ErsteBuchstabeName));
        System.out.printf(String.valueOf(Name));
        System.out.printf(String.valueOf(PLZ));
        System.out.printf(String.valueOf(Geburtsdatum));
        System.out.printf(String.valueOf(Tel));
        System.out.printf(String.valueOf(FarbevomAuto));
        System.out.printf(String.valueOf(AutohatMotor));
        System.out.printf(String.valueOf(PreisPizza));
    }
}
