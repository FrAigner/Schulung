package de.pcCollege.Vorlage;

public class BuchVorlage {
    private String seitenanzahl;
    private String title;
    private boolean leihbar;

    public String getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(String seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isLeihbar() {
        return leihbar;
    }

    public void setLeihbar(boolean leihbar) {
        this.leihbar = leihbar;
    }
}
