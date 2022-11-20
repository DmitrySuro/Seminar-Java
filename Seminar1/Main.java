import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var now = LocalDateTime.now().getHour();
        var morning = 5;
        var day = 12;
        var evening = 18;
        var night = 23;
        if (now >= morning && now < day) {
            System.out.println("Good morning!");
        } else if (now >= day && now < evening) {
            System.out.println("Good day!");
        } else if (now >= evening && now < night) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
        Integer aa[] = {3,2,2,3};
        ArrayList<Integer> ll = new ArrayList<>(Arrays.asList(aa));
        ll.add(19);
        ll.remove(aa.length-1);
        System.out.println(ll);
        int target = 3;
        for (int i = 0; i < aa.length; i++) {
           var val = aa[i];
           if (val == target) {
             for (int j = 1+i; j < aa.length; j++) {
                aa[j-1] = aa[j];
                aa[j] = val;
            }
           }
       }
        System.out.println(Arrays.toString(aa));
        String words[] = {"Башкир","Азбука", "Азимут", "Башкортастан", "Башмут"};
        ArrayList<String> prefixes = new ArrayList<>();
        StringBuilder pref = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            var wordChar = words[i].toCharArray();
            for (int j = i+1; j < words.length; j++) {
               var wordChar2 = words[j].toCharArray();
                for (int k = 0; k < wordChar.length; k++) {
                    if (wordChar2.length <= k) {
                        break;
                    }
                    if (wordChar[k] == wordChar2[k]) {
                        pref.append(wordChar[k]);
                    } else {
                        break;
                    }
                }
                //
                if (pref.length() > 0) {
                    prefixes.add(pref.toString());
                    pref = new StringBuilder();
                }
            }
        }

        String max = "";
        System.out.println(prefixes);
        for (String p: prefixes) {
           if (p.length() > max.length()) {
               max = p;
           }
        }
        System.out.println(max);
    }
}