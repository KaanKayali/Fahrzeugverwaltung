package KaKaBWZ;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Program {
    //Variablen
    public static String Stelle = "";

    public static void main(String[] args) {

        //Instanzieren
        Persistence persistence = new Persistence();
        User user = new User();

        //Ablauf
        new Program().Beginning(); //Beginning
    }

    public void Beginning(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        LoginRegister loginRegister = new LoginRegister();

        //Timer
        boolean Out_1 = false;

        //Title
        System.out.println("-------------------------------------");
        System.out.println(" _____   ______    __  __    ______    _____    _____    __   __    _____");
        System.out.println("|  ___| |  __  |  | |__| |  |  __  |  |_   _|  |  ___|  |  | |  |  |  ___|");
        System.out.println("|  __|  |  __  |  |  __  |  |  __ |    / /_    |  _|_   |  |_|  |  | |_| |");
        System.out.println("|_|     |_|  |_|  |_|  |_|  |_|  |_|  |_____|  |_____|  |_______|  |_____|");
        System.out.println(" ");
        System.out.println(" Verwaltung");
        System.out.println("-------------------------------------");

        //Eingabe
        while(!Out_1) {
            System.out.println("");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Beenden");
            System.out.println("\n");

            String pick = console.nextLine();
            if(pick.equals("1")) {
                //Register
                loginRegister.Register();
                Out_1 = true;
            }
            else if(pick.equals("2")){
                //Login
                loginRegister.Login();
                Out_1 = true;
            }
            else if(pick.equals("3")){
                //Exit game
                System.exit(0);
            }
            else{
                System.out.println("ungueltige Eingabe!");
            }
        }

        //End of Method
        System.out.print("\033\143");

    }



    public void Mitarbeiter(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        FahrzeugController fahrzeugController = new FahrzeugController();


        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        //Variablen

        //Title
        System.out.println("----------------------------");
        System.out.println("-Mitarbeiter");

        //Eingabe
        while(!Out_1) {
            System.out.println("");
            System.out.println("1. Fahrzeug hinzufügen");
            System.out.println("2. Fahrzeug löschen");
            System.out.println("3. Fahrzeuge ansehen");
            System.out.println("4. Fahrzeug verwalten");
            System.out.println("5. Abmelden");
            System.out.println("\n");

            String pick = console.nextLine();
            if(pick.equals("1")) {
                //Fahrzeug hinzufügen
                fahrzeugController.Fahrzeugehinzufügen();
            }
            else if(pick.equals("2")){
                //Fahrzeug löschen
                fahrzeugController.Fahrzeuglöschen();
            }
            else if(pick.equals("3")){
                //Fahrzeug anschauen
                fahrzeugController.Fahrzeugeansehen();
            }
            else if(pick.equals("4")){
                //Fahrzeug verwalten
                fahrzeugController.Fahrzeugverwalten();
            }
            else if(pick.equals("5")){
                //Abmelden
                Out_1 = true;
            }
            else{
                System.out.println("ungueltige Eingabe!");
            }
        }

        //Abmelden
        Stelle = "";
        Beginning();

        //End of Method
        System.out.print("\033\143");
    }

    public void Kundenberater(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        KundenController kundenController = new KundenController();

        //Timer
        boolean Out_1 = false;

        //Variablen

        //Title
        System.out.println("----------------------------");
        System.out.println("-Kundenberater");

        //Eingabe
        while(!Out_1) {
            System.out.println("");
            System.out.println("1. Kunde hinzufügen");
            System.out.println("2. Kunde löschen");
            System.out.println("3. Kunden ansehen");
            System.out.println("4. Kunde verwalten");
            System.out.println("5. Abmelden");
            System.out.println("\n");

            String pick = console.nextLine();
            if(pick.equals("1")) {
                //Kunde hinzufügen
                kundenController.Kundenhinzufügen();
            }
            else if(pick.equals("2")){
                //Kunde löschen
                kundenController.Kundenlöschen();
            }
            else if(pick.equals("3")){
                //Kunde anschauen
                kundenController.Kundenansehen();
            }
            else if(pick.equals("4")){
                //Kunde verwalten
                kundenController.Kundenlöschen();
            }
            else if(pick.equals("5")){
                //Abmelden
                Out_1 = true;
            }
            else{
                System.out.println("ungueltige Eingabe!");
            }
        }

        //Abmelden
        Stelle = "";
        Beginning();

        //End of Method
        System.out.print("\033\143");
    }

    public void Administrator(){
        //Instanzieren
        Scanner console = new Scanner(System.in);
        KundenController kundenController = new KundenController();
        FahrzeugController fahrzeugController = new FahrzeugController();
        AdministratorController administratorController = new AdministratorController();

        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        //Variablen

        //Title
        System.out.println("----------------------------");
        System.out.println("#Administrator");

        //Eingabe
        while(!Out_1) {
            System.out.println("");
            System.out.println("1. Kunden verwalten");
            System.out.println("2. Fahrzeuge verwalten");
            System.out.println("3. Mitarbeiter verwalten");
            System.out.println("4. Abmelden");
            System.out.println("\n");

            String pick = console.nextLine();
            if(pick.equals("1")) {

                while(!Out_2) {
                    //Eingabe
                    System.out.println("");
                    System.out.println("1. Kunde hinzufügen");
                    System.out.println("2. Kunde löschen");
                    System.out.println("3. Kunden ansehen");
                    System.out.println("4. Kunde verwalten");
                    System.out.println("5. Zurück");
                    System.out.println("\n");

                    String pick_2 = console.nextLine();
                    if(pick_2.equals("1")) {
                        //Kunde hinzufügen
                        administratorController.Kundenhinzufügen();
                    }
                    else if(pick_2.equals("2")){
                        //Kunde löschen
                        administratorController.Kundenlöschen();
                    }
                    else if(pick_2.equals("3")){
                        //Kunde anschauen
                        administratorController.Kundenansehen();
                    }
                    else if(pick_2.equals("4")){
                        //Kunde verwalten
                        administratorController.Kundenverwalten();
                    }
                    else if(pick_2.equals("5")){
                        //Zurück
                        Out_2 = true;
                    }
                    else{
                        System.out.println("ungueltige Eingabe!");
                    }
                }
            }
            else if(pick.equals("2")){
                //Eingabe
                while(!Out_3) {
                    System.out.println("");
                    System.out.println("1. Fahrzeug hinzufügen");
                    System.out.println("2. Fahrzeug löschen");
                    System.out.println("3. Fahrzeuge ansehen");
                    System.out.println("4. Fahrzeug verwalten");
                    System.out.println("5. Zurück");
                    System.out.println("\n");

                    String pick_2 = console.nextLine();
                    if(pick_2.equals("1")) {
                        //Fahrzeug hinzufügen
                        administratorController.Fahrzeugehinzufügen();
                    }
                    else if(pick_2.equals("2")){
                        //Fahrzeug löschen
                        administratorController.Fahrzeuglöschen();
                    }
                    else if(pick_2.equals("3")){
                        //Fahrzeug anschauen
                        administratorController.Fahrzeugeansehen();
                    }
                    else if(pick_2.equals("4")){
                        //Fahrzeug verwalten
                        administratorController.Fahrzeugverwalten();
                    }
                    else if(pick_2.equals("5")){
                        //Zurück
                        Out_3 = true;
                    }
                    else{
                        System.out.println("ungueltige Eingabe!");
                    }
                }
            }
            else if(pick.equals("3")){
                //Eingabe
                while(!Out_4) {
                    System.out.println("");
                    System.out.println("1. Mitarbeiter löschen");
                    System.out.println("2. Mitarbeiter ansehen");
                    System.out.println("3. Mitarbeiter verwalten");
                    System.out.println("4. Zurück");
                    System.out.println("\n");

                    String pick_2 = console.nextLine();
                    if(pick_2.equals("1")){
                        //Mitarbeiter löschen
                        administratorController.Mitarbeiterlöschen();
                    }
                    else if(pick_2.equals("2")){
                        //Mitarbeiter anschauen
                        administratorController.Mitarbeiteransehen();
                    }
                    else if(pick_2.equals("3")){
                        //Mitarbeiter verwalten
                        administratorController.Mitarbeiterverwalten();
                    }
                    else if(pick_2.equals("4")){
                        //Zurück
                        Out_4 = true;
                    }
                    else{
                        System.out.println("ungueltige Eingabe!");
                    }
                }
            }
            else if(pick.equals("4")){
                //Abmelden
                Out_1 = true;
            }
            else{
                System.out.println("ungueltige Eingabe!");
            }
        }

        //Abmelden
        Stelle = "";
        Beginning();

        //End of Method
        System.out.print("\033\143");
    }

}
