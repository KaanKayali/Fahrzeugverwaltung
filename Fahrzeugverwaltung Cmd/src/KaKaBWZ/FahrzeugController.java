package KaKaBWZ;

import java.util.Scanner;

public class FahrzeugController {

    //Methoden
    public void Fahrzeugehinzufügen() {
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Fahrzeug fahrzeug = new Fahrzeug();
        Auto auto = new Auto();
        Transporter transporter = new Transporter();


        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;

        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        while(!Out_1) {
            System.out.print("Fahrzeug(Auto/Transporter): ");
            String pick_2 = console.nextLine();

            //Fahrzeug
            if(pick_2.equals("Auto")){
                //Auto gültig
                while(!Out_2) {
                    System.out.print("Marke: ");
                    fahrzeug.setMarke(console.nextLine());

                    System.out.print("Modell: ");
                    fahrzeug.setModell(console.nextLine());

                    System.out.print("Hubraum (ccm): ");
                    fahrzeug.setHubraum(Integer.parseInt(console.nextLine()));

                    System.out.print("Treibstoffart (Benzin, Diesel, Elektrisch): ");
                    fahrzeug.setTreibstoffart(console.nextLine());

                    System.out.print("Aktueller Km-Stand: ");
                    fahrzeug.setAktuellerKmStand(Integer.parseInt(console.nextLine()));

                    System.out.print("Leistung (PS): ");
                    fahrzeug.setLeistung(Integer.parseInt(console.nextLine()));

                    System.out.print("Erstzulassung (datum): ");
                    fahrzeug.setErstzulassung(console.nextLine());

                    System.out.print("Aussenfarbe: ");
                    fahrzeug.setAussenfarbe(console.nextLine());

                    System.out.print("Lehrgewicht (kg): ");
                    fahrzeug.setLehrgewicht(Integer.parseInt(console.nextLine()));

                    System.out.print("Aufbau (Kleinwagen, Limousine, Kombi, SUV, Cabriolet): ");
                    auto.setAufbau(console.nextLine());

                    System.out.print("Navigationssystem (ja, nein):");
                    String navigationssytem = console.nextLine();
                    if (navigationssytem.equals("ja")) {
                        auto.setNavigationssystem(true);
                    } else if (navigationssytem.equals("nein")) {
                        auto.setNavigationssystem(false);
                    }

                    //Adding
                    modell.addFahrzeug(fahrzeug);

                    Out_2 = true;
                }
            }
            else if(pick_2.equals("Transporter")){
                //Transporter gültig
                while(!Out_2) {
                    System.out.print("Marke: ");
                    fahrzeug.setMarke(console.nextLine());

                    System.out.print("Modell: ");
                    fahrzeug.setModell(console.nextLine());

                    System.out.print("Hubraum (ccm): ");
                    fahrzeug.setHubraum(Integer.parseInt(console.nextLine()));

                    System.out.print("Treibstoffart (Benzin, Diesel, Elektrisch): ");
                    fahrzeug.setTreibstoffart(console.nextLine());

                    System.out.print("Aktueller Km-Stand: ");
                    fahrzeug.setAktuellerKmStand(Integer.parseInt(console.nextLine()));

                    System.out.print("Leistung (PS): ");
                    fahrzeug.setLeistung(Integer.parseInt(console.nextLine()));

                    System.out.print("Erstzulassung (datum): ");
                    fahrzeug.setErstzulassung(console.nextLine());

                    System.out.print("Aussenfarbe: ");
                    fahrzeug.setAussenfarbe(console.nextLine());

                    System.out.print("Lehrgewicht (kg): ");
                    fahrzeug.setLehrgewicht(Integer.parseInt(console.nextLine()));

                    System.out.print("Maximale Zuladung (kg): ");
                    transporter.setMaximaleZuladung(Integer.parseInt(console.nextLine()));

                    //Adding
                    modell.addFahrzeug(fahrzeug);

                    Out_2 = true;

                }

            }
            else{
                //Auto ungültige Eingabe
                System.out.println("ungueltige Eingabe!");
            }

            Out_1 = true;
        }

        Out_1 = false;
        Out_2 = false;
    }

    public void Fahrzeuglöschen() {
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Fahrzeug fahrzeug = new Fahrzeug();
        Auto auto = new Auto();
        Transporter transporter = new Transporter();

        for (int i = 0; i < modell.getFahrzeugelist().size(); i++) {
            System.out.println(i + ". " + modell.getFahrzeugelist().get(i).getMarke() + " " + modell.getFahrzeugelist().get(i).getModell() + " " + modell.getFahrzeugelist().get(i).getAussenfarbe());
        }

        //Fahrzeug auswählen
        System.out.print("Welches Fahrzeug? (Index): ");
        String pick_1 = console.nextLine();

        if (Integer.parseInt(pick_1) < modell.getFahrzeugelist().size()) {
            //Removing
            modell.removeMitarbeiter(modell.getMitarbeiterliste().get(Integer.parseInt(pick_1)));

        }
        else{
            System.out.println("Zu grosser Index");
        }

    }

