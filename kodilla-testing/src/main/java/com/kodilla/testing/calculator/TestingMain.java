package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator= new Calculator(1,52);
        int addResult = calculator.add();
        int substractResult= calculator.substract();

        if(addResult==53){
            System.out.println("Correct");
        }
        else{
            System.out.println("FALSE!");
        }
        if(substractResult==-51){
            System.out.println("Correct");
        }
        else{
            System.out.println("False");
        }

    }
}