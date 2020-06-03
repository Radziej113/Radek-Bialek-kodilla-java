package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLength;

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return sideLength * sideLength;
    }
}
