package com.kodilla.testing.calculator;

public class Calculator {
    public int a;
    public int b;

    public Calculator(int a, int b){
        this.a= a;
        this.b= b;
    }
    public int add(){
        return this.a+this.b;
    }
    public int substract(){
        return this.a-this.b;
    }
}
