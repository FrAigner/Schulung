package de.pcCollege.Vorlage;

public class Pizzabestellung {
    //
    int durchmesser;
    boolean extraKaese;
    int anzahl;
    double preis;

    public Pizzabestellung(int durchmesser, boolean extraKaese, int anzahl) {
        this.durchmesser = durchmesser;
        this.extraKaese = extraKaese;
        this.anzahl = anzahl;
    }

    public Pizzabestellung(int durchmesser, boolean extraKaese) {
        this.durchmesser = durchmesser;
        this.extraKaese = extraKaese;
    }

    public Pizzabestellung(boolean extraKaese) {
        this.extraKaese = extraKaese;
        // pro pizza 0,50€
    }

    public Pizzabestellung(int durchmesser) {
        this.durchmesser = durchmesser;
        // Durchmesser 26 cm 6,50 €
        // Durchmesser 30 cm 8,00 €
        // Durchmesser 44 cm 15,00 €
    }

    public double getPreis() {
        // Berechnung des Preises anhand des Durchmessers
        if (durchmesser == 26){
            this.preis = 6.50;
        } else if (durchmesser == 30){
            this.preis = 8.00;
        } else if (durchmesser == 44){
            this.preis = 15.00;
        }
        // Alternativ
        switch (durchmesser)
        {
            case 26: this.preis = 6.50; break;
            case 30: this.preis = 8.00; break;
            case 44: this.preis = 15.00; break;
            default: this.preis = durchmesser * 2.0;
        }
        // Berücksichtigung von Extra Käse
        if (extraKaese){
            this.preis = this.preis + 0.50;
        }
        // Berücksichtigung der Anzahl
        this.preis = this.preis * anzahl;
        // Ab einer Anzahl von 10 Pizzen wird 1 Prozent Rabatt berücksichtigt
        if(anzahl>10)
        {
            this.preis *= 0.99;
        }
        return this.preis;
    }

    @Override
    public String toString() {
        return "Pizzabestellung{" +
                "durchmesser=" + durchmesser +
                ", extraKaese=" + extraKaese +
                ", anzahl=" + anzahl +
                ", preis=" + preis +
                '}';
    }
}
