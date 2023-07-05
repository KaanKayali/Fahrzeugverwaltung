package KaKaBWZ;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LoginRegister {

    public void Register(){
        //Instanzieren
        Program program = new Program();
        Scanner console = new Scanner(System.in);
        Persistence persistence = new Persistence();
        Modell modell = new Modell();
        Mitarbeiter mitarbeiter = new Mitarbeiter();
        User user = new User();

        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        //Variablen
        String vorname = "";
        String nachname = "";
        String email = "";
        String passwort = "";
        String stelle = "";

        //Title
        System.out.println("----------------------------");
        System.out.println("-Register");
        System.out.println("");


        //Eingabe
        //Vorname
        while(!Out_1) {
            System.out.print("Vorname   :");
            vorname = console.nextLine();

            //Regex
            boolean vornameRegex = Pattern.matches("^\\w{2,}$", vorname);

            if(vornameRegex) {
                //Vorname gültig
                mitarbeiter.setVorname(vorname);
                Out_1 = true;

            }
            else if(!vornameRegex){
                //Vorname ungültige Eingabe
                System.out.println("Vorname ungueltig!");
            }

        }

        //Nachname
        while(!Out_2) {
            System.out.print("Nachname  :");
            nachname = console.nextLine();

            //Regex
            boolean nachnameRegex = Pattern.matches("^\\w{3,}$", nachname);

            if(nachnameRegex) {
                //Nachname gültig
                mitarbeiter.setNachname(nachname);
                Out_2 = true;

            }
            else if(!nachnameRegex){
                //Nachname ungültige Eingabe
                System.out.println("Nachname ungueltig!");
            }
        }

        System.out.println("");

        //Email
        while(!Out_3) {
            System.out.print("Email :");
            email = console.nextLine();

            //Regex
            boolean emailRegex = Pattern.matches("^\\w+\\@+\\w+\\.\\w{2,4}$", email);

            if(emailRegex) {
                //Email gültig
                mitarbeiter.setEmail(email);
                Out_3 = true;

            }
            else if(!emailRegex){
                //Email ungültige Eingabe
                System.out.println("Email ungueltig!");
            }
        }

        //Passwort
        while(!Out_4) {
            System.out.print("Passwort :");
            passwort = console.nextLine();

            //Regex
            boolean passwortRegex = Pattern.matches("^.{8,}$", passwort);

            if(passwortRegex) {
                //Passwort gültig
                mitarbeiter.setPasswort(passwort);
                Out_4 = true;

            }
            else if(!passwortRegex){
                //Passwort ungültige Eingabe
                System.out.println("Passwort ungültig! (mindestens 8 Zeichen)");
            }
        }

        System.out.println("");

        //Stelle
        while(!Out_5) {
            System.out.print("Deine Stelle(M=Mitarbeiter/K=Kundenberater/A=Administrator):");
            stelle = console.nextLine();

            //Regex
            boolean stelleRegex = Pattern.matches("^(M|K|A)$", stelle);

            if(stelleRegex) {
                //Stelle gültig
                mitarbeiter.setStelle(stelle);
                program.Stelle = stelle;
                Out_5 = true;

            }
            else if(!stelleRegex){
                //Stelle ungültige Eingabe
                System.out.println("ungueltige Stelle!");
            }
        }

        //Saving
        modell.addMitarbeiter(mitarbeiter);

        //Add to Arraylist
        if(program.Stelle.equals("M")){
            program.Mitarbeiter();
        }
        else if(program.Stelle.equals("K")){
            program.Kundenberater();
        }
        else if(program.Stelle.equals("A")){
            program.Administrator();
        }



        //End of Method
        System.out.print("\033\143");
    }

    public void Login(){
        //Instanzieren
        Program program = new Program();
        Scanner console = new Scanner(System.in);
        Persistence persistence = new Persistence();
        Modell modell = new Modell();
        Mitarbeiter mitarbeiter = new Mitarbeiter();
        User user = new User();

        //Timer
        boolean Out_1 = false;
        boolean Out_2 = false;
        boolean Out_3 = false;
        boolean Out_4 = false;
        boolean Out_5 = false;

        //Variablen
        String email = "";
        String passwort = "";
        String TheMitarbeiterindexpassword = "";
        String Stelle = "";

        //Title
        System.out.println("----------------------------");
        System.out.println("-Login");
        System.out.println("");


        //Eingabe
        //Email
        while(!Out_1) {
            System.out.print("email   :");
            email = console.nextLine();

            for(Mitarbeiter themitarbeiter : modell.getMitarbeiterliste()){
                if(email.equals(themitarbeiter.getEmail())){
                    //Set Email
                    TheMitarbeiterindexpassword = themitarbeiter.getPasswort();
                    Stelle = themitarbeiter.getStelle();
                    Out_1 = true;
                }

            }

        }

        //Passwort
        while(!Out_2) {
            System.out.print("passwort   :");
            passwort = console.nextLine();
            if(passwort.equals(TheMitarbeiterindexpassword)){
                //Passwort gültig
                Out_2 = true;
            }
            else{
                //Passwort ungültige Eingabe
                System.out.println("Passwort ungueltig!");
            }
        }

        //Stelle gültig
        if(Stelle.equals("M")){
            program.Mitarbeiter();
        }
        else if(Stelle.equals("K")){
            program.Kundenberater();
        }
        else if(Stelle.equals("A")){
            program.Administrator();
        }

        //End of Method
        System.out.print("\033\143");
    }
}
