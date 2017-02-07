package com.stshysha.app.utils.runners;

import com.stshysha.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by new on 05.02.17.
 */
public class Lesson3Runner {
    public static void main (String args[]) {

        PrimitiveConvertor convertor1 = new PrimitiveConvertor();
        convertor1.floatToChar(50.0f);
        convertor1.intToChar(70);
        convertor1.charToInt('a');
    }
}
