package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer>numbers;

    public OddNumbersExterminator(){

    }


    public ArrayList<Integer> exterminate(ArrayList<Integer>numbers){
        ArrayList<Integer> oddNumbers= new ArrayList<Integer>();
        if(numbers.isEmpty() == true){
            System.out.println("ArrayList is empty!");
            return oddNumbers;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }
}
