package Thuresday12;

import java.util.*;  // Importing utility classes like List, ArrayList, Optional, Comparator

// Student class to store student details
class Student {

    int id;      // Student ID
    String name; // Student Name
    int marks;   // Student Marks

    // Constructor to initialize student data
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Override toString() method to display student details
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

// Main class to demonstrate Java 8 Stream operations
public class StudentStreamExample {

    public static void main(String[] args) {

        // Creating a list to store Student objects
        List<Student> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Student(1, "Rahul", 85));
        students.add(new Student(2, "Amit", 60));
        students.add(new Student(3, "Neha", 75));
        students.add(new Student(4, "Priya", 90));
        students.add(new Student(5, "Karan", 65));

        // 1. Print all students using Stream API
        System.out.println("All Students:");
        students.stream().forEach(s -> System.out.println(s));

        // 2. Filter students whose marks are greater than 70
        System.out.println("\nStudents with marks > 70:");
        students.stream()
                .filter(s -> s.marks > 70) // condition for filtering
                .forEach(s -> System.out.println(s)); // print filtered students

        // 3. Find the student with the highest marks
        Optional<Student> topStudent = students.stream()
                .max(Comparator.comparing(s -> s.marks)); // compare marks

        System.out.println("\nStudent with highest marks:");

        // Print the student if present
        topStudent.ifPresent(System.out::println);

        // 4. Count the total number of students
        long count = students.stream().count();

        System.out.println("\nTotal Students: " + count);
    }
}