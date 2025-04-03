package demo.SortComparableOgCompare;

import java.util.*;

public class VinKlassifier {
    public static void main(String[] args) {
       run();
    }

    public static void run()
    {
        List<Vin> vine = new ArrayList<>();
        vine.add(new Vin("Barolo", 2016));
        vine.add(new Vin("Amarone", 2018));
        vine.add(new Vin("Chianti", 2015));

        System.out.println("Standard sortering (efter navn):");
        Collections.sort(vine); // Bruger compareTo
        for (Vin v : vine) {
            System.out.println(v);
        }

        System.out.println("\nSortering efter årgang:");
        Collections.sort(vine, new AargangComparator()); // Bruger Comparator
        for (Vin v : vine) {
            System.out.println(v);
        }
    }
}


