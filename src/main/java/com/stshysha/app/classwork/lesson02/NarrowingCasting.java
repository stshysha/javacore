package com.stshysha.app.classwork.lesson02;

/**
 * Created by new on 02.02.17.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);
    }
}