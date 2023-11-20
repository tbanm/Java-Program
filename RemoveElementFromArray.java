package com.practice;

import java.util.Arrays;

public class RemoveElementFromArray {
	
	public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5, 6};

        // Element to remove
        int elementToRemove = 3;

        // Find the index of the element to remove
        int indexToRemove = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            // Create a new array without the element to remove
            int[] newArray = removeElement(originalArray, indexToRemove);

            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("Element to Remove: " + elementToRemove);
            System.out.println("Array after removing the element: " + Arrays.toString(newArray));
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Method to remove an element from an array
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return array; // Return the original array if the index is out of bounds
        }

        int[] newArray = new int[array.length - 1];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        return newArray;
    }

}
