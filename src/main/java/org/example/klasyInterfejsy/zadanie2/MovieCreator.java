package org.example.klasyInterfejsy.zadanie2;

public class MovieCreator {
    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String publisher;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Movie createMovie() {
        Movie movie = new Movie(title, director, yearOfRelease, genre, publisher);
        return movie;

    }
}
