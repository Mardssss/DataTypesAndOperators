package org.example.exercise_02;

import java.util.Scanner;

public class CalculateAreaOfTriangleByBaseAndHeight {
    public static void calculateArea(){
        System.out.println("whats the Base and Height size of the triangle:");
        Scanner base = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        int area = (base.nextInt()*height.nextInt())/2;
        System.out.println("the area of the triangle is: "+area);
    }
}
