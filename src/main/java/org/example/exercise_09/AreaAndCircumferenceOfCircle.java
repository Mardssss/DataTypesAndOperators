package org.example.exercise_09;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void calculateArea(){
        Double pi = 3.14159265359;
        Scanner input = new Scanner(System.in);
        System.out.print("Write the radius of the circle: ");
        Double inputy = input.nextDouble();
        Double area = pi * (inputy * inputy);
        Double circun = 2 * pi * inputy;
        System.out.println("The area of the circle is: "+area);
        System.out.println("The Circumference of the circle is: "+circun);
                //Area = π * r^2
        //Circumference = 2 * π * r.
    }

}
