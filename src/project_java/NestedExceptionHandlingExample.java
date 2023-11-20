package project_java;

public class NestedExceptionHandlingExample {
	public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started");
            
            int[] numbers = {1, 2, 3, 4, 5};
            
            try {
                // Inner try block
                System.out.println("Inner try block started");
                
                int result = numbers[10] / 0; // This will throw an ArithmeticException
                
                System.out.println("Inner try block ended");
            } catch (ArithmeticException innerException) {
                // Handling the ArithmeticException from the inner try block
                System.out.println("Caught ArithmeticException in inner try block: " + innerException.getMessage());
            }
            
            System.out.println("Outer try block ended");
        } catch (ArrayIndexOutOfBoundsException outerException) {
            // Handling the ArrayIndexOutOfBoundsException from the outer try block
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try block: " + outerException.getMessage());
        }
        
        System.out.println("Program completed");
    }

}
