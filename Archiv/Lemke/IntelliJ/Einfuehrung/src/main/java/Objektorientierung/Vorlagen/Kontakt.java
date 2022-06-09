package Objektorientierung.Vorlagen;

public class Kontakt extends PersonBasis {
    // zusätzliche Instanzenvariable
    private String email;
    private String telefon;

    //

    public Kontakt(){
        super();
        this.email = "";
        this.telefon = "";
    }

    public Kontakt(String vorname, String nachname, String email) {
        super(vorname, nachname);
        this.email = email;
    }

    public Kontakt(String vorname, String nachname, String email, String telefon) {
        super(vorname, nachname);
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nKontakt:" +
                "E-Mail='" + email + '\'' +
                ", Telefon='" + telefon + '\'' +
                " ";
    }
}
