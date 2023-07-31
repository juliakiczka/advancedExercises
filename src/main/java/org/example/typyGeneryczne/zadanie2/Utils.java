package org.example.typyGeneryczne.zadanie2;

public class Utils {
    public static <T> int countIf(T[] tab, Validator<T> validator) {
        int counter = 0;
        for (T t : tab) {
            if (validator.validate(t)) {
                counter++;
            }
        }
        return counter;
    }
}
