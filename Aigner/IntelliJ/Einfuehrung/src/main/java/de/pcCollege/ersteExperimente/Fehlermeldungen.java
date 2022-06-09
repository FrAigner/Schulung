package de.pcCollege.ersteExperimente;

public class Fehlermeldungen {
    public static void main(String[] args) {
        double[] zahlen = {35, 32.5, 30, 27.5, 25, 22.5, 20};

        try {
            System.out.println(zahlen[11]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
