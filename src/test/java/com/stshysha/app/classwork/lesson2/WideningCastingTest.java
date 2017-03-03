package com.stshysha.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 01.03.17.
 */
public class WideningCastingTest {
    @Test
    public void widening() {
        WideningCasting wc = new WideningCasting();
        wc.widening();
        double expDouble = 127.0;
        Assert.assertEquals(expDouble, wc.double1, 0);
    }

}