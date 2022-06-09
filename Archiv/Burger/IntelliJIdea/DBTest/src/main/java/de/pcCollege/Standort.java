package de.pcCollege;

public class Standort {
    private int id;
    private String name;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public Standort(int id, String name, String strasse, String hausnummer, String plz, String ort) {
        this.id = id;
        this.name = name;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Standort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strasse='" + strasse + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
