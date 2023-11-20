package com.practice;

import java.util.Scanner;

public class ConcatenateStrings {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string to concatenate
        System.out.print("Enter the second string to concatenate: ");
        String secondString = scanner.nextLine();

        // Method 1: Using the + operator
        String concatenatedString1 = firstString + secondString;

        // Method 2: Using the concat method
        String concatenatedString2 = firstString.concat(secondString);

        System.out.println("Concatenated String (using + operator): " + concatenatedString1);
        System.out.println("Concatenated String (using concat method): " + concatenatedString2);

        scanner.close();
    }

}
