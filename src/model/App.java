package model;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class App {

    public void start(JFrame Main, JTextField Route, JTree Tree) {
        window(Main);
        settings(Route, Tree);
    }

    private void window(JFrame Main) {
        Main.setBounds(0, 0, 800, 600);
        Main.setLocationRelativeTo(null);
        Main.setResizable(false);
        Main.setTitle("Choose");
        Main.setVisible(true);
    }

    private void settings(JTextField Route, JTree Tree) {
        Route.setEditable(false);
        
        DefaultMutableTreeNode zero = new DefaultMutableTreeNode("");
        DefaultTreeModel def = new DefaultTreeModel(zero);
        Tree.setModel(def);
    }
}
