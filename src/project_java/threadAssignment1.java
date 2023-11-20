package project_java;

public class threadAssignment1{
    private static final int[] arr = {1, 20, 50, 15, 30};

    public static void main(String[] args) {
        // Create two threads
        Thread averageThread = new Thread(new AverageCalculator());
        Thread squareThread = new Thread(new SquarePrinter());

        // Start both threads
        averageThread.start();
        squareThread.start();
    }

    // Runnable class to calculate the average of the first 10 numbers
    static class AverageCalculator implements Runnable {
        @Override
        public void run() {
            synchronized (arr) {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i + 1;
                }
                double average = sum / 10.0;
                System.out.println("Average of first 10 numbers: " + average);
            }
        }
    }

    // Runnable class to print the squares of numbers in the array
    static class SquarePrinter implements Runnable {
        @Override
        public void run() {
            synchronized (arr) {
                System.out.print("Squares of numbers in the array: ");
                for (int num : arr) {
                    System.out.print(num * num + " ");
                }
                System.out.println();
            }
        }
    }
}



