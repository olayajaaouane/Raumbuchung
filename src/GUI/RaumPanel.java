package GUI;

import Raumbuchungsmodel.Daten;

import javax.swing.*;
import java.awt.*;

public class RaumPanel extends JPanel {
    public RaumPanel(Daten daten) {
        setLayout(new BorderLayout());

        JPanel topButtonsPanel = new JPanel();
        topButtonsPanel.setLayout(new GridLayout(1, 7));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        JButton importButton = new JButton("Import");
        topButtonsPanel.add(importButton);
        importButton.addActionListener((event) -> {
            bottomPanel.removeAll();
            bottomPanel.add(new RaumImportPanel(daten));
            revalidate();
            repaint();
            setVisible(true);
        });
        add(topButtonsPanel, "North");
        add(bottomPanel, "Center");
    }
}
