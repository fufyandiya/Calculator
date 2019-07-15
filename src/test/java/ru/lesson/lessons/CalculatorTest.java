package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        calc.subtract(0, -2);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void multiplicate() {
        Calculator calc = new Calculator();
        calc.multiplicate(-1, -2);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void divide() {
        Calculator calc = new Calculator();
        calc.divide(-36, -6);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void exponent() {
        Calculator calc = new Calculator();
        calc.exponent(5, 0);
        assertEquals(1, calc.getResult());
    }

    @Test
    public void getResult() {
        Calculator calc = new Calculator();
        calc.add(5, -5);
        assertEquals(0, calc.getResult());
    }

    @Test
    public void cleanResult() {
        Calculator calc = new Calculator();
        calc.exponent(5, 0);
        calc.cleanResult();
        assertEquals(0, calc.getResult());
    }
}