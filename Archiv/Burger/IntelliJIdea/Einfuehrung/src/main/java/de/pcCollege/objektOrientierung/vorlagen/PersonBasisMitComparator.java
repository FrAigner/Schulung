package de.pcCollege.objektOrientierung.vorlagen;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PersonBasisMitComparator implements Comparator<PersonBasisMitComparator>, Comparable<PersonBasisMitComparator> {
    private String vorname;
    private String nachname;
    private int alter;

    public PersonBasisMitComparator(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    /**
     * @return
     */
    @Override
    public Comparator<PersonBasisMitComparator> reversed() {
        return Comparator.super.reversed();
    }

    /**
     * @param other the other comparator to be used when this comparator
     *              compares two objects that are equal.
     * @return
     */
    @Override
    public Comparator<PersonBasisMitComparator> thenComparing(Comparator<? super PersonBasisMitComparator> other) {
        return Comparator.super.thenComparing(other);
    }

    /**
     * @param keyExtractor  the function used to extract the sort key
     * @param keyComparator the {@code Comparator} used to compare the sort key
     * @param <U>
     * @return
     */
    @Override
    public <U> Comparator<PersonBasisMitComparator> thenComparing(Function<? super PersonBasisMitComparator, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    /**
     * @param keyExtractor the function used to extract the {@link
     *                     Comparable} sort key
     * @param <U>
     * @return
     */
    @Override
    public <U extends Comparable<? super U>> Comparator<PersonBasisMitComparator> thenComparing(Function<? super PersonBasisMitComparator, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    /**
     * @param keyExtractor the function used to extract the integer sort key
     * @return
     */
    @Override
    public Comparator<PersonBasisMitComparator> thenComparingInt(ToIntFunction<? super PersonBasisMitComparator> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    /**
     * @param keyExtractor the function used to extract the long sort key
     * @return
     */
    @Override
    public Comparator<PersonBasisMitComparator> thenComparingLong(ToLongFunction<? super PersonBasisMitComparator> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    /**
     * @param keyExtractor the function used to extract the double sort key
     * @return
     */
    @Override
    public Comparator<PersonBasisMitComparator> thenComparingDouble(ToDoubleFunction<? super PersonBasisMitComparator> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }


    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(PersonBasisMitComparator o1, PersonBasisMitComparator o2) {
        if (this.nachname.equals(o2.nachname)) {
            if (this.vorname.equals(o2.vorname)) {
                if (this.alter == o2.alter) {
                    return 0;
                } else if (this.alter < o2.alter) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return this.vorname.compareTo(o2.vorname);
        }
        return this.nachname.compareTo(o2.nachname);
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(PersonBasisMitComparator o2) {
        if (this.nachname.equals(o2.nachname)) {
            if (this.vorname.equals(o2.vorname)) {
                if (this.alter == o2.alter) {
                    return 0;
                } else if (this.alter < o2.alter) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return this.vorname.compareTo(o2.vorname);
        }
        return this.nachname.compareTo(o2.nachname);
    }
}
