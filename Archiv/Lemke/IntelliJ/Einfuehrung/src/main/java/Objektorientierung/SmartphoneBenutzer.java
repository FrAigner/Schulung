package Objektorientierung;

import Objektorientierung.Vorlagen.Smartphone;

public class SmartphoneBenutzer {
    public static void main(String[] args) {
        Smartphone Smartphone1 = new Smartphone();
        Smartphone1.setStatus(true);
        Smartphone1.setlautstaerke(5);
        System.out.printf("Die aktuelle Lautstärke beträgt &d", Smartphone1.getlautstaerke());
        Smartphone Smartphone2 = new Smartphone(130);
        Smartphone2.setlautstaerke(200);
        System.out.printf("\n Die aktuelle Lautstärke ist %d", Smartphone2.getlautstaerke());
        Smartphone Smartphone3 = new Smartphone();
        System.out.println(Smartphone3);
        System.out.printf("Es wurden %d Smartphones instanziiert.", Smartphone.getAnzahl());
        Smartphone[] smArray = new Smartphone[6];
        for(int i = 0; i < smArray.length; i++){
            if(i%2==0)
            {
                smArray[i] = new Smartphone(100+i);
            }
            else
            {
                smArray[i] = new Smartphone();
            }
        }
        System.out.printf("\nEs wurden %d Smartphones instanziiert.", Smartphone.getAnzahl());

    }
}
