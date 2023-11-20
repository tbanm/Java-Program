package project_java;

public class StringOperation {
    public static void main(String[] args) {
        // Create the initial string
        String str = "Welcome to Java World";

        // 1. Return the character at the 5th position and display it
        char charAt5thPosition = str.charAt(4);
        System.out.println("Character at the 5th position: " + charAt5thPosition);

        // 2. Compare the string with "Welcome" lexicographically ignoring case differences
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("Welcome");
        System.out.println("String is equal to 'Welcome' (ignoring case): " + isEqualIgnoreCase);

        // 3. Concatenate "- Let us learn" to the string
        str = str.concat("- Let us learn");
        System.out.println("Concatenated string: " + str);

        // 4. Return the position of the first occurrence of character 'a'
        int firstIndexOfA = str.indexOf('a');
        System.out.println("Position of first occurrence of 'a': " + firstIndexOfA);

        // 5. Replace all occurrences of 'a' with 'e'
        str = str.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + str);

        // 6. Return the substring between the 4th and 10th position
        String substring = str.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + substring);

        // 7. Return the lowercase of the string
        String lowercaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseStr);
    }
}
