package KaKaBWZ;

public class User {

    //Attribute
    private boolean isAdministrator;
    private boolean isMitarbeiter;
    private boolean isKundenberater;

    //Methoden
    public void Kundenverwaltung(){

    }

    public void Mitarbeiterverwaltung(){

    }

    public void Loginverwaltung(){

    }

    //Getter & Setter
    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    public boolean isMitarbeiter() {
        return isMitarbeiter;
    }

    public void setMitarbeiter(boolean mitarbeiter) {
        isMitarbeiter = mitarbeiter;
    }

    public boolean isKundenberater() {
        return isKundenberater;
    }

    public void setKundenberater(boolean kundenberater) {
        isKundenberater = kundenberater;
    }
}
