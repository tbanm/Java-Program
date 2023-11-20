package project_java;

public class StringBufferManipulation {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

        // 1. Add the string "- This is a sample program" to the existing string
        stringBuffer.append("- This is a sample program");
        System.out.println("After adding: " + stringBuffer);

        // 2. Insert the string "Object" into the existing string at the 21st position
        stringBuffer.insert(21, "Object");
        System.out.println("After inserting 'Object': " + stringBuffer);

        // 3. Reverse the entire string
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // 4. Replace the word "Buffer" with "Builder"
        int indexOfBuffer = stringBuffer.indexOf("Buffer");
        if (indexOfBuffer != -1) {
            stringBuffer.replace(indexOfBuffer, indexOfBuffer + "Buffer".length(), "Builder");
        }
        System.out.println("After replacing 'Buffer' with 'Builder': " + stringBuffer);
    }
}

