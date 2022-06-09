package de.pcCollege.ersteExperimente;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    public static void main(String[] args) {
        Random zufall = new Random();
        int loesungsZahl = zufall.nextInt(10+1);
        int zahl;
        //System.out.println("öüäß€");

        do {
            System.out.println("Welche Zahl zwischen 1 und 10 suchen wir?\n99 - um das Spiel zu beenden.");
            Scanner eingabe = new Scanner(System.in);
            zahl = eingabe.nextInt();
            System.out.println("Lösung ist: " + loesungsZahl);
            if (loesungsZahl == zahl) {
                System.out.println("Glückwunsch, Lösung gefunden.");
            } else if (zahl == 99) {
                System.out.println("Spiel wurde beendet.");
                break;
            }
        } while (loesungsZahl != zahl);

    }
}
