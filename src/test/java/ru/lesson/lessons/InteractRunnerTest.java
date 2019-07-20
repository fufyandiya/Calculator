package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InteractRunnerTest {

    @Test
    public void testDoOperation() {
        Calculator calc = new Calculator();
        InteractRunner runner = new InteractRunner();
        runner.doOperation(calc, "5", "5", "+");
        assertEquals(10, calc.getResult());
    }

    @Test
    public void testDoOperationWrongOperation() {
        Calculator calc = new Calculator();
        InteractRunner runner = new InteractRunner();
        runner.doOperation(calc, "5", "5", "fsdfsdf");
        assertEquals(0, calc.getResult());
    }

    @Test
    public void testDoOperationWrongNumbers() {
        Calculator calc = new Calculator();
        InteractRunner runner = new InteractRunner();
        runner.doOperation(calc, "adsasdf", "afdafdafds", "/");
        assertEquals(0, calc.getResult());
    }
}