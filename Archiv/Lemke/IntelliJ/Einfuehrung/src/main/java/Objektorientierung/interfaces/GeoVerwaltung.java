package Objektorientierung.interfaces;

import java.util.EventListener;
import java.util.Scanner;

public class GeoVerwaltung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double z1;
        double z2;
        Kreis kreis1 = new Kreis();
        System.out.println("Bitte Radius eingeben");
        z1 = eingabe.nextDouble();
        System.out.println("Bitte Umfang eingeben");
        z2 = eingabe.nextDouble();
        System.out.printf("Ein Kreis mit dem Radius %.2f hat den Umfang %.2f",z1, kreis1.berechneUmfang(z1,z2));
        System.out.printf("\nEin Kreis mit dem Radius %.2f hat die Fläche %.2f",z1, kreis1.berechneFlaeche(z1,z2));

        Rechteck Rechteck1 = new Rechteck();
        System.out.println("\nBitte Seite 1 eingeben");
        z1 = eingabe.nextDouble();
        System.out.println("Bitte Seite 2 eingeben");
        z2 = eingabe.nextDouble();
        System.out.printf("\nEin Rechteck mit Seitenlänge %.2f und Seitenlänge %.2f hat den Umfang %.2f",z1,z2, Rechteck1.berechneUmfang(z1,z2));
        System.out.printf("\nEin Rechteck mit Seitenlänge %.2f und Seitenlänge %.2f hat die Fläche %.2f",z1,z2, Rechteck1.berechneFlaeche(z1,z2));

    }
}
