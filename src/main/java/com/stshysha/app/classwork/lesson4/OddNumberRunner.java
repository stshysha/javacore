package com.stshysha.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class OddNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        OddNumber calculator = new OddNumber();
        calculator.isOdd(20);
    }
}
