package com.stshysha.runners.lesson4;

import com.stshysha.app.classwork.lesson4.CircleArea;

import java.util.Scanner;

/**
 * Created by new on 14.02.17.
 */
public class CircleAreaRunner {
    public static void main(String[] args) {
        CircleArea square = new CircleArea();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();
        double circleArea = square.calculate(pi, radius);
        System.out.println("Area is " + circleArea);
    }
}