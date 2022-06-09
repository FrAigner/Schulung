package Objektorientierung;

import Objektorientierung.Vorlagen.Kontakt;
import Objektorientierung.Vorlagen.Mitarbeiter;
import Objektorientierung.Vorlagen.PersonBasis;

public class Adressbuch {
    public static void main(String[] args) {

//        PersonBasis [] adressen = new PersonBasis[7];
//        for (int i = 0; i < adressen.length; i++){
//            if (i%3 == 0)
//            {
//                adressen[i] = new PersonBasis("Vorname"+i,"Nachname"+i);
//            } else if (i % 3 == 1) {
//                adressen[i] = new Kontakt("Vorname"+i,"Nachname"+i,"Email"+i,"Telefon"+i);
//            }
//            else {
//                adressen[i] = new Mitarbeiter("Vorname"+i,"Nachname"+i, 1645+i,5777);
//            }
//        }
//        // Beispiel für Polymorphie
//        for (int i = 0; i < adressen.length;i++){
//            System.out.println(adressen[i]);
//        }
        PersonBasis p1 = new PersonBasis("Test1","a");
        PersonBasis p2 = new PersonBasis("Test1","L");
        System.out.println(p1.compareTo(p2));
    }
}
