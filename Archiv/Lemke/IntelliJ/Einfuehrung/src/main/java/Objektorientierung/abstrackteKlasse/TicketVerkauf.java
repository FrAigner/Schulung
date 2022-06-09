package Objektorientierung.abstrackteKlasse;

public class TicketVerkauf {
    public static void main(String[] args) {
        Ticket [] vTickets = new Ticket[8];
        vTickets[0] = new SportTicket("LONDON", "CHE-MAN", 50, 4);
        vTickets[1] = new KonzertTicket("BERLIN", "BACH", 74, 37);
        vTickets[2] = new KinoTicket("DRESDEN", "HONEY", 9, 165);
        vTickets[3] = new SportTicket("ERFURT", "ERF-DYN", 12, 0);
        vTickets[4] = new KonzertTicket("STUTTGART", "TARZAN", 99, 8);
        vTickets[5] = new SportTicket("BARCELONA", "BAR-MAD", 125, 7);
        vTickets[6] = new KonzertTicket("PORTO", "MARIA PIRES", 79, 1);
        vTickets[7] = new KinoTicket("PARIS", "PANEM", 10, 142);
        double umsatz = 0;
        for (int i = 0; i < vTickets.length; i++) {
            umsatz += vTickets[i].berechneTicketpreis();
        }
        System.out.println("Umsatz " + umsatz);
    }
}
