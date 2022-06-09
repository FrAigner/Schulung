package Objektorientierung;

import Objektorientierung.Vorlagen.Fahrzeug;
import Objektorientierung.Vorlagen.MotorFahrzeug;
import Objektorientierung.Vorlagen.Richtung;

public class Testdrive {
    public static void main(String[] args) {
        Fahrzeug meinAuto = new Fahrzeug(180);
        meinAuto.setMotoran(true);
        meinAuto.setGeschwindigkeit(250);
        meinAuto.setRichtung(Richtung.links);
        System.out.printf("Die aktuelle Geschwindigkeit beträgt: %d \n", meinAuto.getGeschwindigkeit());
        System.out.println(meinAuto);

        MotorFahrzeug brumbrum = new MotorFahrzeug(180,12);
        brumbrum.setRichtung(Richtung.rechts);
        System.out.println(brumbrum);

    }
}
