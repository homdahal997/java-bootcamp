package com.homdahal.ArraylistPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // create an ArrayList of String type
        ArrayList<String> names = new ArrayList<>();

        // add John to Arraylist
        names.add("Jeremy");

        // add Harry to Arraylist
        names.add("Jules");

        // add Niall to Arraylist
        names.add("Howard");

        // Printing original arrayList
        System.out.println(" Original arrayList - " + names);
        // Removing element at index 1
        names.remove(1);
        // Printing updated Arraylist
        System.out.println(" Updated ArrayList - " + names);

    }
}
