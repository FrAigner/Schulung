package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Schleife {
    public static void main(String[] args) {
        for (int i = 50; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Countdown ist beendet");


        System.out.println("Ohne Array");
        for (double i = 35; i >= 20; i -= 2.5) {
            System.out.println(i);
        }


        double[] zahlen = {35, 32.5, 30, 27.5, 25, 22.5, 20};
        double sum = 0;
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
            sum = sum + zahlen[i];
        }
        System.out.println("Die Summe ist: " + sum);
        System.out.println("Die Mittelwert ist: " + sum / (zahlen.length));


        System.out.println("Nennen uns eine Zahl: ");
        Scanner eingabe = new Scanner(System.in);
        double zahl = eingabe.nextInt();
        for (double i = zahl; i >= 0.001; i= i/2) {
            System.out.println(i);
        }
    }
}
