package de.pcCollege.ersteExperimente;

import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        // Addition in einer neuen Klasse "Rechner"
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        // Mit Konvertierung
        String eingabeZeichenKette = eingabe.next();
        int z1 = Integer.parseInt(eingabeZeichenKette);
//        int z1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        int z2 = eingabe.nextInt();
//        int sum = z1 + z2;
//        System.out.printf("%d + %d = %d", z1, z2, sum);
//        System.out.printf("\n%d - %d = %d", z1, z2, z1-z2);
//        System.out.printf("\n%d * %d = %d", z1, z2, z1*z2);
//        try {
        int quotient = z1/z2;
            System.out.printf("\n%d / %d = %d", z1, z2, z1/z2);
            System.out.printf("\n%d %% %d = %d", z1, z2, z1%z2);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            System.out.println("Freundliche Erinnerung: Division durch 0 nicht erlaubt");
//        }
//        finally {
//            System.out.println("Bitte denken Sie daran nicht durch 0 zu dividieren");
            eingabe.close();
//        }

        // Zusätzliche Variable sum nicht erforderlich, Berechnung kann direkt in Ausgabe erfolgen
    }
}
