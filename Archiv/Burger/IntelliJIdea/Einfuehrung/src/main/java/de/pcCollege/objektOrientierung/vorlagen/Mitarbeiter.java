package de.pcCollege.objektOrientierung.vorlagen;

public class Mitarbeiter extends PersonBasis{
    private String strasse;
    private String hausnr;
    private String plz;
    private String ort;
    private String etc;

    public Mitarbeiter(String vorname, String nachname, String strasse, String hausnr, String plz, String ort, String etc) {
        super(vorname, nachname);
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
        this.etc = etc;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
    public int compareStrasse(Mitarbeiter m1, Mitarbeiter m2)
    {
        return m1.strasse.compareTo(m2.strasse);
    }
}
