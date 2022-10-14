package de.medieninformatik.main;

/**
 * @author m30112
 * @author m30115
 */
public class Main {
    public static void main(String[] args) {
        FindPrimes fp = new FindPrimes(10000, Integer.parseInt(args[0]));
        DateiErstellen.createFile("./" + args[1]);
    }
}