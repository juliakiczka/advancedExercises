package org.example.OOP.zadanie3;

public class Circle extends Shape {
    protected int radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%d which is subclass of %s", radius, super.toString());
    }
}
