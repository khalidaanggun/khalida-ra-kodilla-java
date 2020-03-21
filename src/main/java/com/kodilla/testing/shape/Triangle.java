package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double bottom;
    double height;
    public Triangle(double bottom, double height){
        this.bottom= bottom;
        this.height= height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 0.5*bottom*height;
    }
}
