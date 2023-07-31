package org.example.kolekcje.zadanie3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            values.add(random.nextInt(50));
        }
        Set<Integer> duplicatedValues = new HashSet<>();
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (Integer value : values) {
            if (!uniqueValues.add(value)) {
                duplicatedValues.add(value);
            }
        }
        System.out.println("Values: " + values);
        System.out.println("Unique: " + uniqueValues);
        System.out.println("Duplicated: " + duplicatedValues);
    }
}
