package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ActionProcess implements ActionListener{

    private final JTextField txt;
    private DefaultTreeModel treeModel;
    private JTree tree;

    public ActionProcess(JTextField txt, JTree tree) {
        this.txt = txt;
        this.tree = tree;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String route = txt.getText();
        
        DefaultMutableTreeNode head = new DefaultMutableTreeNode(route);
        treeModel = new DefaultTreeModel(head);
        tree = new JTree(head);
    }
    
}
