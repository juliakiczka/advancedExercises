package org.example.typyGeneryczne.zadanie4;

public class Library<T extends MediaContent> {
    private  T[] elements;

    public Library(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }
}
