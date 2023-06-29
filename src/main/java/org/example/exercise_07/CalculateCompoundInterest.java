package org.example.exercise_07;

import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void calculateInterest (){
        System.out.println("write the initial amout / interest rate / time period");
        Scanner input = new Scanner(System.in);
        String text = input.toString();
        double principle, rate, time, compound_interest;
        System.out.println("Required packages have been imported");
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("A Scanner object has been defined ");
        System.out.print("Enter a Principle number : ");
        principle = my_scanner.nextInt();
        System.out.print("Enter Interest rate : ");
        rate = my_scanner.nextInt();
        System.out.print("Enter a Time period in years : ");
        time = my_scanner.nextInt();
        compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
        System.out.println("the compound interest is: "+compound_interest);


    }
}
