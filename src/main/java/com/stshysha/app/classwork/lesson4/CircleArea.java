package com.stshysha.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new on 14.02.17.
 */
public class CircleArea {
    /*public static double calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();

        double circleArea = pi*radius*radius;
        System.out.println("Area is " + circleArea);
        return radius;
    }*/
    public static final double PI = 3.14d;
    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius 1");
        double radius1 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2);
        System.out.println("Please enter circle radius 2");
        double radius2 = scanner.nextDouble();
        double area2 = PI * Math.pow(radius2, 2);
            if (area1 > area2){
                System.out.print("Area1 is bigger");
            }
            else if (area1 < area2) {
                System.out.print("Area2 is bigger");
            }
            else {
                System.out.print("Area1 and Area2 are equals");
            }
        }
    }