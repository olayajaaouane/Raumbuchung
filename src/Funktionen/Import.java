package Funktionen;

import Raumbuchungsmodel.Kurs;
import Raumbuchungsmodel.Raum;
import Raumbuchungsmodel.Daten;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;


public class Import {
    public static String delimiter = ",";

    public static int importcsvRaum(String path, Daten dataStore) {
        List<Raum> resultList = new ArrayList<>();
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter);
                Raum raum = new Raum();
                raum.setRaumnummer(fields[0]);
                raum.setGebaeude(fields[1]);
                raum.setSitzplaetze(Integer.parseInt(fields[2],10));
                raum.setIstMediaraum(Boolean.parseBoolean(fields[3]));
                if (fields.length == 5 && !Objects.equals(fields[4], "")) {
                    String[] allKurs = fields[4].split(";");
                    raum.addAllKurs(List.of(allKurs));
                }
                resultList.add(raum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataStore.addAllRaum(resultList);
        return resultList.size();
    }
    public int importcsvKurs(String path, Daten Daten) {
        List<Kurs> resultList = new ArrayList<>();
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter);
                Kurs kurs = new Kurs();
                kurs.setDozent(fields[0]);
                kurs.setKursbezeichnung(fields[1]);
                kurs.setSemester(fields[2]);
                kurs.setTeilnehmeranzahl(Integer.parseInt(fields[3]));

                resultList.add(kurs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Daten.addAllKurs(resultList);
        return resultList.size();
    }
}
