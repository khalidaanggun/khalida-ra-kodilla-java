package com.kodilla.testing.collection;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
   public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> expectedEmpty = new ArrayList<Integer>();
        OddNumbersExterminator x = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = x.exterminate(expectedEmpty);
        //then
        Assert.assertEquals(result, new ArrayList<Integer>());
    }
   @Test
    public void testOddNumbersExterminatorNormalList(){
       //given
       ArrayList<Integer> numbers = new ArrayList<Integer>(10);
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);
       numbers.add(7);
       numbers.add(8);
       numbers.add(9);
       numbers.add(10);
       OddNumbersExterminator y = new OddNumbersExterminator();
       //when
       ArrayList<Integer> expected =   y.exterminate(numbers);
       ArrayList<Integer> resultEven = new ArrayList<Integer>(5);
       resultEven.add(2);
       resultEven.add(4);
       resultEven.add(6);
       resultEven.add(8);
       resultEven.add(10);
       //then
       Assert.assertEquals(resultEven, expected);
    }
}