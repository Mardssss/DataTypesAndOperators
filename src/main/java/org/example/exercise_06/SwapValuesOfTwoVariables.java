package org.example.exercise_06;

import java.util.Scanner;

public class SwapValuesOfTwoVariables {
    public static void swapVar(){
        System.out.println("write two numbers to be swaped");
        Scanner var1=new Scanner(System.in);
        Scanner var2=new Scanner(System.in);
        int x = var1.nextInt();
        System.out.println("first number: " + x);
        int y = var2.nextInt();
        System.out.println("second number: " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " firse number = " + x + ", second number = " + y);
    }
}
