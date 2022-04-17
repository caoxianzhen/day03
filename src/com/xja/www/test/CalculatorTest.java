package com.xja.www.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init() {

    }

    @After
    public void close() {

    }

    @Test
    public void testAdd() {
//        System.out.println("我被执行了");

        Calculator c = new Calculator();
        int re = c.add(3, 4);
        System.out.println(re);
        Assert.assertEquals(7, re);

    }
}
