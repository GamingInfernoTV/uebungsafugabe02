package de.medieninformatik.main;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DateiSchreiben {
    FindPrimes fp;
    public DateiSchreiben(FindPrimes fp) {
        this.fp = fp;
    }

    public void printInFile() {
        PrintWriter pWriter = null;
        StringBuilder sb = new StringBuilder();
        String s = "./primzahlen.txt";
        List<Integer> li = fp.getPrimes();
        for (int i = 0; i < li.size(); i++) {
            sb.append(li.get(i) + " ");
        }
        try {
            pWriter = new PrintWriter(new FileWriter(s));
            // prints the prime numbers in the file
            pWriter.println(sb);
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
