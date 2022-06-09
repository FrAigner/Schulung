package Objektorientierung;

import Objektorientierung.Vorlagen.Buch;

public class Bibliothek {
    public static void main(String[] args) {
        Buch neuBuch = new Buch();
        neuBuch.setTitel("kuck in Wald");
        neuBuch.setSeitenanzahl(4156189);
        neuBuch.setAusgeliehen(true);
    }

}
