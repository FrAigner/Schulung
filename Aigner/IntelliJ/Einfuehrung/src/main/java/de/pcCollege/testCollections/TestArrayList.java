package de.pcCollege.testCollections;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> zahlenListe = new ArrayList<>();
        zahlenListe.add(234);
        zahlenListe.add(888);
        zahlenListe.add(34);
        zahlenListe.add(24);
        zahlenListe.add(2);
        //System.out.println(zahlenListe.get(2));
        //Collections.sort(zahlenListe);
        zahlenListe.sort(Comparator.naturalOrder());
        zahlenListe.sort(Comparator.reverseOrder());

//        System.out.println(zahlenListe);
        System.out.println("Hashset");
        HashSet<Integer> zahlenMenge = new HashSet<>();
        zahlenMenge.add(654);
        zahlenMenge.add(68);
        zahlenMenge.add(654);
        zahlenMenge.add(6);
        zahlenMenge.add(64);
        zahlenMenge.add(684);
        zahlenMenge.add(6574);
        System.out.println(zahlenMenge);
    }
}
