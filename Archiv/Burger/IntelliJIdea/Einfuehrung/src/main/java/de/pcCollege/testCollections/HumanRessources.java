package de.pcCollege.testCollections;

import de.pcCollege.objektOrientierung.vorlagen.Kontakt;
import de.pcCollege.objektOrientierung.vorlagen.Mitarbeiter;

import java.util.ArrayList;
import java.util.Collections;

public class HumanRessources {
    public static void main(String[] args) {
//        ArrayList<Mitarbeiter> maListe = new ArrayList<>();
//        maListe.add(new Mitarbeiter("Frank",  "Aigner", "Musterstraße","1a", "12345", "Musterhausen", "xxx"));
//        maListe.add(new Mitarbeiter("Christian",  "Lemke", "Musterweg","7", "56789", "Musterstadt", "yyy"));
//        maListe.add(new Mitarbeiter("Susi",  "Maier", "Busterweg","8", "45678", "Musterstädtle", "zzz"));
        ArrayList<Kontakt> kListe = new ArrayList<>();
        kListe.add(new Kontakt("Hans", "Müller", "h@web.de", "234089243"));
        kListe.add(new Kontakt("Anna", "Meier", "a@web.de", "10299243"));
//        Collections.max(kListe); // Klasse Kontakt ohne Vergleichsmöglichkeit, daher Fehler
        System.out.println(kListe);
    }
}
