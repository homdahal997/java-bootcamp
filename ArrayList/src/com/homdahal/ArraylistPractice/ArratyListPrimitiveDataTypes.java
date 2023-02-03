package com.homdahal.ArraylistPractice;

import java.util.ArrayList;

public class ArratyListPrimitiveDataTypes {
    public static void main(String[] args) {
        // creating arrayList of primitive Data Types
        ArrayList<Integer> numbers = new ArrayList<>();
        // add numbers to above array using .add
        numbers.add(100);
        numbers.add(201);
        numbers.add(300);
        numbers.add(411);

        for (int i = 0; i <=3 ; i++) {
            if (numbers.get(i)% 2 != 0){
                System.out.println(numbers.get(i));
            }

        }

    }
}
