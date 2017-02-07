package com.stshysha.app.utils.convertors;

/**
 * Created by new on 06.02.17.
 */
public class PrimitiveConvertor {
    float float1;
    char char1;
    int int1;

    public char floatToChar(float float1) {
        char char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }

    public char intToChar(int int1) {
        char char1 = (char) int1;
        System.out.println("Input float value is " + int1 + ". Output char value is " + char1);
        return char1;
    }

    public int charToInt(char char1) {
        int int1 = (int) char1;
        System.out.println("Input float value is " + char1 + ". Output char value is " + int1);
        return int1;
    }
}
