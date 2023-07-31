package org.example.kolekcje.zadanie5;

import org.example.kolekcje.zadanie2.Book;
import org.example.kolekcje.zadanie2.Genre;

import java.util.*;
import java.util.function.ToDoubleFunction;

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

    public Stack<Book> createBookStack() {
        Collections.sort(books, Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return value.getPrice();
            }
        }));
        Stack<Book> stack = new Stack<>();
        for (Book book : books) {
            stack.push(book);
        }
        return stack;
    }
}
