package com.anurup.samplePrograms.arrays;

// Question bank : Page 58
//Define a class to store the given city names in a single dimensional array.Sort these names in
//alphabaticl order using the Bubble sort technique only

// INPUT : Delhi, BAngalore, Agra, Mumbai, Calculatta
//OUTPUT : Agra, Bangalore, Calcutta, Delhi, Mumbai

import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {

        String[] cities = new String[5];
        System.out.println("Enter name of cities...");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of cities...");
            cities[i] = sc.next();
        }

        // now sort cities using bubble sort ..

        for (int i = 0; i < cities.length - 1; i++) {
            for (int j = 0; j < cities.length - 1 - i; j++) {
                if (cities[j].compareTo(cities[j + 1]) > 0) {
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }

        //print the sorted cities
        for (int i = 0; i < cities.length - 1; i++) {
            System.out.println(cities[i]);

        }
    }


}
