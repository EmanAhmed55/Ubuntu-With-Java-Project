package ubuntujavaproject;

import java.io.*;
import ubuntujavaproject.MenuGUI;
import ubuntujavaproject.FilePermissions;
public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("dir")) {
                try {
                    Process process = Runtime.getRuntime().exec("ls");
                    process.waitFor();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Wrong argument");
            }
        } else {
            new MenuGUI(); // Start the GUI for other cases
        }
    }
}
