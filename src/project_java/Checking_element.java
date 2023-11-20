package project_java;
import java.util.ArrayList;
import java.util.List;

public class Checking_element {
	
	
	    public static void main(String[] args) {
	        // Create an ArrayList and add some elements
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Element to check
	        String elementToCheck = "blue barray";

	        // Check if the element is present in the list
	        boolean isPresent = list.contains(elementToCheck);

	        if (isPresent) {
	            System.out.println(elementToCheck + " is present in the list.");
	        } else {
	            System.out.println(elementToCheck + " is not present in the list.");
	        }
	    }
	}



