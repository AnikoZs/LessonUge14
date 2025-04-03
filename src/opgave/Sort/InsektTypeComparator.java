package opgave.Sort;

import java.util.Comparator;

// Comparator for at sortere insekter efter type (alfabetisk)
class InsektTypeComparator implements Comparator<Insekt> {
    @Override
    public int compare(Insekt i1, Insekt i2) {
        // Sorter efter type (alfabetisk)
        return i1.getType().compareTo(i2.getType());
    }
}
