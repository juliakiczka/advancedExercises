package org.example.javaIO.zadanie5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Projekty\\kursJava\\zadania_z_kursu\\JavaZaawansowanaZadania\\src\\main\\java\\org\\example\\javaIO\\zadanie5\\user.csv";
        String line;
        String csvSplitBy = ", ";
        ArrayList<User> userList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(csvSplitBy);
                if (userData.length == 3) {
                    String name = userData[0].trim();
                    String surname = userData[1].trim();
                    int age = Integer.parseInt(userData[2].trim());
                    User user = new User(name, surname, age);
                    userList.add(user);
                }
            }
            for (User user : userList) {
                System.out.println("Name: " + user.getName() + ", Surname: " + user.getSurname() + ", Age: " + user.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
