package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElements {
	
	public static void main(String[] args) {
        // Two integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Find common elements
        int[] commonElements = findCommonElements(array1, array2);

        if (commonElements.length > 0) {
            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));
            System.out.println("Common Elements: " + Arrays.toString(commonElements));
        } else {
            System.out.println("No common elements found.");
        }
    }

    // Method to find common elements between two integer arrays
    public static int[] findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElementsList = new ArrayList<>();

        // Convert one of the arrays to a list for easier element lookup
        List<Integer> array1List = new ArrayList<>();
        for (int num : array1) {
            array1List.add(num);
        }

        // Iterate through the second array and check for common elements
        for (int num : array2) {
            if (array1List.contains(num)) {
                commonElementsList.add(num);
            }
        }

        // Convert the list of common elements back to an array
        int[] commonElements = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElements[i] = commonElementsList.get(i);
        }

        return commonElements;
    }

}
