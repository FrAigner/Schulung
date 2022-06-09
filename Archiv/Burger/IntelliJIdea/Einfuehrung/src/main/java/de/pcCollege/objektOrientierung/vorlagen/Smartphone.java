package de.pcCollege.objektOrientierung.vorlagen;

public class Smartphone {
    // Klassenvariable
    private static int anzahl;
    // Eigenschaften der Instanz
    private int lautstaerke;
    private int limit;
    private boolean status;

    private String eigeneTelefonnummer;

    // Standardkonstruktor
    public Smartphone()
    {
        this.limit = 100;
        anzahl++;
    }
    // Überladene Konstruktoren
    public Smartphone(int limit)
    {
        this.limit = limit;
        anzahl++;
    }

    public Smartphone(int limit, String eigeneTelefonnummer)
    {
        this.limit = limit;
        this.eigeneTelefonnummer = eigeneTelefonnummer;
        anzahl++;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if(lautstaerke>limit) {
            this.lautstaerke = limit;
        }
        else
        {
            this.lautstaerke = lautstaerke;
        }

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
//        if(this.status)
//        {
//            this.status = false;
//        }
//        else
//        {
//            this.status = true;
//        }
        this.status = status;
    }

    public String getEigeneTelefonnummer() {
        return eigeneTelefonnummer;
    }

    // Methoden für Simulation
    public void telefonieren(String telefonnummer)
    {
        // telefonnummer anrufen
    }
    //    public Bild fotografieren()
//    {
//        return new Bild();
//    }
//    public Sound abspielenSound(String soundDateiName)
//    {
//        return new Sound();
//    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "lautstaerke=" + lautstaerke +
                ", status=" + status +
                ", eigeneTelefonnummer='" + eigeneTelefonnummer + '\'' +
                '}';
    }
}
