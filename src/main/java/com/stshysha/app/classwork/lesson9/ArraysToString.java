package com.stshysha.app.classwork.lesson9;

/**
 * Created by new on 20.04.17.
 */
public class ArraysToString {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        for (int i=0; i<charArrayToString.length; i++){
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }
}
