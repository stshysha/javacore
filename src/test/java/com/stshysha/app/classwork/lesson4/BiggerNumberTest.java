package com.stshysha.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 02.03.17.
 */
public class BiggerNumberTest {
    @Test
    public void calculateBigger() {
        BiggerNumber bn = new BiggerNumber();
        boolean expInt = false;
        Assert.assertEquals(expInt, bn.calculateBigger(3,5));
    }

    @Test
    public void calculateBigger2() {
        BiggerNumber bn = new BiggerNumber();
        boolean expInt = true;
        Assert.assertEquals(expInt, bn.calculateBigger(10,10));
    }

    @Test
    public void calculateBigger3() {
        BiggerNumber bn = new BiggerNumber();
        boolean expInt = true;
        Assert.assertEquals(expInt, bn.calculateBigger2(2,0));
    }

    @Test
    public void calculateBigger4() {
        BiggerNumber bn = new BiggerNumber();
        boolean expInt = false;
        Assert.assertEquals(expInt, bn.calculateBigger2(-7,0));
    }

}