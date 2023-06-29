package org.example.exercise_10;

import java.util.Scanner;

public class DecimalToBinary {
    public static void convertDecimalToBinary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Write a decimal number to be converted: ");
        int number = input.nextInt();
        System.out.println(Integer.toBinaryString(number));
    }
}
