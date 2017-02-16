package com.stshysha.app.homework.utils.runners;

import com.stshysha.app.homework.utils.convertors.PrimitiveConvertor;

/**
 * Created by new on 05.02.17.
 */
public class Lesson3Runner {
    public static void main(String[] args) {

        float float1 = 70.0f;
        int int1 = 50;
        char char1 = 'a';

        PrimitiveConvertor convertor1 = new PrimitiveConvertor();

        System.out.println("Input float value is "+ float1 + ". Output char value is " + convertor1.floatToChar(float1));
        System.out.println("Input int value is "+ int1 + ". Output char value is " + convertor1.intToChar(int1));
        System.out.println("Input char value is "+ char1 + ". Output int value is " + convertor1.charToInt(char1));
    }
}
