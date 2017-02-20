package com.stshysha.app.classwork.lesson4;

/**
 * Created by new on 21.02.17.
 */
public class RightAngledTriangle {
    public boolean isTriangle (int a, int b, int c){
        if(a > 0 && b > 0 && c > 0) {
            return (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b);
        } else {
            return false;
        }
    }
}
