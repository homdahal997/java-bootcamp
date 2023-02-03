package com.homdahal.ArraylistPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArratyListPrimitiveDataTypes {
    public static void main(String[] args) {
        // creating arrayList of primitive Data Types
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        // add numbers to above array using .add
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);

        for (int i = 0; i <=3 ; i++) {
            System.out.println(numbers.get(i));

        }

    }
}
