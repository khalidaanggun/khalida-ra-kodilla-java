package com.kodilla.testing.shape;

class Rectangle implements Shape {
   int sideLength;
    public Rectangle(int sideLength){
        this.sideLength = sideLength;
    }
     @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getField() {
         double size= this.sideLength^2;
          return size;
    }
}
