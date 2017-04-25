package com.stshysha.app.classwork.lesson8;

import java.util.Arrays;

/**
 * Created by new on 20.04.17.
 */
public class AsciiArray {
    public static void main(String[] args) {
        char[] charArray = new char[256];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
        }
        System.out.println("Char array:\n" + Arrays.toString(charArray));
    }
}