package Objektorientierung.abstrackteKlasse;

public class KinoTicket extends Ticket{

    private int filmDauer;
    public KinoTicket(String ort, String name, int preis, int dauer) {
        super(ort, name, preis);
        filmDauer = dauer;
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
