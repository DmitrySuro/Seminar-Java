package Seminar2;
// Напишите метод, который составит строку, 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

// состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

public class taskTest {
    public static void main(String[] args) throws IOException {
        String st = "TE3ST".repeat(5);
        FileWriter b = new FileWriter("test.txt",true);
        b.append(st + "\n");
        b.close();

    }
}
