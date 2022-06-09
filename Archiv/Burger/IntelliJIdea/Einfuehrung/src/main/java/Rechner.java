import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        // Addition in einer neuen Klasse "Rechner"
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl in $ ein");
        // Mit Konvertierung
        String eingabeZeichenKette = eingabe.next();
        int z1 = Integer.parseInt(eingabeZeichenKette);
//        int z1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl in EUR ein");
        int z2 = eingabe.nextInt();
        int sum = z1 + z2;
        System.out.printf("%d + %d = %d", z1, z2, sum);
        // Zusätzliche Variable sum nicht erforderlich, Berechnung kann direkt in Ausgabe erfolgen
        eingabe.close();
    }
}
