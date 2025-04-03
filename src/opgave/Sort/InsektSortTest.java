package opgave.Sort;

import java.util.Arrays;

public class InsektSortTest {

    public static void main(String[] args) {

        run();
    }

    public static void run(){
        // Opret insekt-objekter
        Insekt[] insekter = {
                new Insekt("Sommerfugl", 7.0),
                new Insekt("Bille", 4.5),
                new Insekt("Myg", 1.2),
                new Insekt("Bie", 1.5),
                new Insekt("Løvflagermus", 6.2)
        };

        // Sorter insekter efter størrelse (Comparable)
        System.out.println("Sorter efter størrelse:");
        Arrays.sort(insekter);
        for (Insekt i : insekter) {
            System.out.println(i);
        }


        // Sorter insekter efter type (Comparator)
        System.out.println("\nSorter efter type:");
        Arrays.sort(insekter, new InsektTypeComparator());
        for (Insekt i : insekter) {
            System.out.println(i);
        }
    }
}

