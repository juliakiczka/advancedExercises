package org.example.zadanie1;

public class Point3D extends Point2D {
    private float z;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +

                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
