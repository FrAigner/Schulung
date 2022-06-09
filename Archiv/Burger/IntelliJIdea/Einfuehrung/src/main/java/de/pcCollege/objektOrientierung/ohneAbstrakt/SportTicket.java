package de.pcCollege.objektOrientierung.ohneAbstrakt;

public class SportTicket extends Ticket {
    private int pokalStufe;

    public SportTicket(String ort, String name, int preis, int pokalStufe) {
        super(ort, name, preis);
        this.pokalStufe = pokalStufe;
    }
    public int berechneTicketPreis()
    {
        ticketPreis = basisPreis +
                (10*pokalStufe);
        return ticketPreis;
    }
}
