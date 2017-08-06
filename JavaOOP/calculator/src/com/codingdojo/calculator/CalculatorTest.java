package com.codingdojo.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(7.5);
        c.setOperation("+");
        c.setOperandTwo(5.5);
        c.performOperation();
        double result = c.getResult();

        System.out.println(result);
    }
}
