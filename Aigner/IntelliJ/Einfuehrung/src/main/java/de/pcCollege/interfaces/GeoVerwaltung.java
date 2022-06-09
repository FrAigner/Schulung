package de.pcCollege.interfaces;

import java.util.Scanner;

public class GeoVerwaltung {
    public static void main(String[] args) {
        double z1;
        double z2;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Kreis = 1\nRechteck = 2");
        switch (eingabe.nextInt()) {
            case 1:
                Kreis meinKreis = new Kreis();
                System.out.println("Bitte Zahl1 eingeben");
                z1 = eingabe.nextDouble();
                System.out.println("Bitte Zahl2 eingeben");
                z2 = eingabe.nextDouble();
                System.out.printf("Ein Kreis mit dem Radius %.2f hat den Umfang %.2f", z1, meinKreis.berechneUmfang(z1, z2));
                System.out.printf("\nEin Kreis mit dem Radius %.2f hat die Fläche %.2f", z1, meinKreis.berechneFlaeche(z1, z2));
                break;
            case 2:
                Rechteck meinRechteck = new Rechteck();
                System.out.println("Bitte Zahl1 eingeben");
                z1 = eingabe.nextDouble();
                System.out.println("Bitte Zahl2 eingeben");
                z2 = eingabe.nextDouble();
                System.out.printf("Ein Rechteck mit dem Seitenlänge %.2f und %.2f hat den Umfang %.2f", z1, z2, meinRechteck.berechneUmfang(z1, z2));
                System.out.printf("\nEin Rechteck mit dem Seitenlänge %.2f und %.2f hat die Fläche %.2f", z1, z2, meinRechteck.berechneFlaeche(z1, z2));
                break;
        }
    }
}
