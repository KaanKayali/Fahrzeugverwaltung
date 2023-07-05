package KaKaBWZ;

import java.util.ArrayList;

public class Modell {
    //Instanzieren
    Persistence persistence = new Persistence();

    //Attribute
    private ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<>();

    private ArrayList<Fahrzeug> fahrzeugelist = new ArrayList<>();
    private ArrayList<Kunde> kundenlist = new ArrayList<>();

    public Modell(){
        mitarbeiterliste = persistence.loadMitarbeiter();
        fahrzeugelist = persistence.loadFahrzeuge();
        kundenlist = persistence.loadKunde();
    }

    //Methoden
    public void addFahrzeug(Fahrzeug fahrzeug){
        fahrzeugelist.add(fahrzeug);
        persistence.saveFahrzeug(fahrzeugelist);
    }

    public void removeFahrzeug(Fahrzeug fahrzeug){
        fahrzeugelist.remove(fahrzeug);
        persistence.saveFahrzeug(fahrzeugelist);
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeiterliste.add(mitarbeiter);
        persistence.saveMitarbeiter(mitarbeiterliste);
    }

    public void removeMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeiterliste.remove(mitarbeiter);
        persistence.saveMitarbeiter(mitarbeiterliste);
    }

    public void addKunde(Kunde kunde){
        kundenlist.add(kunde);
        persistence.saveKunde(kundenlist);
    }

    public void removeKunde(Kunde kunde){
        kundenlist.remove(kunde);
        persistence.saveKunde(kundenlist);
    }

    //Getter & Setter
    public ArrayList<Mitarbeiter> getMitarbeiterliste() {
        return mitarbeiterliste;
    }

    public void setMitarbeiterliste(ArrayList<Mitarbeiter> mitarbeiterliste) {
        this.mitarbeiterliste = mitarbeiterliste;
    }

    public ArrayList<Fahrzeug> getFahrzeugelist() {
        return fahrzeugelist;
    }

    public void setFahrzeugelist(ArrayList<Fahrzeug> fahrzeugelist) {
        this.fahrzeugelist = fahrzeugelist;
    }

    public ArrayList<Kunde> getKundenlist() {
        return kundenlist;
    }

    public void setKundenlist(ArrayList<Kunde> kundenlist) {
        this.kundenlist = kundenlist;
    }
}
