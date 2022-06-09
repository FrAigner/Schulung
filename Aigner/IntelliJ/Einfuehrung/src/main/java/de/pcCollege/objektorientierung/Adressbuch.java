package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.Kontakt;
import de.pcCollege.Vorlage.Mitarbeiter;
import de.pcCollege.Vorlage.PersonBasis;

public class Adressbuch {
    public static void main(String[] args) {
        Kontakt k = new Kontakt("Frank", "Aigner", "frank@aigner.online", "0123456789");
        //System.out.println(k);
//        PersonBasis[] adressen = new PersonBasis[17];
//        for (int i = 0; i < adressen.length; i++)
//            if (i % 3 == 0) {
//                adressen[i] = new PersonBasis("Vorname" + i, "nachname" + i);
//            } else if (i % 3 == 1) {
//                adressen[i] = new Kontakt("Frank" + i, "Aigner" + i, "frank@aigner.online" + i, "0123456789" + i);
//            } else {
//                adressen[i] = new Mitarbeiter("Vorname" + i, "Nachname" + i, "0123456789", 2500.15);
//            }
//        for (int i = 0; i < adressen.length; i++)
//        {
//            System.out.println(adressen[i]);
//        }

        PersonBasis p1 = new PersonBasis ("Ann","Müller");
        PersonBasis p2 = new PersonBasis ("Anna","Müller");
        System.out.println(p1.compareTo(p2));
    }
}
