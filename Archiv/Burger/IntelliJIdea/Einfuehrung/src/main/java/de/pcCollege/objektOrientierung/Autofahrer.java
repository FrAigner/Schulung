package de.pcCollege.objektOrientierung;

import de.pcCollege.objektOrientierung.vorlagen.Fahrzeug;

public class Autofahrer {
    public static void main(String[] args) {
        Fahrzeug meinAuto = new Fahrzeug(120);
        meinAuto.setGeschwindigkeit(130);
        meinAuto.setRichtung(Richtung.links);
        meinAuto.setRichtung(Richtung.rechts);
    }
}
