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
        System.out.println(" Enter the index to be removed from the array");

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        names.remove(index);

        // Printing updated Arraylist
        System.out.println(" Updated ArrayList - " + names);
        System.out.println(" Another Updated ArrayList " + names);

    }
}
