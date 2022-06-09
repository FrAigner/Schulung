package de.pcCollege.ersteExperimente;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    private static Random eingabe;

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Random zufall = new Random();
        int Zufall = zufall.nextInt(10)+1;

        System.out.println("Bitte geben Sie die erste Zahl ein");
        int Versuch = eingabe.nextInt();

        if (Zufall == Versuch)
        {
            System.out.println("Richtig geraten");
        }
        else
        {
            System.out.println("falsch geraten");
        }
    }
}
