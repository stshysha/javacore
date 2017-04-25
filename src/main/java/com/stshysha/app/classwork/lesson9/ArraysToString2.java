package com.stshysha.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by new on 20.04.17.
 */
public class ArraysToString2 {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a','b','c','d'};
        stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",", "") //remove the commas
                .replace("[", "") //remove the right bracket
                .replace("]", "") //remove the left bracket
                .replace(" ", "") //remove white spaces
                .trim(); //trim empty cells at end
        System.out.println(stringToDisplay);
    }
}
