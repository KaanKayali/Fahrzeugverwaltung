package KaKaBWZ;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persistence {
    private String filenamefahrzeug = "fahrzeuge.json";
    private String filenamekunden = "kunden.json";

    private String filenamemitarbeiter = "mitarbeiter.json";
    private ObjectMapper mapper;

    public Persistence() {
        mapper = new ObjectMapper();
    }

    //Fahrzeuge
    public void saveFahrzeug(ArrayList<Fahrzeug> fahrzeug) {
        try {
            File jsonFile = new File(filenamefahrzeug);
            mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, fahrzeug);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public ArrayList<Fahrzeug> loadFahrzeuge() {
        ArrayList<Fahrzeug> fahrzeugelist = new ArrayList<>();
        try {
            File jsonFile = new File(filenamefahrzeug);
            if (jsonFile.exists()) {
                Fahrzeug[] fahrzeugarray = mapper.readValue(jsonFile, Fahrzeug[].class);
                for (Fahrzeug fahrzeuge : fahrzeugarray) {
                    fahrzeugelist.add(fahrzeuge);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return fahrzeugelist;
    }

    //Mitarbeiter
    public void saveMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter) {
        try {
            File jsonFile = new File(filenamemitarbeiter);
            mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, mitarbeiter);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public ArrayList<Mitarbeiter> loadMitarbeiter() {
        ArrayList<Mitarbeiter> mitarbeiterlist = new ArrayList<>();
        try {
            File jsonFile = new File(filenamemitarbeiter);
            if (jsonFile.exists()) {
                Mitarbeiter[] mitarbeiterarray = mapper.readValue(jsonFile, Mitarbeiter[].class);
                for (Mitarbeiter mitarbeiter : mitarbeiterarray) {
                    mitarbeiterlist.add(mitarbeiter);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return mitarbeiterlist;
    }

    //Kunden
    public void saveKunde(ArrayList<Kunde> kunde) {
        try {
            File jsonFile = new File(filenamekunden);
            mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, kunde);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public ArrayList<Kunde> loadKunde() {
        ArrayList<Kunde> kundenlist = new ArrayList<>();
        try {
            File jsonFile = new File(filenamekunden);
            if (jsonFile.exists()) {
                Kunde[] kundenarray = mapper.readValue(jsonFile, Kunde[].class);
                for (Kunde kunden : kundenarray) {
                    kundenlist.add(kunden);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return kundenlist;
    }
}