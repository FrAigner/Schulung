package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class zweiteAufgabe {
    public static void main(String[] args) {
        System.out.println("\u00c4nderung");
        double einEuroInUSD = 1.0772 ;
        Scanner eingabe = new Scanner(System.in);
        int usd = eingabe.nextInt();
        double sum = einEuroInUSD * usd;
        System.out.printf("%s Euro = %.2f Dollar", einEuroInUSD, sum);
    }
}
