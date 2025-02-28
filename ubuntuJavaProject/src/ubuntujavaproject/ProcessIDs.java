package ubuntujavaproject;

import java.io.*;
import javax.swing.JOptionPane;

public class ProcessIDs {
    public void execute() {
        try {
            String command = "ps -e";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            BufferedWriter writer = new BufferedWriter(new FileWriter("process_ids.txt"));
            
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Process IDs saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving process IDs.");
        }
    }
}