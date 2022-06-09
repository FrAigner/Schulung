package de.pcCollege.abstrakteKlasse.ticketShop;

public class KonzertTicket extends Ticket {
    private int sitzReihe;

    public KonzertTicket(String ort, String
            name, int preis, int reihe) {
        super(ort, name, preis);
        sitzReihe = reihe;
    }

    @Override
    public int berechneTicketpreis() {
        ticketPreis = basisPreis * (1 +
                1 / sitzReihe);
        return ticketPreis;
    }
}
