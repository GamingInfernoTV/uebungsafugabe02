package de.medieninformatik.main;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DateiSchreiben {
    public static void printInFile() {
        PrintWriter pWriter = null;
        String s = "./primzahlen.txt";
        try {
            pWriter = new PrintWriter(new FileWriter(s));
            // prints the prime numbers in the file
            pWriter.println("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }
    }
}
