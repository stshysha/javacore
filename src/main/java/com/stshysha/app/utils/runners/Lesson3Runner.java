package com.stshysha.app.utils.runners;

import com.stshysha.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by new on 05.02.17.
 */
public class Lesson3Runner {
    public static void main (String args[]){

        PrimitiveConvertor casting1 = new PrimitiveConvertor();
        casting1.floatToChar();

        PrimitiveConvertor casting2 = new PrimitiveConvertor();
        casting2.intToChar();

        PrimitiveConvertor casting3 = new PrimitiveConvertor();
        casting3.charToInt();
    }
}
