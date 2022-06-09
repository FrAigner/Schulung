package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Steuersatz {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben das Gehalt ein");
        int gehalt = eingabe.nextInt();
        int steuersatz;

        if (gehalt < 12000) {
            System.out.println("Steuersatz 12%");
            steuersatz = 12;
        } else if (gehalt < 20000) {
            System.out.println("Steuersatz 15%");
            steuersatz = 15;
        } else if (gehalt < 30000) {
            System.out.println("Steuersatz 20%");
            steuersatz = 20;
        } else {
            System.out.println("Steuersatz 25%");
            steuersatz = 25;
        }

        int zurSteuerbetrag = gehalt / 100;
        int Steuerbetrag  = zurSteuerbetrag * steuersatz;

        System.out.print(Steuerbetrag);
    }
}
