package org.example.javaIO.zadanie6;

public class MovieParser {
    private static final String SEPARATOR = ", ";

    public Movie fromCSV(String line) {
        String[] data = line.split(SEPARATOR);
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }

    public byte[] toCSV(Movie movie) {
        return new StringBuilder().append(movie.getTitle())
                .append(SEPARATOR)
                .append(movie.getGenre())
                .append(SEPARATOR)
                .append(movie.getDirector())
                .append(SEPARATOR)
                .append(movie.getYearOfRelease())
                .append("\n")
                .toString().getBytes();
    }
}
