package GUI;
import Funktionen.Import;
import Raumbuchungsmodel.Daten;
import GUI.RaumPanel;
import GUI.RaumImportPanel;
import GUI.Raumbuchung;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
public class Raumbuchung extends JFrame{
    public Raumbuchung() {
        Daten daten = new Daten();
        JTabbedPane tabbedPane = new JTabbedPane();
        add(tabbedPane);
        ImportDaten(daten);

        RaumPanel raumPanel = new RaumPanel(daten);
        tabbedPane.add("Raum", raumPanel);

    }

    private void ImportDaten(Daten daten) {
        Import importNew= new Import();
        importNew.importcsvRaum("csvFiles/Raum.csv",daten);
    }
    public static void main(String[] args) {
        Raumbuchung app = new Raumbuchung();
        app.setResizable(true);
        Daten daten = new Daten();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(1000, 1000);
        app.setTitle("Raumbuchung");

            app.setVisible(true);

        }
    }

