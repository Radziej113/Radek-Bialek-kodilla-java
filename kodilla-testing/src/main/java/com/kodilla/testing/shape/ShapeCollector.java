package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final ArrayList<Shape> listOfFigures;

    public ShapeCollector(ArrayList<Shape> listOfFigures) {
        this.listOfFigures = listOfFigures;
    }

    public void addFigure(Shape shape) {
        if(shape != null) {
            listOfFigures.add(shape);
        }
    }

    public void removeFigure(Shape shape) {
        listOfFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n>listOfFigures.size()) {
            return null;
        } else {
            return listOfFigures.get(n);
        }
    }

    public String showFigures() {
        String finalShow = "";
        String separator = ", ";

        for(int i = 0; i < listOfFigures.size(); i++) {
            String phrase = listOfFigures.get(i).getShapeName();
            finalShow = finalShow + phrase;

            if(listOfFigures.size() - 1 > i) {
                finalShow = finalShow + separator;
            }
        }
        System.out.println(finalShow);
        return finalShow;
    }
}