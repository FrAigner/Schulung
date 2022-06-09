package de.pcCollege.objektOrientierung.abstrakteKlasse;

public class KinoTicket extends Ticket{
    private int filmDauer;

    public KinoTicket(String ort, String name, int preis, int filmDauer) {
        super(ort, name, preis);
        this.filmDauer = filmDauer;
    }

    @Override
    public int berechneTicketpreis() {
        ticketPreis = basisPreis;
        if (filmDauer > 150) {
            ticketPreis += 3;
        }
        return ticketPreis;
    }
}
