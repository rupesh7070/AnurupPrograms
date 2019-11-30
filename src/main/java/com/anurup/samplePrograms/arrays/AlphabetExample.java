package com.anurup.samplePrograms.arrays;

import java.util.Scanner;

//Question bank : Page 22
//Program to input five words in an array. Arrange these words in decending order of alphabet using
//selection sort technique. Print the sorted array
public class AlphabetExample {

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five names ...");
        // Populate array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter next Name ..");
            names[i] = sc.nextLine();
        }
        // Print name enterted by user
        System.out.println("Orginal array");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        //Sort array using selection sort
        for (int i = 0; i < names.length; i++) {
            String smallest = names[i];
            int position = i;

            for (int j = i + 1; j < names.length - 1; j++) {
                if (names[j].compareTo(smallest) < 0) {
                    smallest = names[j];
                    position = j;
                }
            }

            String temp = names[i];
            names[i] = smallest;
            names[position] = temp;
        }
        //print names after sorting
        System.out.println(" array after sorting");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

    }
}
