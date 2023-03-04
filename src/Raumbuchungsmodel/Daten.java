package Raumbuchungsmodel;

import java.util.ArrayList;
import java.util.List;

public class Daten {
    private final List<Kurs> kursList = new ArrayList<>();
    private final List<Raum> raumList = new ArrayList<>();

    public List<Kurs> getKursList() {
        return kursList;
    }

    public List<Raum> getRaumList() {
        return raumList;
    }

    public void addKurs(Kurs kurs) {
        kursList.add(kurs);
    }

    public void addAllKurs(List<Kurs> kurs) {
        kursList.addAll(kurs);
    }

    public void addRaum(Raum raum) {
        raumList.add(raum);
    }

    public void addAllRaum(List<Raum> raum) {
        raumList.addAll(raum);
    }
}
