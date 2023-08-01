package org.example.programowanieWspolbiezneRownolegle.zadanie3;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10000];
        int[] array2 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array1[i] = random.nextInt(20000);
            array2[i] = array1[i];
        }
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//todo
    }
}
