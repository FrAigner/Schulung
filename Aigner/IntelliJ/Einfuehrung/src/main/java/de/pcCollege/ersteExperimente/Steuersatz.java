package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Steuersatz {
    public static void main(String[] args) {
        System.out.println("Nennen uns dein Gehalt: ");
        Scanner eingabe = new Scanner(System.in);
        int gehalt = eingabe.nextInt();
        int steuersatz = 0;
        if (gehalt <= 12000) {
            steuersatz = 12;
            System.out.println("Dein Steuersatz ist: 12%");
        } else if (gehalt <= 20000) {
            steuersatz = 15;
            System.out.println("Dein Steuersatz ist: 15%");
        } else if (gehalt <= 30000) {
            steuersatz = 20;
            System.out.println("Dein Steuersatz ist: 20%");
        } else if (gehalt > 30000) {
            steuersatz = 25;
            System.out.println("Dein Steuersatz ist: 25%");
        }
        int versteuertesGehalt = gehalt - (gehalt * steuersatz/100);
        System.out.println("Dein Gehalt nach Steuer ist: " + versteuertesGehalt);
    }
}
