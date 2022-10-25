package de.medieninformatik.main;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DateiSchreiben {


    public void printInFile(String path, List<Integer> content) {
        PrintWriter pWriter = null;
        StringBuilder sb = new StringBuilder();
        String s = path;
        for (int i = 0; i < content.size(); i++) {
            sb.append(content.get(i) + " ");
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
