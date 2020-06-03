package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return (Math.sqrt((firstSideLength+secondSideLength+thirdSideLength)*
                (firstSideLength+secondSideLength-thirdSideLength)*
                (firstSideLength-secondSideLength+thirdSideLength)*
                (-firstSideLength+secondSideLength+thirdSideLength)))/4;
    }
}