package com.stshysha.runners.lesson5;

/**
 * Created by new on 28.03.17.
 */
public class EvenNumber {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 20; i++) {
            if (i%2==0) { a++; }
        }
        System.out.println(a);
    }
}
