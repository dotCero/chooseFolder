package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ActionProcess implements ActionListener {

    private final JTextField txt;
    private JTree tree;

    public ActionProcess(JTextField txt, JTree tree) {
        this.txt = txt;
        this.tree = tree;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String route = txt.getText();
        String fix = route.replace("\\", "/");
        String[] routeFull = fix.split("/");
        String name = routeFull[routeFull.length - 1];

        DefaultMutableTreeNode head = new DefaultMutableTreeNode(name);

        trip(route, head);
        
        DefaultTreeModel treeModel = new DefaultTreeModel(head);

        tree.setModel(treeModel);
    }

    private void trip(String route, DefaultMutableTreeNode head) {
        
        File dir = new File(route);
        File[] dirFull = dir.listFiles();

        for (File h : dirFull) {
            if (h.isFile()) {
                DefaultMutableTreeNode _new = new DefaultMutableTreeNode();
                _new.setUserObject(h.getName());
                head.add(_new);
            }
        }
        for (File h : dirFull) {
            if (h.isDirectory()) {
                DefaultMutableTreeNode _new = new DefaultMutableTreeNode(h.getName());
                head.setUserObject(h.getName());
                head.add(_new);
                
//                File _dir = new File(h.getAbsolutePath());
//                File[] _dirFull = _dir.listFiles();
                
                trip(h.getAbsolutePath(),_new);
            }

        }
    }
}
