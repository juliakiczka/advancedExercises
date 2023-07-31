package org.example.OOP.zadanie5;

public class Point2DExt {

    protected float x;
    protected float y;

    public Point2DExt() {
        this.x = 0;
        this.y = 0;
    }

    public Point2DExt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