    public void Fahrzeugeansehen() {
        //Instanzieren
        Modell modell = new Modell();
        Fahrzeug fahrzeug = new Fahrzeug();

        for (int i = 0; i < modell.getFahrzeugelist().size(); i++){
            System.out.println(i + ". " + modell.getFahrzeugelist().get(i).getMarke() + " " + modell.getFahrzeugelist().get(i).getModell() + " " + modell.getFahrzeugelist().get(i).getAussenfarbe());
        }
    }

    public void Fahrzeugverwalten() {
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Fahrzeug fahrzeug = new Fahrzeug();
        Auto auto = new Auto();
        Transporter transporter = new Transporter();

        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        while (!Out_1) {
            //Alle Fahrzeuge anzeigen
            for (int i = 0; i < modell.getFahrzeugelist().size(); i++) {
                System.out.println(i + ". " + modell.getFahrzeugelist().get(i).getMarke() + " " + modell.getFahrzeugelist().get(i).getModell() + " " + modell.getFahrzeugelist().get(i).getAussenfarbe());
            }

            //Fahrzeug auswählen
            System.out.print("Welches Fahrzeug? (Index): ");
            String pick_2 = console.nextLine();

            if (Integer.parseInt(pick_2) < modell.getFahrzeugelist().size()) {
                while (!Out_2) {
                    System.out.print("Fahrzeug(Auto/Transporter): ");
                    String pick_3 = console.nextLine();

                    //Fahrzeug
                    if (pick_3.equals("Auto")) {
                        //Auto gültig
                        while (!Out_3) {
                            System.out.print("Marke: ");
                            fahrzeug.setMarke(console.nextLine());

                            System.out.print("Modell: ");
                            fahrzeug.setModell(console.nextLine());

                            System.out.print("Hubraum (ccm): ");
                            fahrzeug.setHubraum(Integer.parseInt(console.nextLine()));

                            System.out.print("Treibstoffart (Benzin, Diesel, Elektrisch): ");
                            fahrzeug.setTreibstoffart(console.nextLine());

                            System.out.print("Aktueller Km-Stand: ");
                            fahrzeug.setAktuellerKmStand(Integer.parseInt(console.nextLine()));

                            System.out.print("Leistung (PS): ");
                            fahrzeug.setLeistung(Integer.parseInt(console.nextLine()));

                            System.out.print("Erstzulassung (datum): ");
                            fahrzeug.setErstzulassung(console.nextLine());

                            System.out.print("Aussenfarbe: ");
                            fahrzeug.setAussenfarbe(console.nextLine());

                            System.out.print("Lehrgewicht (kg): ");
                            fahrzeug.setLehrgewicht(Integer.parseInt(console.nextLine()));

                            System.out.print("Aufbau (Kleinwagen, Limousine, Kombi, SUV, Cabriolet): ");
                            auto.setAufbau(console.nextLine());

                            System.out.print("Navigationssystem (ja, nein):");
                            String navigationssytem = console.nextLine();
                            if (navigationssytem.equals("ja")) {
                                auto.setNavigationssystem(true);
                            } else if (navigationssytem.equals("nein")) {
                                auto.setNavigationssystem(false);
                            }

                            //Adding and removing
                            modell.addFahrzeug(fahrzeug);
                            modell.removeFahrzeug(modell.getFahrzeugelist().get(Integer.parseInt(pick_2)));

                            Out_3 = true;
                        }
                    } else if (pick_3.equals("Transporter")) {
                        //Transporter gültig
                        while (!Out_3) {
                            System.out.print("Marke: ");
                            fahrzeug.setMarke(console.nextLine());

                            System.out.print("Modell: ");
                            fahrzeug.setModell(console.nextLine());

                            System.out.print("Hubraum (ccm): ");
                            fahrzeug.setHubraum(Integer.parseInt(console.nextLine()));

                            System.out.print("Treibstoffart (Benzin, Diesel, Elektrisch): ");
                            fahrzeug.setTreibstoffart(console.nextLine());

                            System.out.print("Aktueller Km-Stand: ");
                            fahrzeug.setAktuellerKmStand(Integer.parseInt(console.nextLine()));

                            System.out.print("Leistung (PS): ");
                            fahrzeug.setLeistung(Integer.parseInt(console.nextLine()));

                            System.out.print("Erstzulassung (datum): ");
                            fahrzeug.setErstzulassung(console.nextLine());

                            System.out.print("Aussenfarbe: ");
                            fahrzeug.setAussenfarbe(console.nextLine());

                            System.out.print("Lehrgewicht (kg): ");
                            fahrzeug.setLehrgewicht(Integer.parseInt(console.nextLine()));

                            System.out.print("Maximale Zuladung (kg): ");
                            transporter.setMaximaleZuladung(Integer.parseInt(console.nextLine()));

                            //Adding and removing
                            modell.addFahrzeug(fahrzeug);
                            modell.removeFahrzeug(modell.getFahrzeugelist().get(Integer.parseInt(pick_2)));

                            Out_3 = true;

                        }

                    } else {
                        //Auto ungültige Eingabe
                        System.out.println("ungueltige Eingabe!");
                    }

                    Out_2 = true;
                }
            }

        }

        Out_1 = false;
        Out_2 = false;
        Out_3 = false;
    }
}

