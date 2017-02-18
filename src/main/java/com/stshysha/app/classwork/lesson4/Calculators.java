package com.stshysha.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new on 16.02.17.
 */
public class Calculators {
/*    public static boolean isRightAngledTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first sides");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            return   Math.sqrt(a) == Math.sqrt(b) + Math.sqrt(c) || Math.sqrt(b) == Math.sqrt(a) + Math.sqrt(c) || Math.sqrt(c) == Math.sqrt(a) + Math.sqrt(b);
        } return false;
    }
}*/
    public boolean isOdd(int a){
        double b = a/2;
        if (a == ((int)b)*2){
            return false;
        } else return true;
    }
}
