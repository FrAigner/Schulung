package Objektorientierung;

import Objektorientierung.Vorlagen.Kontakt;
import Objektorientierung.Vorlagen.Mitarbeiter;

public class Perso {
    public static void main(String[] args) {
        Mitarbeiter Mitarbeiter1 = new Mitarbeiter("hans","martion",007,3500);
        System.out.println(Mitarbeiter1);

        Kontakt Kontakt1 = new Kontakt("Christian", "Lemke", "christian.lemke@blbla.de", "2323424");
        System.out.println(Kontakt1);

        Mitarbeiter Mitarbeiter2 = new Mitarbeiter("Frank","Aigner",564,5600);
        System.out.println(Mitarbeiter2);
    }
}

