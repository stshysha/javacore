package com.stshysha.runners.lesson4;

import com.stshysha.app.classwork.lesson4.OddNumber;

import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class OddNumberRunner {
    public static void main(String[] args) {
        OddNumber calculator = new OddNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        boolean result = calculator.isOdd(a);
        if (result) {
            System.out.println("a is odd");
        } else {
            System.out.println("a is even");
        }
    }
}