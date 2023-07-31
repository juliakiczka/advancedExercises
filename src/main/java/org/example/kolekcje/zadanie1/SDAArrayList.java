package org.example.kolekcje.zadanie1;

import java.util.Arrays;

public class SDAArrayList<E> {
    private static final int INITIAL_CAPACITY = 5;
    private Object[] elementArray;
    private int size = 0;

    public SDAArrayList(Object[] array) {
        array = new Object[INITIAL_CAPACITY];
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        return (E) elementArray[index];
    }

    public void add(E e) {
        if (size == elementArray.length) {
            increaseArraySize();
        }
        elementArray[size++] = e;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        Object removedElement = elementArray[index];
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i + 1];
        }
        size--;
        decreaseArraySize();
        return (E) removedElement;
    }

    public void display() {
        for (Object element : elementArray) {
            System.out.println(element);
        }
    }

    private void decreaseArraySize() {
        elementArray = Arrays.copyOf(elementArray,
                elementArray.length - 1);
    }

    private void increaseArraySize() {
        int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray,
                newIncreasedCapacity);
    }
}
