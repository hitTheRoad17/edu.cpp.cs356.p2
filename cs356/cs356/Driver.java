package edu.cpp.cs356;

public class Driver {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            AdminPanel ap = AdminPanel.getInstance();
            ap.setVisible(true);
        });
    }

}
