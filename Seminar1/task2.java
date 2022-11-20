package Seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name:   ");
        String name = iScanner.nextLine();
        System.out.println("Hello:" + name);
        iScanner.close();
        int time = LocalDateTime.now().getHour() - 7;
        // System.out.println(time);
        if (time >= 5 && time < 12) {
            System.out.printf("Доброе утро: " + name);
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день: " + name);
        } else if (time >= 18 && time < 23) {
            System.out.println("Добрый вечер:" + name);
        } else {
            System.out.println("Доброй ночи: " + name);
        }
    }

}
