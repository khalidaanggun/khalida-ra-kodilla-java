package com.kodilla.testing.shape;

public class Circle implements Shape {
    double radius;
    public Circle(double radius){
        this.radius= radius;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
        double phi= 22/7;
        double size = phi * radius *radius;
        return size;
    }
}
