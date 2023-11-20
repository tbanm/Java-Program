package com.practice;

public class FindMissingNumber {
	
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 5, 6, 7, 8}; // An example array with a missing number

	        // Find the missing number
	        int missingNumber = findMissingNumber(numbers);

	        System.out.println("The missing number is: " + missingNumber);
	    }

	    // Method to find the missing number in an array
	    public static int findMissingNumber(int[] numbers) {
	        int n = numbers.length + 1; // Number of elements including the missing one
	        int expectedSum = (n * (n + 1)) / 2; // Sum of consecutive integers from 1 to n
	        int actualSum = 0;

	        for (int number : numbers) {
	            actualSum += number;
	        }

	        return expectedSum - actualSum;
	    }

}
