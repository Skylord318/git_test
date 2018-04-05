package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    //Привет)
    @Test
    public void whenAddOnePlusOneThenTwo(){
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenvDi2On2Then1(){
        Calculator calc = new Calculator();
        calc.ADd(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtract1On1The0() {
        Calculator calc = new Calculator();
        calc.Add(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultiple2On1Then2() {
        Calculator calc = new Calculator();
        calc.ADD(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}