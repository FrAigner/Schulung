package de.pcCollege.ersteExperimente;

public class Fehler {
    public static void main(String[] args) {

        try {
            double[] zahlen = {35, 32.5, 30, 27.5, 25, 22.5, 20};
            System.out.println(zahlen[11]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage()); //normale Nachricht
            System.err.println(exception.getMessage()); //Nachricht als Error (rot)
            exception.printStackTrace(); // Ausgabe Stacktrace
        }
        finally {
            System.out.println("Dran denken gibt nur 7 Werte");
        }

    }
}
