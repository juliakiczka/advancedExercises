package org.example.typyGeneryczne.zadanie4;

public class Book extends MediaContent {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "author='" + author + '\'' +
                '}';
    }
}
