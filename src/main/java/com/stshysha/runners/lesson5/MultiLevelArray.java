package com.stshysha.runners.lesson5;

/**
 * Created by new on 30.03.17.
 */
public class MultiLevelArray {
    public static void main(String[] args) {
        int[][] intArray = new int[2][3];
        for (int j=0; j<intArray.length; j++) {
            for (int k=0; k<intArray[j].length; k++) {
                intArray[j][k] = j * k;
                System.out.println(intArray[j][k]);
            }
        }
    }
}
