package com.stshysha.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 02.03.17.
 */
public class RightAngledTriangleTest {
    @Test
    public void isTriangle() {
        RightAngledTriangle rat = new RightAngledTriangle();
        boolean expInt = true;
        Assert.assertEquals(expInt, rat.isTriangle(3,4,5));
    }

    @Test
    public void isTriangle2() {
        RightAngledTriangle rat = new RightAngledTriangle();
        boolean expInt = false;
        Assert.assertEquals(expInt, rat.isTriangle(3,5,0));
    }

    @Test
    public void isTriangle3() {
        RightAngledTriangle rat = new RightAngledTriangle();
        boolean expInt = false;
        Assert.assertEquals(expInt, rat.isTriangle(3,5,6));
    }

}