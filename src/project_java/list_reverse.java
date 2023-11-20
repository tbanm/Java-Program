package project_java;

import java.util.ArrayList;
import java.util.List;

public class list_reverse {
    public static void main(String[] args) {
        // Create a sample list
        List<Integer> originalList = new ArrayList<>();
        originalList.add(41);
        originalList.add(26);
        originalList.add(38);
        originalList.add(48);
        originalList.add(55);

        // Create a new list to store the reversed elements
        List<Integer> reversedList = new ArrayList<>();

        // Iterate through the original list in reverse order and add elements to the new list
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        // Print the reversed list
        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }
}

