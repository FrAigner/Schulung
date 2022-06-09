package Objektorientierung.abstrackteKlasse;

public class SportTicket extends Ticket{

    private int pokalStufe;
    public SportTicket(String ort, String name, int preis, int stufe) {
        super(ort, name, preis);
        pokalStufe = stufe;
    }

    @Override
    public int berechneTicketpreis() {
        ticketPreis = basisPreis + (10*pokalStufe);
        return ticketPreis;
    }
}
