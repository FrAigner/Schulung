package de.pcCollege.objektorientierung;

import de.pcCollege.Vorlage.Rechner;

import java.util.Scanner;

public class RechnerNutzen {
    public static void main(String[] args) {
        Rechner meinRechner = new Rechner();
        double wert1 = 0;
        double wert2 = 0;
        Scanner eingabe = new Scanner(System.in);
        System.out.printf("Geben Sie die erste Zahl ein:");
        wert1 = eingabe.nextDouble();
        System.out.printf("Geben Sie die zweite Zahl ein:");
        wert2 = eingabe.nextDouble();
        System.out.println("\nWert 1 ist: " + wert1);
        System.out.println("Wert 2 ist: " + wert2);
        System.out.println("Addition " + meinRechner.Addition(wert1,wert2));
        System.out.println("Multiplikation " + meinRechner.Multiplikation(wert1,wert2));
        System.out.println("Subtraktion " + meinRechner.Subtraktion(wert1,wert2));
        System.out.println("Modulo " + meinRechner.Modulo(wert1,wert2));
    }
}
