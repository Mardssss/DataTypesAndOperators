package org.example.exercise_03;

import java.util.Scanner;

public class CalculateSumOfDigitsOfGivenNumber {
    public static void calculateSumOfDigits(){
        int number,digit,sum=0;
        System.out.println("prompt some digits");
        Scanner digits = new Scanner(System.in);
        number = digits.nextInt();
        while (number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("the some of the numbers is: "+sum);
        calculateSumOfDigits();
    }
}
