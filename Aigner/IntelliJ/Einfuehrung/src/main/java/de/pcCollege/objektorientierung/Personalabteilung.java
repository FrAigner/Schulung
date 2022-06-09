package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.Kontakt;
import de.pcCollege.Vorlage.Mitarbeiter;

public class Personalabteilung {
    public static void main(String[] args) {

        Mitarbeiter neuerMitarbeiter = new Mitarbeiter("0815321654", "Frank", "03213853438", 2500.16);
        System.out.println(neuerMitarbeiter);
        Kontakt neuerKontakt = new Kontakt("Frank", "Aigner", "test@test.com", "0123456789");
        System.out.println(neuerKontakt);
    }
}
