package KaKaBWZ;

public class Auto extends Fahrzeug{
    //Variablen
    private String Aufbau;
    private boolean Navigationssystem;

    //Getter & Setter
    public String getAufbau() {
        return Aufbau;
    }

    public void setAufbau(String aufbau) {
        Aufbau = aufbau;
    }

    public boolean isNavigationssystem() {
        return Navigationssystem;
    }

    public void setNavigationssystem(boolean navigationssystem) {
        Navigationssystem = navigationssystem;
    }
}
