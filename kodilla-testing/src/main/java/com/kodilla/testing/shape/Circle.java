package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;
    private static double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(r);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result;
        return result;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return PI * Math.pow(r, 2);
    }

}
