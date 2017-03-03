package com.stshysha.app.homework.lesson4;

import com.stshysha.app.classwork.lesson4.SelectTask;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 03.03.17.
 */
public class InterfaceTest {
    @Test
    public void selectTask1() {
        Interface i = new Interface();
        boolean expInt = true;
        Assert.assertEquals(expInt, i.run1(1));
    }

    @Test
    public void selectTask2() {
        Interface i = new Interface();
        boolean expInt = false;
        Assert.assertEquals(expInt, i.run1(3));
    }

    @Test
    public void selectTask3() {
        Interface i = new Interface();
        boolean expInt = true;
        Assert.assertEquals(expInt, i.run2(2));
    }

    @Test
    public void selectTask4() {
        Interface i = new Interface();
        boolean expInt = false;
        Assert.assertEquals(expInt, i.run2(1));
    }

    @Test
    public void selectTask5() {
        Interface i = new Interface();
        boolean expInt = true;
        Assert.assertEquals(expInt, i.run3(3));
    }

    @Test
    public void selectTask6() {
        Interface i = new Interface();
        boolean expInt = false;
        Assert.assertEquals(expInt, i.run3(0));
    }

    @Test
    public void selectTask7() {
        Interface i = new Interface();
        boolean expInt = true;
        Assert.assertEquals(expInt, i.run4(4));
    }

    @Test
    public void selectTask8() {
        Interface i = new Interface();
        boolean expInt = false;
        Assert.assertEquals(expInt, i.run4(9));
    }
}