package com.stshysha.runners.lesson5;

/**
 * Created by new on 30.03.17.
 */
public class OneLevelArrays {
    public static void main(String[] args) {
        boolean[] booleanArray = {true, true, false};
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println(booleanArray[i]);
        }
        {
            System.out.println();
        }

        char[] charArray = {'a', 'b', 'c', 'd'};
        for (int i = 0; i<charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        {
            System.out.println();
        }

        double[] doubleArray = {4.1, 5.2, 6.3, 7.4};
        for (int j = 0; j < doubleArray.length; j++) {
            System.out.println(doubleArray[j]);
        }
        {
            System.out.println();
        }

        long[] longArray = {10, 20, 30, 40};
        for (int k = 0; k < longArray.length; k++) {
            System.out.println(longArray[k]);
        }
    }
}
