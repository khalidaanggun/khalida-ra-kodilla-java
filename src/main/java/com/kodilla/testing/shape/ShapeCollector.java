package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes;
    public ShapeCollector(){
        this.shapes= new ArrayList<Shape>();
    }
    public void addFigure(Shape shape){
        this.shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        this.shapes.remove(shape);
        return true;
    }
    public int getFigureQuantity(){
        return this.shapes.size();
    }
    public Shape getFigure(int i){
        return this.shapes.get(i);
    }
}

