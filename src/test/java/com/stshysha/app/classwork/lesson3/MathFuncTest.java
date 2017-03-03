package com.stshysha.app.classwork.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by new on 09.02.17.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {
    MathFunc mathFunc;

    static final String  RESOURCES_PATH = "src/test/java/resources/";
    static int int1 = 0;

    @Before
    public void setUp() {
        mathFunc = new MathFunc();
        int1++;
    }

    @FileParameters(RESOURCES_PATH + "multiply_parameters.csv")
    @Test // JUnit framework annotation
    public void multiplyTest(int a, int b, int expRes, boolean isTrue){
        Assert.assertEquals(isTrue, expRes == MathFunc.multiply(a, b));
    }

    @Test // JUnit framework annotation
    public void multiplyFailedTest(){
        int a = 1, b = 2, expRes = 12;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Count of executed @Before is " + int1);
    }
}
