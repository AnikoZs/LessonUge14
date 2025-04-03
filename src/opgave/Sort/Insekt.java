package opgave.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class Insekt implements Comparable<Insekt> {
    private String type;
    private double størrelse;

    // Konstruktør
    public Insekt(String type, double størrelse) {
        this.type = type;
        this.størrelse = størrelse;
    }

    // Implementer Comparable interface for at sortere efter størrelse
    @Override
    public int compareTo(Insekt other) {
        // Sorter efter størrelse (fra små til store)
        return Double.compare(this.størrelse, other.størrelse);
    }

    public String getType() {
        return type;
    }

    public double getStørrelse() {
        return størrelse;
    }

    @Override
    public String toString() {
        return "Insekt{" + "type='" + type + "', størrelse=" + størrelse + " cm}";
    }


}
