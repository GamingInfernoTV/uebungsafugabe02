package de.medieninformatik.test;

import de.medieninformatik.main.DateiSchreiben;
import de.medieninformatik.main.FindPrimes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DateiSchreibenTest {

    File file;
    List<Integer> towrite;

    @BeforeAll
    void TestSetup() {
        file = new File("test.txt");
        if(file.exists()) {
            try {
                file.delete();
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        towrite = new ArrayList<>();
        towrite.add(1);
        towrite.add(2);
        towrite.add(3);
        towrite.add(4);
        towrite.add(5);
    }

    @Test
    void printInFileTest() throws IOException {
        FindPrimes fp = new FindPrimes(3);
        DateiSchreiben ds = new DateiSchreiben();
        ds.printInFile("./test.txt", towrite);
        FileReader fr = new FileReader(file);
        List<Integer> result = new ArrayList<>();
        BufferedReader br=new BufferedReader(fr);
        boolean isSame = true;
        String line = br.readLine();
        char[] arr = line.toCharArray();
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] != ' ') {
                char c = arr[i];
                result.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        if (towrite.size() != result.size()) {
            isSame = false;
        }
        for ( int i = 0; i< result.size(); i++) {
            if (towrite.get(i) != result.get(i)) {
                isSame = false;
            }
        }
        assert isSame;
    }

    @AfterAll
    void TestCleanup() {
        try {
            file = new File("test.txt");
            if(file.exists() && !file.isDirectory()) {
                file.delete();
            }
        } catch (Exception e) {
        }
    }
}
