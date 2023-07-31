package org.example.kolekcje.zadanie4;

import org.example.kolekcje.zadanie2.Book;
import org.example.kolekcje.zadanie2.Genre;

import java.util.*;

public class BookServiceExt {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAll() {
        return books;
    }

    public Map<Genre, String> mapBooks() {
        Map<Genre, String> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }
}
