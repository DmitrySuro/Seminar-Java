package Seminar6;
import java.util.HashSet;

import Seminar6.cat;
public class vet_clinic {public static void main(String[] args) {
    cat cat_1 = new cat("боря", 39494834, 3.4);
    cat cat_2 = new cat("barsik", 494834, 2.4);
    cat cat_3 = new cat("боря", 39494834, 1.4);
    // System.out.println(cat_1.toString());
    // cat_1.create_note("Наблюдение");
    // cat_1.print_notes();
    HashSet<cat> all_cats = new HashSet<>();
    all_cats.add(cat_1);
    all_cats.add(cat_2);
    all_cats.add(cat_3);
    System.out.println(all_cats);
    
    System.out.println(cat_1.hashCode());
    System.out.println(cat_2.hashCode());
    System.out.println(cat_3.hashCode());
}


}
