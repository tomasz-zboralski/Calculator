package com.kodilla;

public class Calculator {
    public int addAB(int a, int b){
        return a + b;
    }
    public int subtractionAB(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addAB(2,2));
        System.out.println(calculator.subtractionAB(4,2));

    }
}
