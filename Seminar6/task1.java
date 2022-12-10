package Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        Integer[] masssive = new Integer[1000];
        Random random = new Random();

        for (int i = 0; i < masssive.length; i++) {
            masssive[i] = random.nextInt(0, 25);
        }
        System.out.println(Arrays.toString(masssive));
        
        HashSet<Integer> set_massive = new HashSet<>();
        for (int i = 0; i < masssive.length; i++) {
            set_massive.add(masssive[i]);
        }
        System.out.println(set_massive);
        Float procent = (float) set_massive.size() / masssive.length * 100;
        System.out.println(procent + "%");
    }
}
