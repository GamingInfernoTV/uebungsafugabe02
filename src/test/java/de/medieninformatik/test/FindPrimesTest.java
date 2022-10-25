package de.medieninformatik.test;

import de.medieninformatik.main.FindPrimes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class FindPrimesTest {

    @Test
    void sieveOfEratosthenesTest() {
        FindPrimes findPrimes = new FindPrimes(25);
        List<Integer> result = findPrimes.getPrimes();
        List<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        boolean isSame = true;
        for (int i = 0; i<expected.size(); i++) {
            if (result.get(i)!=expected.get(i)) {
                isSame = false;
            }
        }
        assert (isSame);
    }

    @Test
    void sieveOfEratosthenesLimitTest() {
        FindPrimes findPrimes = new FindPrimes(100,3);
        List<Integer> result = findPrimes.getPrimes();
        List<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        boolean isSame = true;
        if(expected.size()!=result.size()) {
            isSame = false;
        }
        for (int i = 0; i<expected.size(); i++) {
            if (result.get(i)!=expected.get(i)) {
                isSame = false;
            }
        }
        assert (isSame);
    }
}
