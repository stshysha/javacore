package com.stshysha.app.utils.convertors;

/**
 * Created by new on 06.02.17.
 */
public class PrimitiveConvertor {
    float float1 = 1.0f;
    char char1 = 'A';
    int int1 = 10;

    public char floatToChar(float float1) {
        char char1 = (char) float1;
        return char1;
    }

    public char intToChar(int int1) {
        char char1 = (char) int1;
        return char1;
    }

    public int charToInt(char char1) {
        int int1 = (int) char1;
        return int1;
    }

    public void floatToChar(){
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }

    public void intToChar(){
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }

    public void charToInt(){
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}
