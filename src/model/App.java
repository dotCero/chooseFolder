package model;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {

    public void start(JFrame Main, JTextField Route) {
        window(Main);
        settings(Route);
    }

    private void window(JFrame Main) {
        Main.setBounds(0, 0, 800, 600);
        Main.setLocationRelativeTo(null);
        Main.setResizable(false);
        Main.setTitle("Choose");
        Main.setVisible(true);
    }

    private void settings(JTextField Route) {
        Route.setEditable(false);
    }
}
