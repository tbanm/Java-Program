package project_java;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ArrayListAssignment3 {
    public static void main(String[] args) {
        // Create an ArrayList to store Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Add 10 Person objects to the ArrayList
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));
        people.add(new Person("Eve", 22));
        people.add(new Person("Frank", 40));
        people.add(new Person("Grace", 32));
        people.add(new Person("Helen", 29));
        people.add(new Person("Ivy", 27));
        people.add(new Person("Jack", 38));

        // Print the Person objects using a for-each loop
        System.out.println("People:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}



