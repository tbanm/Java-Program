package project_java;
import java.util.HashMap;
import java.util.Map;

public class HashMapAsignment1{
    public static void main(String[] args) {
        // Initialize a HashMap with String keys and Integer values
        Map<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs to the HashMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);
        studentScores.put("Eve", 89);
     
        // Access and print the values associated with keys
        System.out.println("Alice's score: " + studentScores.get("Alice"));
        System.out.println("Bob's score: " + studentScores.get("Bob"));
        System.out.println("Charlie's score: " + studentScores.get("Charlie"));

        // Check if a key exists in the HashMap
        String searchName = "Frank";
        if (studentScores.containsKey(searchName)) {
            System.out.println(searchName + "'s score: " + studentScores.get(searchName));
        } else {
            System.out.println(searchName + " is not found in the HashMap.");
        }

        // Iterate through the HashMap and print all key-value pairs
        System.out.println("\nAll student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
}


