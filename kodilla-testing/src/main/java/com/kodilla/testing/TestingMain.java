package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args){

        int a = 2;
        int b = 1;

        Calculator simpleCalculator = new Calculator();

        Integer resultAdd = simpleCalculator.add(a,b);

        if(resultAdd.equals(3)){

            System.out.println("Addition est passed!");

        } else {

            System.out.println("ERROR!");
        }

        Integer resultSubtract = simpleCalculator.subtract(a,b);

        if(resultSubtract.equals(1)){

            System.out.println("Subtraction test passed!");

        } else {

            System.out.println("ERROR!");
        }
    }
}
