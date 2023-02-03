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

        // take String input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();


        // Printing original arrayList
        System.out.println(" Original arrayList - " + names);
        // Changing element at index 1
        names.set(2, name1);
        // Printing updated Arraylist
        System.out.println(" Updated ArrayList - " + names);

    }
}
