package com.stshysha.runners.lesson4;

import com.stshysha.app.classwork.lesson4.BiggerNumber;

import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class BiggerNumberRunner {
    public static void main(String[] args) {
        BiggerNumber comparing = new BiggerNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x");
        int x = scanner.nextInt();
        System.out.println("Please enter y");
        int y = scanner.nextInt();
        boolean result1 = comparing.calculateBigger(x, y);
        boolean result2 = comparing.calculateBigger2(x, y);
        if (result1) {
            System.out.println("x and y are equals");
        } else {
            if (result2) {
                System.out.println("x is bigger");
            } else {
                System.out.println("y is bigger");
            }
        }
    }
}