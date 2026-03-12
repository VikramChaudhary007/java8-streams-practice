package Thuresday12;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // Creating a list of names
        List<String> names = Arrays.asList("Java", "Spring", "Boot");

        // Using stream map() to convert String list to Integer list (length of each word)
        List<Integer> lengths = names.stream()
                                     .map(name -> name.length())
                                     .toList();

        // Printing original list
        System.out.println("Names: " + names);

        // Printing list of lengths
        System.out.println("Lengths: " + lengths);
    }
}