package Objektorientierung;

import Objektorientierung.Vorlagen.Rechner;

import java.util.Scanner;

public class Rechnen {
    public static void main(String[] args) {
        Rechner meinRechnen = new Rechner();
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        int z1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        int z2 = eingabe.nextInt();
        System.out.printf("Ergebnis der Addition ist: %d",meinRechnen.Addition(z1, z2));
        System.out.printf("\nErgebnis der Subtraktion ist: %d",meinRechnen.Subtraktion(z1, z2));
        System.out.printf("\nErgebnis der Multiplikation ist: %d",meinRechnen.Multiplikation(z1, z2));
        System.out.printf("\nErgebnis der Division ist: %.2f",meinRechnen.Division(z1, z2));
        System.out.printf("\nErgebnis der Modulo ist: %.2f",meinRechnen.Modulo(z1, z2));

    }
}
