package Objektorientierung.Vorlagen;

public class Pizza {
    int durchmesser;
    boolean extraKaese;
    int anzahl;
    double preis;

    public Pizza(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    public Pizza(boolean extraKaese) {
        this.extraKaese = extraKaese;
    }

    public Pizza(int durchmesser, boolean extraKaese) {
        this.durchmesser = durchmesser;
        this.extraKaese = extraKaese;
    }

    public Pizza(int durchmesser, boolean extraKaese, int anzahl) {
        this.durchmesser = durchmesser;
        this.extraKaese = extraKaese;
        this.anzahl = anzahl;
    }

    public double getPreis() {
        //Preis nach Durchmesser
        switch (durchmesser)
        {
            case 26: this.preis = 6.50; break;
            case 30: this.preis = 8.50; break;
            case 44: this.preis = 15.00; break;
            default: this.preis = durchmesser * 2.50;
        }
        //Berücksichtigung extra Käse
        if (extraKaese){
            this.preis = this.preis + 0.50;
        }
        //Berücksichtigung der Anzahl
        this.preis = this.preis * anzahl;
        // Ab einer Anzahl von 10 Pizzen wird 1 Prozent rabatt
        if(anzahl>10)
        {
            this.preis = this.preis * 0.99;
        }
        return this.preis;
    }

}
