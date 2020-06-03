package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;

    public String getShapeName() {
        return "circle";
    }

    public double getField() {
        return Math.PI * radius * radius;
    }
}
