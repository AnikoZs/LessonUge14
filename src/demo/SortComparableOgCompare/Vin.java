package demo.SortComparableOgCompare;


public class Vin implements Comparable<Vin> {
    private String navn;
    private int aargang;

    public Vin(String navn, int aargang) {
        this.navn = navn;
        this.aargang = aargang;
    }

    public String getNavn() {
        return navn;
    }

    public int getAargang() {
        return aargang;
    }

    // Standard sortering: alfabetisk efter navn
    @Override
    public int compareTo(Vin andenVin) {
        return this.navn.compareTo(andenVin.navn);
    }

    @Override
    public String toString() {
        return navn + " (" + aargang + ")";
    }
}


