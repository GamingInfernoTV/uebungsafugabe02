package de.medieninformatik.main;

import java.io.File;
import java.io.IOException;

public class DateiErstellen {
    public static void createFile() {
        File f = new File("./primzahlen.txt");

        // Create new file
        // Check if it does not exist
        try {
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        // Get the file



    //String s =
    //PrintWriter pWriter = new PrintWriter(new FileWriter(f));
}
