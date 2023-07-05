package KaKaBWZ;

import java.util.Scanner;

public class KundenController {

    //Methoden
    public void Kundenhinzufügen(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Kunde kunde = new Kunde();
        Persistence persistence = new Persistence();

        //Timer
        boolean Out_1 = false;

        while(!Out_1) {
            //Kunde
            System.out.print("Vorname: ");
            kunde.setVorname(console.nextLine());

            System.out.print("Nachname: ");
            kunde.setNachname(console.nextLine());

            System.out.print("Ort: ");
            kunde.setOrt(console.nextLine());

            System.out.print("Strasse: ");
            kunde.setStrasse(console.nextLine());

            System.out.print("PLZ: ");
            kunde.setPLZ(Integer.parseInt(console.nextLine()));

            System.out.print("Mobile: ");
            kunde.setMobile(console.nextLine());

            System.out.print("E-Mail-Adresse: ");
            kunde.setEmail(console.nextLine());

            System.out.print("Verkaufsdatum: ");
            kunde.setVerkausfdatum(console.nextLine());

            System.out.print("Kundengeld: ");
            kunde.setKundengeld(Integer.parseInt(console.nextLine()));

            //Saving
            modell.addKunde(kunde);
            persistence.saveKunde(modell.getKundenlist());

            Out_1 = true;
        }
        Out_1 = false;
    }

    public void Kundenlöschen(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Kunde kunde = new Kunde();

        for (int i = 0; i < modell.getKundenlist().size(); i++){
            System.out.println(i + ". " + modell.getKundenlist().get(i).getVorname() + " " + modell.getKundenlist().get(i).getNachname() + " " + modell.getKundenlist().get(i).getEmail());
        }

        //Kunde auswählen
        System.out.print("Welcher Kunde? (Index): ");
        String pick_1 = console.nextLine();

        if (Integer.parseInt(pick_1) < modell.getKundenlist().size()) {
            //Removing
            modell.removeKunde(modell.getKundenlist().get(Integer.parseInt(pick_1)));
        }
        else{
            System.out.println("Zu grosser Index");
        }
    }

    public void Kundenansehen(){
        //Instanzieren
        Modell modell = new Modell();
        Kunde kunde = new Kunde();

        for (int i = 0; i < modell.getKundenlist().size(); i++){
            System.out.println(i + ". " + modell.getKundenlist().get(i).getVorname() + " " + modell.getKundenlist().get(i).getNachname() + " " + modell.getKundenlist().get(i).getEmail());
        }

    }

    public void Kundenverwalten(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        Modell modell = new Modell();
        Kunde kunde = new Kunde();
        Persistence persistence = new Persistence();

        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;

        while(!Out_1) {
            //Alle Kunden anzeigen
            for (int i = 0; i < modell.getKundenlist().size(); i++){
                System.out.println(i + ". " + modell.getKundenlist().get(i).getVorname() + " " + modell.getKundenlist().get(i).getNachname() + " " + modell.getKundenlist().get(i).getEmail());
            }

            //Kunde auswählen
            System.out.print("Welcher Kunde? (Index): ");
            String pick_1 = console.nextLine();

            if (Integer.parseInt(pick_1) < modell.getKundenlist().size()) {
                while (!Out_2) {
                    //Kunde
                    System.out.print("Vorname: ");
                    kunde.setVorname(console.nextLine());

                    System.out.print("Nachname: ");
                    kunde.setNachname(console.nextLine());

                    System.out.print("Ort: ");
                    kunde.setOrt(console.nextLine());

                    System.out.print("Strasse: ");
                    kunde.setStrasse(console.nextLine());

                    System.out.print("PLZ: ");
                    kunde.setPLZ(Integer.parseInt(console.nextLine()));

                    System.out.print("Mobile: ");
                    kunde.setMobile(console.nextLine());

                    System.out.print("E-Mail-Adresse: ");
                    kunde.setEmail(console.nextLine());

                    System.out.print("Verkaufsdatum: ");
                    kunde.setVerkausfdatum(console.nextLine());

                    System.out.print("Kundengeld: ");
                    kunde.setKundengeld(Integer.parseInt(console.nextLine()));

                    //Adding and removing
                    modell.addKunde(kunde);
                    modell.removeKunde(modell.getKundenlist().get(Integer.parseInt(pick_1)));

                    Out_2 = true;
                }
            }
            else{
                System.out.println("Zu grosser Index");
            }

            Out_1 = true;
        }
        Out_1 = false;
        Out_2 = false;
    }
}
