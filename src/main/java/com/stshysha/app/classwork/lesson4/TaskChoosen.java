package com.stshysha.app.classwork.lesson4;

import com.stshysha.app.classwork.lesson4.CircleArea;
import com.stshysha.app.classwork.lesson4.TriangleCheck;

import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class TaskChoosen {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter task number: ");
        double task = scanner.nextDouble();
        if (task == 1) {
            TriangleCheck.triangle();
        } else {
            if (task == 2) {
                CircleArea.calculate();
            } else {
                if (task == 3) {
                    BiggerNumber.calculateBigger();
                } else {System.out.print("There is no such task number. Try to choose 1, 2, 3");}
            }
        }
    }
}
