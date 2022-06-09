package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {

//        //Countdown
//        System.out.print("Zählen von 50 bis 0\n");
//
//        for (int i = 50; i > 0; i--) {
//            System.out.println(i);
//           }
//
//        System.out.print("Zählen von 35 abwärts mit 2,5 Schritten\n");
//
//        // Zählen mit -2,5
//        {
//            long summe = 0;
//            for (double i = 35; i > 19; i -= 2.5) {
//                System.out.println(i);
//                summe += i;
//            }
//            System.out.print("Summe aller Zahlen\n");
//            System.out.println(summe);
//
//        }

        // von Frank

        double[] zahlen = {35, 32.5, 30, 27.5, 25, 22.5, 20};
        double sum = 0;
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
            sum = sum + zahlen[i];
        }
        System.out.println("Die Summe ist: " + sum);
        System.out.println("Die Mittelwert ist: " + sum / (zahlen.length));

    }
}

