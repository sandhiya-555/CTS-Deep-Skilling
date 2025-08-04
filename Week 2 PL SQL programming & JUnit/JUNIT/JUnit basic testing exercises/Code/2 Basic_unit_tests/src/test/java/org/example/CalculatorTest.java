package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc= new Calculator();
        assertEquals(5,calc.add(3,2));
    }

    @Test
    void sub() {
        Calculator calc= new Calculator();
        assertEquals(3,calc.sub(5,2));
    }

    @Test
    void mul() {
        Calculator calc= new Calculator();
        assertEquals(10,calc.mul(5,2));
    }

    @Test
    void divide() {
        Calculator calc= new Calculator();
        assertEquals(2,calc.divide(10,5));
    }
}