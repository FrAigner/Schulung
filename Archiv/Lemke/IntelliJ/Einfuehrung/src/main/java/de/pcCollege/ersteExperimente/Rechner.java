package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        // Addition in einer neuen Klasse "Rechner"
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        int z1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        int z2 = eingabe.nextInt();
        int sum = z1 + z2;
        int mal = z1 * z2;
        // zusätzliche Variable sum nicht erforderlich, Berechnung kann direkt in Ausgabe erfolgen
        System.out.print("Summe");
        System.out.printf("\n%d + %d = %d", z1, z2, sum);
        System.out.print("\nMinus");
        System.out.printf("\n%d - %d = %d", z1, z2, z1-z2);
        System.out.print("\nMultiplikation");
        System.out.printf("\n%d * %d = %d", z1, z2, mal);
        System.out.print("\nDivision");
        System.out.printf("\n%d / %d = %d", z1, z2, z1/z2);
        System.out.print("\nModulo");
        System.out.printf("\n%d  %d = %d", z1, z2, z1%z2);
        eingabe.close();
    }
}
