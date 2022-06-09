package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        // Variablendeklaration
        int min = 0;
        int max = 0;
        int z1;
        int z2;
        Scanner eingabe = new Scanner(System.in);
        // Eingabe
        System.out.println("Bitte erste Zahl eingeben");
        z1 = eingabe.nextInt();
        System.out.println("Bitte zweite Zahl eingeben");
        z2 = eingabe.nextInt();
        // Entscheidung
        max = (z1>z2) ? z1 : z2;
        min = (z1<z2) ? z1 : z2;
        // Ausgabe
        System.out.printf("Minimum von %d und %d ist %d, Maximum von %d und %d ist %d", z1, z2, min, z1, z2, max);
    }
}
