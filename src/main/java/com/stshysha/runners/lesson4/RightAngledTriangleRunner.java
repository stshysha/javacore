package com.stshysha.runners.lesson4;

import com.stshysha.app.classwork.lesson4.RightAngledTriangle;

import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class RightAngledTriangleRunner {
    public static void main(String[] args) {
        RightAngledTriangle calculator = new RightAngledTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter c: ");
        int c = scanner.nextInt();
        boolean result = calculator.isTriangle(a, b, c);
        if (result) {
            System.out.println("Triangle is right-angled");
        }
        else { System.out.println("Triangle is not right-angled");}
    }
}
