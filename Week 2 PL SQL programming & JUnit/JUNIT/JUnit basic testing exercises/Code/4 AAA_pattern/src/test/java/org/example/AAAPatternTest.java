package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAPatternTest extends TestCase {
    Calculator calculator;
    @Before
    public void setUp()  {
      calculator= new Calculator();
        System.out.println("Setting up class");
    }
    @After
    public void tearDown() {
        System.out.println("Teardown of class");
    }
    @Test
    public void testTesting() {
        int result=calculator.add(5,10);
        assertEquals(15,result);
    }
}