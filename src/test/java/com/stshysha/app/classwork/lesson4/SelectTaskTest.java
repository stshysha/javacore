package com.stshysha.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new on 03.03.17.
 */
public class SelectTaskTest {
    @Test
    public void selectTask1() {
        SelectTask st = new SelectTask();
        boolean expInt = true;
        Assert.assertEquals(expInt, st.selectTask1(1));
    }

    @Test
    public void selectTask2() {
        SelectTask st = new SelectTask();
        boolean expInt = false;
        Assert.assertEquals(expInt, st.selectTask1(3));
    }

    @Test
    public void selectTask3() {
        SelectTask st = new SelectTask();
        boolean expInt = true;
        Assert.assertEquals(expInt, st.selectTask2(2));
    }

    @Test
    public void selectTask4() {
        SelectTask st = new SelectTask();
        boolean expInt = false;
        Assert.assertEquals(expInt, st.selectTask2(1));
    }

    @Test
    public void selectTask5() {
        SelectTask st = new SelectTask();
        boolean expInt = true;
        Assert.assertEquals(expInt, st.selectTask3(3));
    }

    @Test
    public void selectTask6() {
        SelectTask st = new SelectTask();
        boolean expInt = false;
        Assert.assertEquals(expInt, st.selectTask3(7));
    }

    @Test
    public void selectTask7() {
        SelectTask st = new SelectTask();
        boolean expInt = true;
        Assert.assertEquals(expInt, st.selectTask4(4));
    }

    @Test
    public void selectTask8() {
        SelectTask st = new SelectTask();
        boolean expInt = false;
        Assert.assertEquals(expInt, st.selectTask4(1));
    }
}