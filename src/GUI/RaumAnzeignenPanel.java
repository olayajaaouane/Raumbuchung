package GUI;
/*

import Raumbuchungsmodel.Daten;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.awt.color.ICC_Profile.getData;

public class RaumAnzeignenPanel extends JPanel {
String[] columns = {"Raumnummer", "Gebaeude", "Sitzplaetze", "IstMediaraum"};
    public RaumAnzeignenPanel(Daten dataStore) {
        setLayout(new BorderLayout());

        //Dies ist der top panel, mit dem alle buttons hinzugefügt werden können
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Dies ist der bottom panel wo der Inhalt anhand ausgewählter buttons angezeigt werden kann
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton anzeigenButton = new JButton("Bauaufträge");
        topPanel.add(anzeigenButton);

        JLabel sucheLabel = new JLabel("Suche Bauauftrag");
        JTextField sucheTextField = new JTextField(15);
        JButton sucheButton = new JButton("Suche");

        anzeigenButton.addActionListener((event) -> {
            bottomPanel.removeAll();
            bottomPanel.add(sucheLabel);
            bottomPanel.add(sucheTextField);
            bottomPanel.add(sucheButton);
            JTable newTable = new JTable(getData(dataStore.getRaumList()), columns);
            newTable.setBounds(0, 0, 500, 400);
            JScrollPane newScrollPane = new JScrollPane(newTable);
            newScrollPane.setSize(500, 500);
            bottomPanel.add(newScrollPane);
            revalidate();
            repaint();
            setVisible(true);
        });

        JButton datenBlaetterButton = new JButton("Datenblätter");
        topPanel.add(datenBlaetterButton);

        sucheButton.addActionListener((event) -> {
            JTable newTable = new JTable(getDataWithSearchTerm(dataStore, sucheTextField.getText()), columns);
            newTable.setBounds(0, 0, 500, 400);
            JScrollPane newScrollPane = new JScrollPane(newTable);
            newScrollPane.setSize(500, 500);

            bottomPanel.removeAll();
            bottomPanel.add(sucheLabel);
            bottomPanel.add(sucheTextField);
            bottomPanel.add(sucheButton);
            bottomPanel.add(newScrollPane);
            revalidate();
            repaint();
            setVisible(true);
        });

        datenBlaetterButton.addActionListener((event) -> {
            bottomPanel.removeAll();
            for (String value : getDatenblaetter(dataStore)) {
                JTextArea datenblaetter = new JTextArea(value);
                // datenblaetter.setSize(500, 230);
                bottomPanel.add(datenblaetter);
            }
            revalidate();
            repaint();
            setVisible(true);
        });

        add(topPanel, "North");
        add(bottomPanel, "Center");
    }

}
*/