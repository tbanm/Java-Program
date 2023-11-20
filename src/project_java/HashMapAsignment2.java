package project_java;

import java.util.HashMap;
import java.util.Map;

public class HashMapAsignment2 {
    public static void main(String[] args) {
        // Initialize a HashMap with String keys and String values
        Map<String, String> capitalCities = new HashMap<>();

        // Add key-value pairs to the HashMap
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("UK", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Japan", "Tokyo");

        // Access and print the values associated with keys
        String country = "UK";
        System.out.println("Capital of " + country + ": " + capitalCities.get(country));

        // Iterate through the HashMap and print all key-value pairs
        System.out.println("\nAll capital cities:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


