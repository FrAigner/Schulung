package Objektorientierung.Vorlagen;

public class Smartphone {
    private static int anzahl;
    // Eigenschaften der Instanz
    private int lautstaerke;
    private int limit;
    private String telefonnummer;
    private boolean status;

    // Konstruktoren
    public Smartphone() {
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

    // getter & Setter
    public static int getAnzahl() {
        return anzahl;
    }

    public void setlautstaerke(int lautstaerke) {
        if (lautstaerke > limit) {
            this.lautstaerke = limit;
        } else {
            this.lautstaerke = lautstaerke;
        }
    }

    public int getlautstaerke() {
        return lautstaerke;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void telefonieren(String telefonnummer) {
        // Telefonnummer anrufen
    }
    // Methoden

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

//    public Bild fotografieren()
//    {
//        Bild bild = new Bild();
//        return bild;
//    }

//    public Sound abspielenSound(String soundBezeichnung)
//    {
//        return new Sound(soundBezeichnung);
//    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "lautstaerke=" + lautstaerke +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", status=" + status +
                '}';
    }
}
