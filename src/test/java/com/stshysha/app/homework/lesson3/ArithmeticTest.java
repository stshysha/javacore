package com.stshysha.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by new on 18.02.17.
 */
public class ArithmeticTest {
    ArithmeticFunc aritheticFunc;

    @Before
    public void setUp(){
        aritheticFunc = new ArithmeticFunc();
    }

    @Test
    public void additionTest(){
        int a = 12, b = 13, expRes = 25;
        Assert.assertEquals(expRes, ArithmeticFunc.addition(a, b));
    }

    @Test
    public void additionFalseTest(){
        int a = 30, b = 60, expRes = 100;
        Assert.assertNotEquals(expRes, ArithmeticFunc.addition(a, b));
    }

    @Test
    public void subtractionTest(){
        int a = 500, b = 100, expRes = 400;
        Assert.assertEquals(expRes, ArithmeticFunc.subtraction(a, b));
    }

    @Test
    public void subtractionFalseTest(){
        int a = 88, b = 11, expRes = 66;
        Assert.assertNotEquals(expRes, ArithmeticFunc.subtraction(a, b));
    }

    @Test
    public void divisionTest(){
        int a = 16, b = 8, expRes = 2;
        Assert.assertEquals(expRes, ArithmeticFunc.division(a, b));
    }

    @Test
    public void divisionFalseTest(){
        int a = 27, b = 3, expRes = 8;
        Assert.assertNotEquals(expRes, ArithmeticFunc.division(a, b));
    }
}
