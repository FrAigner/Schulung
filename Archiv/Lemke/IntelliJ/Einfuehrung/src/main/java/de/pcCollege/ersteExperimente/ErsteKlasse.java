package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class ErsteKlasse {
    public static void main(String[] args) {
        // Ausgabe
        System.out.println("Bitte geben Sie Ihren Namen ein");
        // Eingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.printf("Guten Morgen, Herr/Frau %s", eingabe.next());
    }
}
