package Thuresday12;

import java.util.*;
import java.util.stream.*;

// Student class to store student details
class Student {

    int id;        // Student ID
    String name;   // Student Name
    int marks;     // Student Marks

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // toString method to print student details
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class GroupByMarks {

    public static void main(String[] args) {

        // Creating student list
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 80));
        students.add(new Student(2, "Amit", 90));
        students.add(new Student(3, "Neha", 80));
        students.add(new Student(4, "Priya", 90));
        students.add(new Student(5, "Karan", 70));

        // Group students by marks
        Map<Integer, List<Student>> groupedStudents =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.marks));

        // Print grouped result
        for (Map.Entry<Integer, List<Student>> entry : groupedStudents.entrySet()) {

            System.out.println("Marks: " + entry.getKey());
            System.out.println("Students: " + entry.getValue());
            System.out.println();
        }
    }
}