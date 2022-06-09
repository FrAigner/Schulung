package de.pcCollege.Vorlage;

public class Smartphone {
    //  Klassen variable
    private static int anzahl;
    //Eigenschaften der Instanz
    private int lautstaerke;
    private int limit;
    private boolean status;
    private String telefonnummer;

    // Konstruktoren

    public Smartphone() {
        this.limit = 100;
        anzahl++;
    }

    public Smartphone(int lautstaerke, int limit, boolean status, String telefonnummer) {
        this.lautstaerke = lautstaerke;
        this.limit = limit;
        this.status = status;
        this.telefonnummer = telefonnummer;
        anzahl++;
    }

    public Smartphone(int limit) {
        this.limit = limit;
        anzahl++;
    }

    public Smartphone(int limit, String telefonnummer) {
        this.limit = limit;
        this.telefonnummer = telefonnummer;
        anzahl++;
    }

    public static int getAnzahl() {
        return anzahl;
    }
    // Methoden

    //  Methoden für Simulation
    public void Telefonnummer(String telefonnummer) {
        //telefonnummer anrufen
    }
//    public  Bild fotografieren()
//    {
//        return new Bild();
//    }

//    public Sound abspielenSound(String soundDateiName)
//    {
//        return new Sound();
//    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if (lautstaerke > limit) {

            this.lautstaerke = limit;
        } else {
            this.lautstaerke = lautstaerke;
        }
    }


    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "lautstaerke=" + lautstaerke +
                ", status=" + status +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }
}
