package com.stshysha.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 02.03.17.
 */
public class CircleAreaTest {
    @Test
    public void calculate() {
        CircleArea ca = new CircleArea();
        double expInt = 314.0;
        Assert.assertEquals(expInt, ca.calculate(3.14,10), 0);
    }

}