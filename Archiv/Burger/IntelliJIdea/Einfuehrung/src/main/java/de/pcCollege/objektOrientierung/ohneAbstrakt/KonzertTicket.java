package de.pcCollege.objektOrientierung.ohneAbstrakt;

public class KonzertTicket extends Ticket{
    private int sitzReihe;

    public KonzertTicket(String ort, String name, int preis, int sitzReihe) {
        super(ort, name, preis);
        this.sitzReihe = sitzReihe;
    }
    public int berechneTicketPreis()
    {
        ticketPreis = basisPreis*(1 +
                1/sitzReihe);
        return ticketPreis;
    }
}
