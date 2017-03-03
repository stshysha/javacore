package com.stshysha.runners.homework_lesson4;

import com.stshysha.app.classwork.lesson4.BiggerNumber;
import com.stshysha.app.homework.lesson4.Interface;
import com.stshysha.runners.lesson4.BiggerNumberRunner;
import com.stshysha.runners.lesson4.CircleAreaRunner;
import com.stshysha.runners.lesson4.OddNumberRunner;
import com.stshysha.runners.lesson4.RightAngledTriangleRunner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class InterfaceRunner {
    public static void main(String[] args) {
        System.out.println("1. BiggerNumber - define what number out of 2 is bigger.\n" +
                "2. CircleArea - calculate circle area.\n" +
                "3. OddNumber - define is number odd or even.\n" +
                "4. RightAngledTriangle - define is triangle is right-angeled.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose number from the list above: ");
        try {
            int menu = scanner.nextInt();
            Interface calculate = new Interface();
            boolean result1 = calculate.run1(menu);
            boolean result2 = calculate.run2(menu);
            boolean result3 = calculate.run3(menu);
            boolean result4 = calculate.run4(menu);
            if (result1) {
                System.out.println("Define what number out of 2 is bigger");
                BiggerNumberRunner.main(null);
            } else {
                if (result2) {
                    System.out.println("Calculate circle area.");
                    CircleAreaRunner.main(null);
                } else {
                    if (result3) {
                        System.out.println("Define is number odd or even.");
                        OddNumberRunner.main(null);
                    } else {
                        if (result4) {
                            System.out.println("Define is triangle is right-angeled.");
                            RightAngledTriangleRunner.main(null);
                        } else {
                            System.out.println("Please, select number only from 1 to 4");
                            InterfaceRunner.main(null);
                        }
                    }
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You may only enter integers as a number. Please try again.");
            InterfaceRunner.main(null);
        }
        System.out.print("Please enter \"yes\" if you want to try again: ");
        String startAgain = scanner.next();
        if (startAgain.equals("yes")){
            InterfaceRunner.main(null);
        }
    }
}