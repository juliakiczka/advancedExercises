package org.example.wyjatki.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void delete(Book book1) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getAuthor().equals(book1.getAuthor()) && book.getTitle().equals(book1.getTitle()) && book.getId().equals(book1.getId()) && book.getPublicationDate().equals(book1.getPublicationDate())) {
                books.remove(book);
            }
        }
        throw new NoBookFoundException("Cannot delete book: " + book1);
    }

    public void deleteById(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId().equals(isbn)) {
                books.remove(book);
            }
        }
        throw new NoBookFoundException("Cannot delete book with isbn: " + isbn);
    }

    public List<Book> findByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Cannot find book with name: " + name);
        }
        return booksByName;
    }

    public List<Book> findById(String isbn) throws NoBookFoundException {
        List<Book> booksById = new ArrayList<>();
        for (Book book : books) {
            if (book.getId().equals(isbn)) {
                booksById.add(book);
            }
        }
        if (booksById.isEmpty()) {
            throw new NoBookFoundException("Cannot find book with name: " + isbn);
        }
        return booksById;
    }
}
