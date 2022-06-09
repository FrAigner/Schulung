package Objektorientierung.Vorlagen;

public class MotorFahrzeug extends Fahrzeug{
    private int motorleistung;

    // Konstruktor
    public MotorFahrzeug(int motorleistung) {
        this.motorleistung = motorleistung;
    }

    public MotorFahrzeug(int limiter, int motorleistung) {
        super(limiter);
        this.motorleistung = motorleistung;
    }

    // Getter & Setter


    public int getMotorleistung() {
        return motorleistung;
    }

    public void setMotorleistung(int motorleistung) {
        this.motorleistung = motorleistung;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMotorFahrzeug:" +
                "Motorleistung in PS =" + motorleistung +
                " " ;
    }
}
