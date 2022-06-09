package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class zweitesArbeitsblatt {
    public static void main(String[] args) {
        System.out.println("Bitte Alter angeben");
        Scanner eingabe = new Scanner(System.in);
        int alter = eingabe.nextInt();
        if (alter < 18) {
            System.out.println("Du kommst hier nicht rein!");
        } else {
            System.out.println("Du kommst hier rein zum Feiern!");
        }
    }

}
