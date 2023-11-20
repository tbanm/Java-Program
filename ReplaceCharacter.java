package com.practice;

import java.util.Scanner;

public class ReplaceCharacter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Input the character to be replaced
        System.out.print("Enter the character to be replaced: ");
        char charToReplace = scanner.next().charAt(0);

        // Input the character to replace with
        System.out.print("Enter the character to replace with: ");
        char replacementChar = scanner.next().charAt(0);

        // Perform the character replacement
        String replacedString = replaceCharacter(originalString, charToReplace, replacementChar);

        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);

        scanner.close();
    }

    // Method to replace a specified character with another character in a string
    public static String replaceCharacter(String str, char charToReplace, char replacementChar) {
        // Use the replace method to replace all occurrences of charToReplace with replacementChar
        String replacedString = str.replace(charToReplace, replacementChar);
        return replacedString;
    }

}
