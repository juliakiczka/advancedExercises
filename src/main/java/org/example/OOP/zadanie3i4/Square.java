package org.example.OOP.zadanie3;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLentgh(width);
    }

    @Override
    public void setLentgh(double lentgh) {
        super.setWidth(width);
        super.setLentgh(lentgh);
    }

    @Override
    public String toString() {
        return String.format("Square with width=%f and length=%f which is subclass of %s", width, lentgh, super.toString());
    }
}
