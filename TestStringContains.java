package com.practice;

import java.util.Scanner;

public class TestStringContains {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input the sequence to search for
        System.out.print("Enter the sequence of characters to search for: ");
        String sequenceToFind = scanner.nextLine();

        // Method 1: Using the contains method
        boolean containsSequence1 = inputString.contains(sequenceToFind);

        // Method 2: Manually searching for the sequence
        boolean containsSequence2 = containsSequenceManually(inputString, sequenceToFind);

        System.out.println("Method 1: Using contains method");
        if (containsSequence1) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }

        System.out.println("Method 2: Manually searching");
        if (containsSequence2) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }

        scanner.close();
    }

    // Method to manually search for a sequence in a string
    public static boolean containsSequenceManually(String inputString, String sequenceToFind) {
        int length = inputString.length();
        int sequenceLength = sequenceToFind.length();

        for (int i = 0; i <= length - sequenceLength; i++) {
            if (inputString.substring(i, i + sequenceLength).equals(sequenceToFind)) {
                return true;
            }
        }

        return false;
    }

}
