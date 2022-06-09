package de.pcCollege.ersteExperimente;

import java.util.Arrays;
import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        // Addition in einer neuen Klasse "Rechner"
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        int z1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        int z2 = eingabe.nextInt();
        int sum1 = z1 + z2;
        int sum2 = z1 - z2;
        int sum3 = z1 * z2;
        try {
            int sum4 = z1 / z2;
            int sum5 = z1 % z2;
            System.out.printf("\n%d / %d = %d", z1, z2, sum4);
            System.out.printf("\n%d %% %d = %d", z1, z2, sum5);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            eingabe.close();
        }

        System.out.printf("%d + %d = %d", z1, z2, sum1);
        System.out.printf("\n%d - %d = %d", z1, z2, sum2);
        System.out.printf("\n%d * %d = %d", z1, z2, sum3);
    }
}
