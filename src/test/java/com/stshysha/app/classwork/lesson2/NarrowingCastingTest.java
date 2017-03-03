package com.stshysha.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 01.03.17.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowing() {
        NarrowingCasting nc = new NarrowingCasting();
        nc.narrowing();
        int expInt = 3;
        Assert.assertEquals(expInt, nc.int1);
    }
}