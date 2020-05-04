package com.coderscampus.Lesson1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {

    public static void main(String[] args) {

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // LinkedHashset maintains order, HasSet does not

        System.out.println(uniqueNumbers.add(1));
        System.out.println(uniqueNumbers.add(2));
        System.out.println(uniqueNumbers.add(3));
        System.out.println(uniqueNumbers.add(4));
        System.out.println(uniqueNumbers.add(5));
        System.out.println(uniqueNumbers.add(6));
        System.out.println(uniqueNumbers.add(1));

        printSetToConsole(uniqueNumbers);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("James Sheppard");
        uniqueNames.add("Trevor Page");
        uniqueNames.add("Elon Musk");
        uniqueNames.add("Peter Herbert");

        for ( String element : uniqueNames) {
            System.out.println(element);
        }
        System.out.println("");
    }

    private static void printSetToConsole(Set<Integer> elements) {
        for (Integer element : elements) {
            System.out.println(element);
        }
        System.out.println("");
    }
}
