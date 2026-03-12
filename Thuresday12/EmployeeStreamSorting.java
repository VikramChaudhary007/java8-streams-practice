package Thuresday12;

import java.util.*;

// Employee class to store employee details
class Employee {

    int id;          // Employee ID
    String name;     // Employee Name
    double salary;   // Employee Salary

    // Constructor to initialize employee data
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to print employee details
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeStreamSorting {

    public static void main(String[] args) {

        // Creating employee list
        List<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee(1, "Rahul", 50000));
        employees.add(new Employee(2, "Amit", 70000));
        employees.add(new Employee(3, "Neha", 60000));
        employees.add(new Employee(4, "Priya", 90000));
        employees.add(new Employee(5, "Karan", 40000));

        // 1. Sort by salary ascending
        System.out.println("Employees sorted by salary (Ascending):");

        employees.stream()
                .sorted(Comparator.comparing(e -> e.salary))
                .forEach(System.out::println);

        // 2. Sort by salary descending
        System.out.println("\nEmployees sorted by salary (Descending):");

        employees.stream()
                .sorted(Comparator.comparing((Employee e) -> e.salary).reversed())
                .forEach(System.out::println);
    }
}
