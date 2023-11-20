package project_java;

import java.util.Scanner;

public class arraySumAva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the integers
        int[] numbers = new int[5];
        
        // Prompt the user to input five integers
        System.out.println("Enter five integers, one at a time:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate the sum of the integers
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        
        // Calculate the average of the integers
        double average = (double) sum / 5;
        
        // Print the sum and average
        System.out.println("Sum of the integers: " + sum);
        System.out.println("Average of the integers: " + average);
        
        // Close the scanner
        scanner.close();
    }
}

