package org.example.exercise_05;

import java.util.Scanner;

public class CalculateTheAverageOfFiveNumbers {
    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter five numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        if (numbers.length > 5) {
            System.out.println("You inserted more than 5 numbers. Please try again.");
            calculateAverage();
        } else {
            for (String numberStr : numbers) {
                int number = Integer.parseInt(numberStr);
                sum += number;
            }

            double average = (double) sum / numbers.length;

            System.out.println("The average of the numbers is: " + average+". Try some more");
            calculateAverage();
        }
    }
}