package org.example.OOP.zadanie3i4;

public class Rectangle extends Shape {
    protected double width;
    protected double lentgh;

    public Rectangle() {
        super();
        width = 1;
        lentgh = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double lentgh) {
        super(color, isFilled);
        this.width = width;
        this.lentgh = lentgh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLentgh() {
        return lentgh;
    }

    public void setLentgh(double lentgh) {
        this.lentgh = lentgh;
    }

    @Override
    public double getArea() {
        return width * lentgh;
    }

    @Override
    public double getPerimeter() {
        return (2 * width + 2 * lentgh);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f which is a subclass of %s", width, lentgh, super.toString());
    }
}
