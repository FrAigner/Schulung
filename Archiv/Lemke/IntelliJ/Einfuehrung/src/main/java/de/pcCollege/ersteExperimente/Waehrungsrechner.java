package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Waehrungsrechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Eurobetrag");
        double Euro = eingabe.nextInt();

        double Wechselkurz = 1.0771;

        System.out.printf("%.2f", Euro* Wechselkurz);
    }
}
