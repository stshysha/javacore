package com.stshysha.runners.homework_lesson5;

/**
 * Created by new on 27.03.17.
 */
public class ArrayEven {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0, j = 2; i < intArray.length; i++, j += 2) {
            intArray[i] = j;
            System.out.print(intArray[i] + " ");
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("\n" + intArray[i]);
        }
    }
}
