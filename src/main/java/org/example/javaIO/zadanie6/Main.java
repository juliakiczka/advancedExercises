package org.example.javaIO.zadanie6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieFileRepository movieFileRepository = new MovieFileRepository();
        movieFileRepository.add(new Movie("American Beauty", "Romance", "Jane Doe", 2010));
        movieFileRepository.add(new Movie("American Psycho", "Romance", "John Doe", 1999));
        System.out.println("Results: " + movieFileRepository.getAll());

    }
}
