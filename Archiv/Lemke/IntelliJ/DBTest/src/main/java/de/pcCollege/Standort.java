package de.pcCollege;

public class Standort {
    private int id;
    private String name;
    private String strasse;
    private String Hausnummer;
    private String PLZ;
    private String ort;

    public Standort(int id, String name, String strasse, String hausnummer, String PLZ, String ort) {
        this.id = id;
        this.name = name;
        this.strasse = strasse;
        Hausnummer = hausnummer;
        this.PLZ = PLZ;
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Standort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strasse='" + strasse + '\'' +
                ", Hausnummer='" + Hausnummer + '\'' +
                ", PLZ='" + PLZ + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
