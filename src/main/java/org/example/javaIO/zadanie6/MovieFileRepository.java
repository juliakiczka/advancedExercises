package org.example.javaIO.zadanie6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MovieFileRepository {
    private final MovieParser movieParser = new MovieParser();
    private final static Path PATH = Paths.get("C:\\Projekty\\kursJava\\zadania_z_kursu\\JavaZaawansowanaZadania\\src\\main\\java\\org\\example\\javaIO\\zadanie6\\test.txt");

    public void add(Movie movie) throws IOException {
        Files.write(PATH, movieParser.toCSV(movie), StandardOpenOption.APPEND);
    }
    public List<Movie> getAll() throws IOException {
        List<String> movieLines = Files.readAllLines(PATH);
        ArrayList<Movie> movies = new ArrayList<>();
        for (String line : movieLines) {
            Movie movie = movieParser.fromCSV(line);
            movies.add(movie);
        }
        return movies;
    }

}
