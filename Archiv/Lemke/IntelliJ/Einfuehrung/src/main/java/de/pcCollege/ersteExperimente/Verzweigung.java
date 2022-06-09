package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Verzweigung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein");
        int zahl = eingabe.nextInt();

        if (zahl < 18) {
            System.out.println("keine Party");
        } else {
            System.out.println("PARTY!");
        }
    }
}

