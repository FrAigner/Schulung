package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.Smartphone;

public class SmartphoneBenutzer {
    public static void main(String[] args) {
        Smartphone meinSmartphone = new Smartphone(100);
        meinSmartphone.setStatus(true);
        meinSmartphone.setLautstaerke(50);
        System.out.printf("Die Lautstärke ist: %d", meinSmartphone.getLautstaerke());
        System.out.println();
        Smartphone sp1 = new Smartphone(100, "+49123456789");
        Smartphone sp2 = new Smartphone(100, "+123");
        Smartphone sp3 = new Smartphone(100, "+49123456789");
        System.out.println(sp1);
        System.out.println(sp1.toString());
        System.out.printf("Es wurden %d Smartphones instanziiert.", Smartphone.getAnzahl());
        Smartphone[] spArray = new Smartphone[6];
        for (int i = 0; i < spArray.length; i++) {
            if (i % 2 == 0) {
                spArray[i] = new Smartphone(100);
            } else {
                spArray[i] = new Smartphone();
            }
        }
        System.out.printf("\nEs wurden %d Smartphones instanziiert", Smartphone.getAnzahl());
    }
}
