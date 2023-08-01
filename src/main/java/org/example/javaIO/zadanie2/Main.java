package org.example.javaIO.zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader;
        String strLine;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Projekty\\kursJava\\zadania_z_kursu\\JavaZaawansowanaZadania\\src\\main\\resources\\zadania"));
            while ((strLine = bufferedReader.readLine()) != null) {
                System.out.println(strLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println("Unable to read the file!");
        }


    }
}
