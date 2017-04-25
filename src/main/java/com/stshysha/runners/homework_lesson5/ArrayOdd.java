package com.stshysha.runners.homework_lesson5;

/**
 * Created by new on 27.03.17.
 */
public class ArrayOdd {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {a++;}    //% делит левый операнд на правый операнд и возвращает остаток; 7/2 = 1, 8/2 = 0
        }

        int[] intArray = new int[a];
        for (int i = 1, j = 1; i < intArray.length; i++, j += 2) {
            intArray[i] = j;
            System.out.print(intArray[i] + " ");
        }
            System.out.println();

        for (int i = a - 1; i > 0; i--) {
            System.out.print(intArray[i] + " ");
        }
    }
}
