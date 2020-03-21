package com.kodilla.testing.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
   @Test
    public void testAddFigure(){
        //Given
        Shape shape1 = new Rectangle(2);
        ShapeCollector sc= new ShapeCollector();
        //When
        sc.addFigure(shape1);
        //Then
        assertEquals(1,sc.getFigureQuantity());
    }
    @Test
    public void testRemoveFigure(){
        Shape shape2 = new Rectangle(2);
        ShapeCollector sc= new ShapeCollector();
        sc.addFigure(shape2);
        //When
        boolean result= sc.removeFigure(shape2);
        //Then
        assertTrue(result);
        assertEquals(0,sc.getFigureQuantity());
    }

    @Test
    public void testShowFigure(){
        //Given
        Shape shape2 = new Rectangle(2);
        ShapeCollector sc= new ShapeCollector();
        sc.addFigure(shape2);
        //When
        String shapeName = "Rectangle";
        /* Then */
        assertEquals(shapeName,sc.getFigure(0).getShapeName());
    }
}
