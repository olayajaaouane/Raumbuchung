package Raumbuchungsmodel;

import java.util.ArrayList;
import java.util.List;

public class Raum {
    private int Sitzplaetze;
    private String Raumnummer;
    private String Gebaeude;
    private boolean IstMediaraum;

    private List<String> kursList = new ArrayList<>();
    public String getRaumnummer() {
        return Raumnummer;
    }

    public void setRaumnummer(String Raumnummer) {
        this.Raumnummer = Raumnummer;
    }
    public String getGebaeude() {
        return Gebaeude;
    }

    public void setGebaeude(String Gebaeude) {
        this.Gebaeude = Gebaeude;
    }
    public int getSitzplaetze() {
        return Sitzplaetze;
    }

    public void setSitzplaetze(int Sitzplaetze) {
        this.Sitzplaetze = Sitzplaetze;
    }
    public boolean getIstMediaraum() {
        return IstMediaraum;
    }

    public void setIstMediaraum(boolean IstMediaraum) {
        this.IstMediaraum = IstMediaraum;
    }

    public List<String> getKursList() {
        return kursList;
    }

    public void addKurs(String kurs) {
        this.kursList.add(kurs);
    }
    public void addAllKurs(List<String> kurs) {
        this.kursList.addAll(kurs);
    }
}

