package com.stshysha.app.classwork.lesson4;

/**
 * Created by new on 21.02.17.
 */
public class OddNumber {
    public boolean isOdd (double a) {
        double b = a/2;
        if (a == ((int)b)*2){
            return false;
        } else {return true;}
    }
}
