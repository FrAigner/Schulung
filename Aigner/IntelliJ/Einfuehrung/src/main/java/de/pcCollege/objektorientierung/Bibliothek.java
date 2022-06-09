package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.BuchVorlage;

import java.util.Scanner;

public class Bibliothek {
    public static void main(String[] args) {

        //Bücher
        String[][] buch = {
                {"neues Buch1", "635", "true"},
                {"neues Buch2", "81", "true"},
                {"neues Buch3", "581", "true"},
                {"neues Buch4", "841", "false"},
                {"neues Buch5", "50", "true"},
                {"neues Buch6", "38", "true"}};

        System.out.println("Wir haben folgende Bücher verfügbar.");
        for (int i = 0; i < buch.length; i++) {
            if (Boolean.parseBoolean(buch[i][2])) {
                System.out.println((i + 1) + ": " + buch[i][0]);
            }

        }

        System.out.println("Welches Buch möchten Sie, von den Büchern haben?");
        Scanner eingabe = new Scanner(System.in);
        int welchesBuch = eingabe.nextInt() - 1;
        BuchVorlage meinBuch = new BuchVorlage();
        meinBuch.setTitle(buch[welchesBuch][0]);
        meinBuch.setSeitenanzahl(buch[welchesBuch][1]);
        String Leihbar = buch[welchesBuch][2];
        boolean b1 = Boolean.parseBoolean(Leihbar);
        meinBuch.setLeihbar(b1);

        System.out.println("Du hast folgendes Buch gewählt\nTitel:        " + meinBuch.getTitle());
        System.out.println("Seitenanzahl: " + meinBuch.getSeitenanzahl());
        System.out.println("Leihbar:      " + meinBuch.isLeihbar());


    }
}
