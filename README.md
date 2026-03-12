
# Java 8 Streams & Optional – Practical Programs

# Overview

This repository contains **Java 8 practical programs** demonstrating the use of the **Stream API**, **Lambda Expressions**, **Collectors**, and **Optional** for handling null values.

These programs help understand **functional programming concepts in Java 8** such as filtering, sorting, mapping, grouping, and safe null handling.


 📂 Programs Included

# Streams Basics

Create a `Student` list and perform operations using Streams:

* Print all students
* Filter students with marks greater than **70**
* Find the student with the **highest marks**
* Count the **total number of students**

# Stream Sorting

Sort an `Employee` list using Streams:

* Sort employees by **salary (ascending order)**
* Sort employees by **salary (descending order)**

# Map Operation

Convert a list of strings into a list of their lengths using `map()`.

Example:

```
Input:
["Java","Spring","Boot"]

Output:
[4,6,4]
```

# Grouping

Group students by marks using:

```
Collectors.groupingBy()
```

Example:

```
Marks 80 → [Student1, Student2]
Marks 90 → [Student3, Student4]
```

# Optional & Null Handling

Demonstrates how to avoid **NullPointerException** using `Optional`.

Features:

* `Student` object may be **null**
* Use `Optional.ofNullable()` to safely handle null values
* Use `ifPresentOrElse()` to execute logic safely

---

# Concepts Covered

* Java 8 Stream API
* Lambda Expressions
* `filter()`
* `map()`
* `sorted()`
* `groupingBy()`
* `Optional`
* Functional Programming Basics

 # Technologies Used

* Java 8+
* Stream API
* Collections Framework

 ▶ How to Run

1. Clone the repository
2. Open the project in **VS Code / IntelliJ / Eclipse**
3. Compile and run the Java files

Example:

```
javac FileName.java
java FileName
```

 # Learning Purpose

This repository is created for **Java practice and understanding Java 8 functional features** which are commonly used in **modern Java development and interviews**.

