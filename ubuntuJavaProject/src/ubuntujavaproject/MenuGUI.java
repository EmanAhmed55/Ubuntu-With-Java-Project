package ubuntujavaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuGUI {
    private JFrame frame;
    private JButton btnPermissions, btnLink, btnProcessIDs, btnExit;
    
    public MenuGUI() {
        frame = new JFrame("Project4 Menu");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        
        btnPermissions = new JButton("Change File Permissions");
        btnLink = new JButton("Create Symbolic Link");
        btnProcessIDs = new JButton("Save Process IDs");
        btnExit = new JButton("Exit");
        
        panel.add(btnPermissions);
        panel.add(btnLink);
        panel.add(btnProcessIDs);
        panel.add(btnExit);
        
        frame.add(panel);
        
        // Set action listeners for buttons
        btnPermissions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FilePermissions().execute();
            }
        });
        
        btnLink.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SymbolicLinks().execute();
            }
        });
        
        btnProcessIDs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ProcessIDs().execute();
            }
        });
        
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MenuGUI();
    }
}