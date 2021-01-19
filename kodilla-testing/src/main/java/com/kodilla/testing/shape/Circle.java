package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;
    private int second = 2;

    public Circle(double r, int second) {
        this.r = r;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        if (second != circle.second) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(r);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + second;
        return result;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14 * Math.pow(r, second);
    }

}
