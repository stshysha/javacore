package com.stshysha.runners.lesson4;

import com.stshysha.app.classwork.lesson4.SelectTask;
import java.util.Scanner;

/**
 * Created by new on 21.02.17.
 */
public class SelectTaskRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select one task from the list. Type from 1 to 4, please.");
        System.out.print("Please enter task:");
        int task = scanner.nextInt();
        SelectTask st = new SelectTask();
        boolean result1 = st.selectTask1(task);
        boolean result2 = st.selectTask2(task);
        boolean result3 = st.selectTask3(task);
        boolean result4 = st.selectTask4(task);
        if (result1) {
            System.out.println("What number is bigger?");
            BiggerNumberRunner.main(null);
        } else if (result2) {
            System.out.println("Calculate circle area.");
            CircleAreaRunner.main(null);
        } else if (result3) {
            System.out.println("Is number odd or even?");
            OddNumberRunner.main(null);
        } else if (result4) {
            System.out.println("Is the triangle is right-angled?");
            RightAngledTriangleRunner.main(null);
        }
    }
}
