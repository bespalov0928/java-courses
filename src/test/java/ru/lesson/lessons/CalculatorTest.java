package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception{
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        assertEquals(3, calculator.getResult());
    }

    @Test
    public void testSub() throws Exception{
        Calculator calculator = new Calculator();
        calculator.sub(2,1);
        assertEquals(1, calculator.getResult());
    }
    @Test
    public void testDiv() throws Exception{
        Calculator calculator = new Calculator();
        calculator.div(2,1);
        assertEquals(2, calculator.getResult());
    }
    @Test
    public void testMult() throws Exception{
        Calculator calculator = new Calculator();
        calculator.mult(2,2);
        assertEquals(4, calculator.getResult());
    }
}