package de.pcCollege.abstrakteKlasse.ticketShop;

public abstract class Ticket {
    protected int basisPreis;
    protected int ticketPreis;
    private String eventOrt;
    private String eventName;

    public Ticket(String ort, String name,
                  int preis) {
        eventOrt = ort;
        eventName = name;
        basisPreis = preis;
    }

    // Abstrakte Methode
    public abstract int
    berechneTicketpreis();
}
