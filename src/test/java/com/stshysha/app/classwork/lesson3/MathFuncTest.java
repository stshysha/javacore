package com.stshysha.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new on 09.02.17.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailedTest(){
        int a = 1, b = 2, expRes = 12;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }
}
