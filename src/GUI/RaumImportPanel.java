package GUI;

import Funktionen.Import;
import Raumbuchungsmodel.Daten;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import javax.swing.text.JTextComponent;


public class RaumImportPanel extends JPanel {
    private Import importRaum= new Import();
    JTextArea countText=new JTextArea();

    public RaumImportPanel(Daten daten){
        JButton importButton = new JButton("Import Rumen");
        importButton.addActionListener(e -> {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

            int returnValue = jfc.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();
                System.out.println(selectedFile.getAbsolutePath());
                int count = Import.importcsvRaum(selectedFile.getAbsolutePath(), daten);
                countText.setText(count + " Raum importiert.");
            }
        });
        add(countText);
        add(importButton);
    }
}
