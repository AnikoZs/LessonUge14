package demo.SortComparableOgCompare;

import java.util.Comparator;

public class AargangComparator implements Comparator<Vin> {
    @Override
    public int compare(Vin v1, Vin v2) {
        return Integer.compare(v1.getAargang(), v2.getAargang());
    }
}
