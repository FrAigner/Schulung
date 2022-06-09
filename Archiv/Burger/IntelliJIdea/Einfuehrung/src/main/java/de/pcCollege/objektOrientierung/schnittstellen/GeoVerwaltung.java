package de.pcCollege.objektOrientierung.schnittstellen;

import java.util.Scanner;

public class GeoVerwaltung {
    public static void main(String[] args) {
        double z1;
        double z2;
        Scanner eingabe = new Scanner(System.in);
        Kreis meinKreis = new Kreis();
        System.out.println("Bitte Zahl1 eingeben");
        z1 = eingabe.nextDouble();
        System.out.println("Bitte Zahl2 eingeben");
        z2 = eingabe.nextDouble();
        System.out.printf("Ein Kreis mit dem Radius %.2f hat den Umfang %.2f", z1, meinKreis.berechneUmfang(z1, z2));
        System.out.printf("\nEin Kreis mit dem Radius %.2f hat die Fläche %.2f", z1, meinKreis.berechneFlaeche(z1, z2));
    }
}