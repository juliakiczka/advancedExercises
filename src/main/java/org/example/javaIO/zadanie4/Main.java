package org.example.javaIO.zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Projekty\\kursJava\\zadania_z_kursu\\JavaZaawansowanaZadania\\src\\main\\resources\\zadania");
        try {
            Scanner scanner = new Scanner(file);
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Najdłuższy wyraz w pliku: " + longestWord);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }

    }
}
