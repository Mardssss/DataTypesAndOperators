package org.example.exercise_04;

import java.util.Scanner;

public class ItsVowelOrConsonant {
    public static void check() {
        Scanner text = new Scanner(System.in);
        String input = text.nextLine().toLowerCase();
        if (input.length() == 1) {
            char check = input.charAt(0); // Get the first character of the input

            switch (check) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(input + " is a vowel");
                    break;
                default:
                    System.out.println(input + " is a consonant");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }
        check();
    }
}
