package Objektorientierung.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

import static java.lang.Math.E;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.print("ArrayList");
        ArrayList<Integer> zahlenListe = new ArrayList<>();
        zahlenListe.add(164);
        zahlenListe.add(545);
        zahlenListe.add(789);
        zahlenListe.add(12);
        zahlenListe.add(13);
        zahlenListe.add(12);
        System.out.println(zahlenListe);
        zahlenListe.add(879);
        zahlenListe.sort(Comparator.naturalOrder());
        System.out.println(zahlenListe);
        System.out.println("HashSet");
        HashSet<Integer> zahlenMenge = new HashSet<>();
        zahlenMenge.add(164);
        zahlenMenge.add(545);
        zahlenMenge.add(789);
        zahlenMenge.add(12);
        zahlenMenge.add(13);
        zahlenMenge.add(12);
        System.out.println(zahlenMenge);
        
        
    }
}
