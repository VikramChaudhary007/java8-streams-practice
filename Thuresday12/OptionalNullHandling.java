package Thuresday12;

import java.util.Optional;

// Student class
class Student {

    int id;        // Student ID
    String name;   // Student Name

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student information
    public String toString() {
        return id + " " + name;
    }
}

public class OptionalNullHandling {

    public static void main(String[] args) {

        // Student object (may be null)
        Student student = null;

        // Wrap the student object using Optional
        Optional<Student> optionalStudent = Optional.ofNullable(student);

        // Print student if present, otherwise print message
        optionalStudent.ifPresentOrElse(
                s -> System.out.println("Student: " + s),
                () -> System.out.println("Student object is null.")
        );
    }
}