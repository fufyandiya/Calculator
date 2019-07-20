package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        calc.subtract(0, -2);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void testMultiplicate() {
        Calculator calc = new Calculator();
        calc.multiplicate(-1, -2);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        calc.divide(-36, -6);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void testDivideByZero() throws ArithmeticException{
        Calculator calc = new Calculator();
        try {
            calc.divide(-36, 0);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Нельзя делить на ноль!");
        }
        assertEquals(0, calc.getResult());
    }
    @Test
    public void testExponent() {
        Calculator calc = new Calculator();
        calc.exponent(5, 0);
        assertEquals(1, calc.getResult());
    }

    @Test
    public void testGetResult() {
        Calculator calc = new Calculator();
        calc.add(5, -5);
        assertEquals(0, calc.getResult());
    }

    @Test
    public void testCleanResult() {
        Calculator calc = new Calculator();
        calc.exponent(5, 0);
        calc.cleanResult();
        assertEquals(0, calc.getResult());
    }

}