package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.Fahrzeug;
import de.pcCollege.Vorlage.Motorfahrzeug;

public class FahrzeugBenutzer {
    public static void main(String[] args) {
        Fahrzeug meinFahrzeug = new Fahrzeug();
        System.out.printf("Das Limit ist auf %d gestellt.\n",meinFahrzeug.getTempolimit());

        meinFahrzeug.setGeschwindigkeit(100);
        System.out.printf("Geschwindigkeit ist %d\n", meinFahrzeug.getGeschwindigkeit());
        meinFahrzeug.setGeschwindigkeit(200);
        System.out.printf("Geschwindigkeit ist %d", meinFahrzeug.getGeschwindigkeit());

        meinFahrzeug.setRichtung(Richtung.links);
        System.out.println(meinFahrzeug);

        Motorfahrzeug meinMotorfahrzeug = new Motorfahrzeug(130,300);
        System.out.println(meinMotorfahrzeug);
    }

}
