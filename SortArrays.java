package com.practice;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
        // Sorting a numeric array
        int[] numericArray = {45, 12, 89, 34, 67, 23};

        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        // Sort the numeric array in ascending order
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending): " + Arrays.toString(numericArray));

        // Sort the numeric array in descending order (manually reverse it)
        int[] descendingNumericArray = new int[numericArray.length];
        for (int i = 0; i < numericArray.length; i++) {
            descendingNumericArray[i] = numericArray[numericArray.length - 1 - i];
        }
        System.out.println("Sorted Numeric Array (Descending): " + Arrays.toString(descendingNumericArray));

        // Sorting a string array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Original String Array: " + Arrays.toString(stringArray));

        // Sort the string array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));
    }

}
