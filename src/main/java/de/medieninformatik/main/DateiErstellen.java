package de.medieninformatik.main;

import java.io.File;
import java.io.IOException;

public class DateiErstellen {
    /**
     * The method createFile is used to create a File
     */
    public static void createFile(String s) {
        File f = new File(s);

        // Create new file
        // Check if it does not exist
        try {
            if (f.createNewFile()) {
                System.out.println("File created");
                // runs the method printInFile from DateiSchreiben.java
                DateiSchreiben.printInFile();
            }
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
