package java_objects;

import java.util.Scanner;

class Subject {
    private String name;
    private int marks;

    public Subject(String name) {
        this.name = name;
        this.marks = 0;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private String rollNumber;
    private Subject[] subjects;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        subjects = new Subject[2];
        subjects[0] = new Subject("Maths");
        subjects[1] = new Subject("English");
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

class Teacher {
    public void setStudentMarks(Student student, int marksMaths, int marksEnglish) {
        student.getSubjects()[0].setMarks(marksMaths);
        student.getSubjects()[1].setMarks(marksEnglish);
    }
}

public class studentClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        Teacher teacher = new Teacher();

        // Instantiate 10 students with random names and roll numbers
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student" + (i + 1), "Roll" + (i + 1));
        }

        // Set marks for each student based on teacher's input
        for (Student student : students) {
            System.out.println("Enter marks for " + student.getName() + ":");
            int marksMaths = scanner.nextInt();
            int marksEnglish = scanner.nextInt();
            teacher.setStudentMarks(student, marksMaths, marksEnglish);
        }

        // Prompt the teacher to perform tasks
        while (true) {
            System.out.println("\nOptions for the teacher:");
            System.out.println("a> Find average of marks");
            System.out.println("b> Find Max and Min and display the marks");
            System.out.print("Enter your choice (a/b): ");
            char choice = scanner.next().charAt(0);

            if (choice == 'a') {
                double totalMarks = 0;
                for (Student student : students) {
                    totalMarks += student.getSubjects()[0].getMarks() + student.getSubjects()[1].getMarks();
                }
                double averageMarks = totalMarks / (students.length * 2);
                System.out.println("The average marks are: " + averageMarks);
            } else if (choice == 'b') {
                int maxMarks = Integer.MIN_VALUE;
                int minMarks = Integer.MAX_VALUE;
                for (Student student : students) {
                    for (Subject subject : student.getSubjects()) {
                        int marks = subject.getMarks();
                        maxMarks = Math.max(maxMarks, marks);
                        minMarks = Math.min(minMarks, marks);
                    }
                }
                System.out.println("Maximum marks: " + maxMarks);
                System.out.println("Minimum marks: " + minMarks);
            } else {
                System.out.println("Invalid choice. Please select 'a' or 'b'.");
            }

            System.out.print("Do you want to perform another task? (yes/no): ");
            String anotherChoice = scanner.next();
            if (!anotherChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}

