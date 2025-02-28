package ubuntujavaproject;

import javax.swing.*;
import java.io.*;

public class FilePermissions {
    public void execute() {
        String filePath = JOptionPane.showInputDialog("Enter file path:");
        String permissions = JOptionPane.showInputDialog("Enter permissions (e.g., 755):");
        
        try {
            String command = "chmod " + permissions + " " + filePath;
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            JOptionPane.showMessageDialog(null, "Permissions changed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error changing permissions.");
        }
    }
}