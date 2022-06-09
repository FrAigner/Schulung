package Objektorientierung.interfaces;

public class Kreis implements Geometrieberechnung {


    @Override
    public double berechneUmfang(double z1, double z2) {
        return 2 * Math.PI * z1;
    }

    @Override
    public double berechneFlaeche(double z1, double z2) {
        return Math.PI * z1 * z2;
    }

}
