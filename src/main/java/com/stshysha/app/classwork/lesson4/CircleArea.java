package com.stshysha.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new on 14.02.17.
 */
public class CircleArea {
    public static double calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();

        double circleArea = pi * radius * radius;
        System.out.println("Area is " + circleArea);
        return radius;
    }
}
