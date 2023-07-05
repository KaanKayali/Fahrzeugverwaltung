package KaKaBWZ;

import java.time.LocalDate;

public class Fahrzeug {
    //Variablen
    protected String marke;
    protected String modell;
    protected int hubraum;
    protected String Treibstoffart;
    protected int AktuellerKmStand;
    protected int Leistung;
    protected String Aussenfarbe;
    protected String Erstzulassung;
    protected int Lehrgewicht;

    //Methoden


    //Getter & Setter
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public String getTreibstoffart() {
        return Treibstoffart;
    }

    public void setTreibstoffart(String treibstoffart) {
        Treibstoffart = treibstoffart;
    }

    public int getAktuellerKmStand() {
        return AktuellerKmStand;
    }

    public void setAktuellerKmStand(int aktuellerKmStand) {
        AktuellerKmStand = aktuellerKmStand;
    }

    public int getLeistung() {
        return Leistung;
    }

    public void setLeistung(int leistung) {
        Leistung = leistung;
    }

    public String getAussenfarbe() {
        return Aussenfarbe;
    }

    public void setAussenfarbe(String aussenfarbe) {
        Aussenfarbe = aussenfarbe;
    }

    public String getErstzulassung() {
        return Erstzulassung;
    }

    public void setErstzulassung(String erstzulassung) {
        Erstzulassung = erstzulassung;
    }

    public int getLehrgewicht() {
        return Lehrgewicht;
    }

    public void setLehrgewicht(int lehrgewicht) {
        Lehrgewicht = lehrgewicht;
    }
}
