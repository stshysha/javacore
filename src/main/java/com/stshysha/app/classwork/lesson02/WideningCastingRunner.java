package com.stshysha.app.classwork.lesson02;

/**
 * Created by new on 02.02.17.
 */
public class WideningCastingRunner {
    byte aByte = 121;
            public static void main(String[] args){

                WideningCasting casting1 = new WideningCasting();
                casting1.widening();

                NarrowingCasting casting2 = new NarrowingCasting();
                casting2.narrowing();
            }
}
