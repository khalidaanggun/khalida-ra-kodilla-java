package com.kodilla.testing.collection;
import org.junit.*;


import java.util.ArrayList;

class CollectionTestSuite {
    ArrayList<Integer> ari= new ArrayList<Integer>();
    OddNumbersExterminator exa = new OddNumbersExterminator(ari);

    @BeforeClass
    public void element() {
        exa.addElement(ari);
    }
    @Before
    public void testOddNumbersExterminatorEmptyList(){
        exa.exterminate(ari);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        exa.exterminate(ari);
    }
}