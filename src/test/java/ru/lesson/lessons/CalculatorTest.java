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
    @Test(expected = UserException.class)
    public void testFormatException() throws Exception{
        Calculator calculator = new Calculator();
        calculator.add();
    }

    @Test
    public void testSub() throws Exception{
        Calculator calculator = new Calculator();
        calculator.sub(2,1);
        assertEquals(1, calculator.getResult());
    }

    @Test(expected = UserException.class)
    public void DivException() throws Exception{
        Calculator calculator = new Calculator();
        calculator.div();
        /*assertEquals(2, calculator.getResult());*/
    }
    @Test()
    public void Div() throws Exception{
        Calculator calculator = new Calculator();
        calculator.div(1,1);
        assertEquals(1, calculator.getResult());
    }
    @Test(expected = IllegalArgumentException.class)
    public void divRuntaimException() throws Exception{
        Calculator calculator = new Calculator();
        calculator.div(1,0);
        /*assertEquals(2, calculator.getResult());*/
    }

    @Test
    public void testMult() throws Exception{
        Calculator calculator = new Calculator();
        calculator.mult(2,2);
        assertEquals(4, calculator.getResult());
    }
    @Test(expected = UserException.class)
    public void testMultException() throws Exception{
        Calculator calculator = new Calculator();
        calculator.mult();
    }
}