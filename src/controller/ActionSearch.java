package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class ActionSearch implements ActionListener {

    JFileChooser c = new JFileChooser();
    private final JTextField txt;

    public ActionSearch(JTextField txt) {
        this.txt = txt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = c.showOpenDialog(c);

        switch (option) {
            case JFileChooser.APPROVE_OPTION:
                File f = c.getSelectedFile();
                String route = f.getAbsolutePath();
                txt.setText(route);
                break;
            case JFileChooser.CANCEL_OPTION:
                txt.setText("");
                break;
            case JFileChooser.ERROR_OPTION:
                System.out.println("Puta un Error");
                txt.setText("Error!");
                break;
            default:
                break;
        }
    }
}
