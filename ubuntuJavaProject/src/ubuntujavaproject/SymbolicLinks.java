package ubuntujavaproject;

import javax.swing.*;
import java.io.*;

public class SymbolicLinks {
    public void execute() {
        String targetFile = JOptionPane.showInputDialog("Enter target file:");
        String linkName = JOptionPane.showInputDialog("Enter symbolic link name:");
        
        try {
            String command = "ln -s " + targetFile + " " + linkName;
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            JOptionPane.showMessageDialog(null, "Symbolic link created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating symbolic link.");
        }
    }
}