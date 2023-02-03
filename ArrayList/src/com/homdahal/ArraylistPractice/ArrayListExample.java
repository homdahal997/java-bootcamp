package com.homdahal.ArraylistPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // create an ArrayList of String type
        ArrayList<String> names = new ArrayList<>();

        // add John to Arraylist
        names.add("Roise");

        // add Harry to Arraylist
        names.add("Smith");

        // add Niall to Arraylist
        names.add("James");
        // Printing original arrayList
        System.out.println(" Original arrayList - " + names);
        // Changing element at index 1
        names.set(1, "Steve");
        // Printing updated Arraylist
        System.out.println(" Updated ArrayList - " + names);

    }
}
