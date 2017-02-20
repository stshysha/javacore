package com.stshysha.app.homework.lesson4;

import com.stshysha.app.classwork.lesson4.BiggerNumber;
import com.stshysha.app.classwork.lesson4.CircleArea;
import com.stshysha.app.classwork.lesson4.TriangleCheck;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class Lesson4Runner {
    public static void runner() {
        System.out.println("1. BiggerNumber - define what number out of 2 is bigger\n" +
                "2. CircleArea - define what area out of 2 is bigger\n" +
                "3. RightAngledTriangle - define is triangle is right-angeled\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose number from the list above: ");
        try {
            double number = scanner.nextInt();
            if (number == 1) {
                BiggerNumber.calculateBigger();
            } else {
                if (number == 2) {
                    CircleArea.calculate();
                } else {
                    if (number == 3) {
                        TriangleCheck.triangle();
                    } else {
                        System.out.println("There is no such task number. Try to choose \"1\", \"2\", \"3\"\n");
                        Lesson4Runner.runner();
                    }
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You may only enter integers as a number. Please try again.");
            Lesson4Runner.runner();
        }
        System.out.print("Please enter \"yes\" if you want to try again: ");
        String startAgain = scanner.next();
        if (startAgain.equals("yes")){
            Lesson4Runner.runner();
        }
    }
}
