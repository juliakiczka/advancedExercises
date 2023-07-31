package org.example.kolekcje.zadanie2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {
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

    public List<Book> getByGenre(Genre genre) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> getByYear(int yearOfRelease) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRelease() < yearOfRelease) {
                list.add(book);
            }
        }
        return list;
    }

    public Book getTheMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() < book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public Book getTheCheapestBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() > book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public List<Book> getByNumberOfAuthors(int numberOfAuthors) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> sortByTitleAsc() {
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        books.sort(titleComparator);
        return books;
    }

    public List<Book> sortByTitleDesc() {
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle).reversed();
        books.sort(titleComparator);
        return books;
    }

    public boolean isBookInRepo(Book book) {
        return books.contains(book);
    }

    public List<Book> getByAuthor(Author author) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                list.add(book);
            }
        }
        return list;
    }

}
