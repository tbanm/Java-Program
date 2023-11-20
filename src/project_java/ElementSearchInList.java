package project_java;

import java.util.ArrayList;
import java.util.List;

public class ElementSearchInList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Element to search for
        String elementToSearch = "Cherry";

        // Using the contains() method to search for the element
        boolean found = list.contains(elementToSearch);

        if (found) {
            System.out.println(elementToSearch + " is present in the list.");
        } else {
            System.out.println(elementToSearch + " is not present in the list.");
        }

        // Using the indexOf() method to find the index of the element
        int index = list.indexOf(elementToSearch);

        if (index != -1) {
            System.out.println(elementToSearch + " is found at index " + index + " in the list.");
        } else {
            System.out.println(elementToSearch + " is not found in the list.");
        }
    }
}

