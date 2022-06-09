package de.pcCollege.objektOrientierung;

import de.pcCollege.objektOrientierung.vorlagen.Smartphone;

public class SmartphoneBenutzer {
    public static void main(String[] args) {
        Smartphone meinSmartphone = new Smartphone();
        meinSmartphone.setStatus(true);
        meinSmartphone.setLautstaerke(50);
        System.out.printf("Die aktuelle Lautstärke beträgt %d", meinSmartphone.getLautstaerke());
        Smartphone sm2 = new Smartphone(150);
        sm2.setLautstaerke(180);
        System.out.printf("\nDie aktuelle Lautstärke beträgt %d", sm2.getLautstaerke());
        Smartphone sm3 = new Smartphone(150, "23497");
        System.out.printf("\nTelefonnummer %s", sm3.getEigeneTelefonnummer());
        System.out.println();
        System.out.println(sm3);
        System.out.printf("Es wurden %d Smartphones instanziiert", Smartphone.getAnzahl());
        Smartphone [] smArray = new Smartphone[6]; // I l 1 i 0 O
        for (int i = 0; i < smArray.length; i++) {
            if(i % 2 == 0)
            {
                smArray[i] = new Smartphone(100+i);
            }
            else
            {
                smArray[i] = new Smartphone();
            }
        }
        System.out.printf("\nEs wurden %d Smartphones instanziiert", Smartphone.getAnzahl());
    }
}
