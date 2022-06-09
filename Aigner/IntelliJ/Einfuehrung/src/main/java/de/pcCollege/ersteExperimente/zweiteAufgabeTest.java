package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class zweiteAufgabeTest {
    public static void main(String[] args) {
        double einEuroInUSD = 1.0772 ;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie wie Waehrung in Euro ein:");
        int usd = eingabe.nextInt();
        double sum = einEuroInUSD * usd;
        System.out.printf("%s Euro = %.2f Dollar", einEuroInUSD, sum);

    }
}
