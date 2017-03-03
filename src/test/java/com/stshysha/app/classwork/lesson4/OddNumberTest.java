package com.stshysha.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 02.03.17.
 */
public class OddNumberTest {
    @Test
    public void isOdd() {
        OddNumber on = new OddNumber();
        boolean expInt = true;
        Assert.assertEquals(expInt, on.isOdd(11));
    }

    @Test
    public void isOdd2() {
        OddNumber on = new OddNumber();
        boolean expInt = false;
        Assert.assertEquals(expInt, on.isOdd(10));
    }

}