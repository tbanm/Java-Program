package com.practice;

import java.util.Scanner;

public class CompareStringsIgnoreCase {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Method 1: Using the equalsIgnoreCase method
        boolean areEqualIgnoreCase1 = firstString.equalsIgnoreCase(secondString);

        // Method 2: Converting both strings to lowercase and comparing
        boolean areEqualIgnoreCase2 = compareIgnoreCaseManually(firstString, secondString);

        System.out.println("Method 1: Using equalsIgnoreCase method");
        if (areEqualIgnoreCase1) {
            System.out.println("The two strings are equal (ignoring case considerations).");
        } else {
            System.out.println("The two strings are not equal (ignoring case considerations).");
        }

        System.out.println("Method 2: Converting to lowercase and comparing");
        if (areEqualIgnoreCase2) {
            System.out.println("The two strings are equal (ignoring case considerations).");
        } else {
            System.out.println("The two strings are not equal (ignoring case considerations).");
        }

        scanner.close();
    }

    // Method to manually compare two strings while ignoring case
    public static boolean compareIgnoreCaseManually(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

}
