package KaKaBWZ;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kunde {
    //Variablen
    private String vorname;
    private String nachname;
    private String ort;
    private String strasse;
    private int PLZ;
    private String Mobile;
    private String email;
    private String verkausfdatum;

    private int kundengeld;

    //Getter & Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPLZ() {
        return PLZ;
    }

    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKundengeld() {
        return kundengeld;
    }

    public void setKundengeld(int kundengeld) {
        this.kundengeld = kundengeld;
    }

    public String getVerkausfdatum() {
        return verkausfdatum;
    }

    public void setVerkausfdatum(String verkausfdatum) {
        this.verkausfdatum = verkausfdatum;
    }
}
