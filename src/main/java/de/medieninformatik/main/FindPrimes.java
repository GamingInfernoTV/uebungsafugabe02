package de.medieninformatik.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindPrimes {

    List<Integer> Primes;

    public FindPrimes(int valueLimit){
        Primes = sieveOfEratosthenes(valueLimit);
    }

    public FindPrimes(int valueLimit, int ammountLimit){
        Primes = sieveOfEratosthenesLimit(valueLimit, ammountLimit);
    }

    public List<Integer> getPrimes() {
        return Primes;
    }

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static List<Integer> sieveOfEratosthenesLimit(int n, int limit) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        int limitIDX= 0;
        int found = 0;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                found++;
                if (found >= limit) {
                    limitIDX = p;
                    break;
                }
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= limitIDX; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
