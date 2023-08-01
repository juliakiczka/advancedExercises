package org.example.javaIO.zadanie1;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Projekty\\kursJava\\zadania_z_kursu\\JavaZaawansowanaZadania\\src\\main\\java\\org\\example");
        String[] fileList = file.list();
        for (String s : fileList) {
            System.out.println(s);
        }

    }
}
