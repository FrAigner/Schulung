package de.pcCollege.interfaces;

public class Rechteck implements Geometrieberechnung{

    @Override
    public double berechneUmfang(double z1, double z2) {
        return 2 * z1 + 2 * z2;
    }

    @Override
    public double berechneFlaeche(double z1, double z2) {
        return z1 * z2;
    }
}
