package edu.cpp.cs356;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;

public class Tree {

    private JTree jt;
    private TreeNode tn;

    Tree() {
        Component root = new Group("Root", null);
        tn = root;
        jt = new JTree(tn);
    }

}
