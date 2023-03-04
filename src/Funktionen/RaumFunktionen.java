package Funktionen;

import Raumbuchungsmodel.Daten;
import Raumbuchungsmodel.Raum;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class RaumFunktionen {
    public void save(Raum raum, Daten daten) {
        Raum foundedBauauftrag = find(raum.getRaumnummer(), daten);
        if (foundedBauauftrag != null) {
            delete(raum.getRaumnummer(), daten);
        }
        daten.addRaum(raum);
    }

    public Raum find(String raumnummer, Daten daten) {
        return daten.getRaumList().stream().
                filter(raum -> raum.getRaumnummer().equals(raumnummer)).
                findFirst().
                orElse(null);
    }

    public void delete(String raumnummer, Daten daten) {
        daten.getRaumList().
                removeIf(raum -> raum.getRaumnummer().equals(raumnummer));
    }


    public List<Raum> getListRaumFurKurs(String Kursbezeichnung, Daten daten) {
        return daten.getRaumList().stream().
                filter(raum -> raum.getKursList().contains(Kursbezeichnung)).
                collect(toList());
    }
}
