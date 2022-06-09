package de.pcCollege.testCollections;

import de.pcCollege.objektOrientierung.vorlagen.PersonBasis;
import de.pcCollege.objektOrientierung.vorlagen.PersonBasisMitComparator;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
       // ArrayList<int> zL =
        System.out.println("ArrayList");
        ArrayList <Integer> zahlenListe = new ArrayList<>();
        zahlenListe.add(234);
        zahlenListe.add(912);
        zahlenListe.add(234);
        zahlenListe.add(732);
        zahlenListe.add(654);
//        System.out.println(zahlenListe.get(3));
//        System.out.println(zahlenListe.size());
        System.out.println(zahlenListe);
//        //zahlenListe.add(533);
//        // Collections.sort(zahlenListe);
//        zahlenListe.sort(Comparator.naturalOrder());
//        System.out.println(zahlenListe);
//        ArrayList<String> zeichenkettenListe = new ArrayList<>();
//        zeichenkettenListe.add("zde");
//        zeichenkettenListe.add("lmn");
//        zeichenkettenListe.add("abc");
//        System.out.println(zeichenkettenListe);
//        zeichenkettenListe.sort(Comparator.naturalOrder());
//        System.out.println(zeichenkettenListe);
//        for (int i = 0; i < zahlenListe.size(); i++) {
////            System.out.printf("\nIndex %d Wert %d", i, zahlenListe.get(i));
//            System.out.println(String.format("Index %d Wert %d", i, zahlenListe.get(i)));
//        }
        for (Integer item:zahlenListe) {
            System.out.println(String.format("Wert %d", item));
        }
        System.out.println("HashSet");
        HashSet<Integer> zahlenMenge = new HashSet<>();
        zahlenMenge.add(234);
        zahlenMenge.add(912);
        zahlenMenge.add(234);
        zahlenMenge.add(732);
        zahlenMenge.add(654);
//        System.out.println(zahlenMenge);
        for (Iterator iterator = zahlenMenge.iterator(); iterator.hasNext();) {
            System.out.println(String.format("Wert %d", iterator.next()));
        }
        for (Integer item:zahlenMenge) {
            System.out.println(String.format("Wert %d", item));
        }
        // Problem: Comparator nicht implementiert
//        Collections.sort(zahlenMenge);
//        System.out.println(String.format("Maximum %d"), Collections.max(zahlenMenge));
//        ArrayList<PersonBasisMitComparator> sortierbaresAdressbuch = new ArrayList<>();
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Susi", "Müller", 22));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Hans", "Mayer", 20));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Ernst", "Schmid", 25));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Sandra", "Lehmann", 30));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Heiner", "Bennewitz", 28));
//        ArrayList<PersonBasis> sortierbaresAdressbuch = new ArrayList<>();
//        sortierbaresAdressbuch.add(new PersonBasis("Susi", "Müller"));//, 22));
//        sortierbaresAdressbuch.add(new PersonBasis("Hans", "Mayer"));//, 20));
//        sortierbaresAdressbuch.add(new PersonBasis("Hans", "Müller"));//, 20));
//        sortierbaresAdressbuch.add(new PersonBasis("Ernst", "Schmid"));//, 25));
//        sortierbaresAdressbuch.add(new PersonBasis("Sandra", "Lehmann"));//, 30));
//        sortierbaresAdressbuch.add(new PersonBasis("Heiner", "Bennewitz"));//, 28));
//        Collections.sort(sortierbaresAdressbuch);
//        sortierbaresAdressbuch.sort(Comparator.naturalOrder());
//        System.out.println(sortierbaresAdressbuch);
//        ArrayList<PersonBasisMitComparator> sortierbaresAdressbuch2 = new ArrayList<>();
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Susi", "Müller", 22));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Hans", "Mayer")), 20));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Hans", "Müller", 20));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Ernst", "Schmid", 25));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Sandra", "Lehmann", 30));
//        sortierbaresAdressbuch.add(new PersonBasisMitComparator("Heiner", "Bennewitz", 28));
    }
}
