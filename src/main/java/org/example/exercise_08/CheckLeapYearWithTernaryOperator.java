package org.example.exercise_08;

import java.util.Scanner;

public class CheckLeapYearWithTernaryOperator {
    public static void leapYear(){
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Write the Year: ");
        year = input.nextInt();
        String result = (year % 4 == 0 ) ? " leap" : " not leap";
        System.out.println("the year is "+result);
        leapYear();
    }
}
