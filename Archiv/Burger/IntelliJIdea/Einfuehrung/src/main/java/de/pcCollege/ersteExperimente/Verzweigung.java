package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Verzweigung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein");
        int z = eingabe.nextInt();
        if (z<18)
        {
            System.out.println("Die Zahl ist zu klein");
        }
        else
        {
            System.out.println("Die Zahl ist gross genug");
        }
    }
}
