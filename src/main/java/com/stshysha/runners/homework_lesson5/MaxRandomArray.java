package com.stshysha.runners.homework_lesson5;

import java.util.Random;

/**
 * Created by new on 27.03.17.
 */
public class MaxRandomArray {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            Random array = new Random();
            intArray[i] = array.nextInt(1000);
            System.out.print(intArray[i] + " ");
            if(max<intArray[i])
                max = intArray[i];
            if(min>intArray[i])
                min = intArray[i];
        }
        System.out.println(" ");
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}