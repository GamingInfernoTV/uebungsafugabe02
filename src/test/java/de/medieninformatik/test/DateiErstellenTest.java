package de.medieninformatik.test;

import de.medieninformatik.main.DateiErstellen;
import de.medieninformatik.main.FindPrimes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DateiErstellenTest {

    File file;

    @BeforeAll
    void TestSetup () {
        try {
            file = new File("./test.txt");
            if(file.exists() && !file.isDirectory()) {
                file.delete();
            }
        } catch (Exception e) {
        }
    }

    @Test
    void createFileTest() {
        FindPrimes fp = new FindPrimes(3);
        DateiErstellen de = new DateiErstellen(fp);
        boolean result = false;
        de.createFile("./test.txt");
        if(file.exists()) {
            result = true;
        }
        assert result;
    }

    @AfterAll
    void TestCleanup () {
        try {
            file = new File("test.txt");
            if(file.exists() && !file.isDirectory()) {
                file.delete();
            }
        } catch (Exception e) {
        }
    }

}
