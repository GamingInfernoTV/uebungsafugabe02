package de.medieninformatik.main;

import java.io.File;
import java.io.IOException;

public class DateiErstellen {
    FindPrimes fp;
    DateiSchreiben ds;
    public DateiErstellen(FindPrimes fp){
        this.fp = fp;
        ds = new DateiSchreiben(fp);
    }
    /**
     * The method createFile is used to create a File
     */
    public void createFile(String s) {
        File f = new File(s);

        // Create new file
        // Check if it does not exist
        try {
            if (f.createNewFile()) {
                System.out.println("File created");
                // runs the method printInFile from DateiSchreiben.java
                ds.printInFile();
            }
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
