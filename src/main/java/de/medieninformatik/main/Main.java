package de.medieninformatik.main;

/**
 * @author m30112
 * @author m30115
 */
public class Main {
    public static void main(String[] args) {
        FindPrimes fp = new FindPrimes(100000000, Integer.parseInt(args[0]));
        DateiErstellen de = new DateiErstellen(fp);
        de.createFile("./" + args[1]);
    }
}