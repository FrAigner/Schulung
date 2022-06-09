package de.pcCollege.objektOrientierung.ohneAbstrakt;

public class Ticket {
    private String eventOrt;
    private String eventName;
    protected int basisPreis;
    protected int ticketPreis;
    public Ticket (String ort, String name,
                   int preis) {
        eventOrt = ort;
        eventName = name;
        basisPreis = preis;
    }
}
