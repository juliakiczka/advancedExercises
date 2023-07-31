package org.example.typyGeneryczne.zadanie2;

public interface Validator<T> {
    boolean validate(T value);
}
