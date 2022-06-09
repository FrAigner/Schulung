package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        int zahl1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        int zahl2 = eingabe.nextInt();

        int Minimum = (zahl1 < zahl2) ? zahl1 : zahl2;
        System.out.print("Minimum:");
        System.out.println(Minimum);
        int Maximum = (zahl1 > zahl2) ? zahl1 : zahl2;
        System.out.print("\nMaximum:");
        System.out.println(Maximum);
    }
}
