package org.example.exercise_01;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertFahrenheitIntoCelsius {
    public static void convert(){
        Scanner input = new Scanner(System.in);
        double celsius = input.nextInt() - 32;
        celsius = celsius * 5/9;
        System.out.println(celsius);
        convert();
    }
}
