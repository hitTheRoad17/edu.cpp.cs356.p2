package edu.cpp.cs356;

import javax.swing.JTree;

public class Tree {
	
    private JTree tree;
    private TreeNode root;
    
    public Tree() {
        // Create the root node
        Component root = new GroupComponent("Root", null);
        this.root = root;
        
        // Create the child nodes
        Component user1Node = new User("Aaron", (GroupComponent) root);
        Component user2Node = new User("Jameson", (GroupComponent) root);
 
        // Add the child nodes to the root node
        root.insert(user1Node);
        root.insert(user2Node);
         
        GroupComponent folder2 = new GroupComponent("Folder2", (GroupComponent) root);
        root.insert(folder2);
        
        folder2.insert(new User("Mia", (GroupComponent) folder2));
        folder2.insert(new User("Frances", (GroupComponent) folder2));
        
        // Create the tree by passing in the root node
        tree = new JTree(root);
    }

    public JTree getTree() {        
        return tree;
    }
    
    public TreeNode getRoot() {
        return root;
    }

}
