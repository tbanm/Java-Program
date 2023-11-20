package com.practice;

import java.util.Scanner;

public class GetCharacterAtIndex {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input the index
        System.out.print("Enter the index to get the character: ");
        int index = scanner.nextInt();

        // Check if the index is within the valid range
        if (index >= 0 && index < inputString.length()) {
            // Get the character at the specified index
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index. The index is out of range for the given string.");
        }

        scanner.close();
    }

}
