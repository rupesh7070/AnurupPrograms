package com.anurup.samplePrograms.arrays;

//Question bank : page 22
//Write a program to input integer elements into an array of size 5 and perform the following operations
// Display the largest element of the array
//Display the smallest element of the array
//Display sum of all elements of the array

import java.util.Scanner;

public class NumbersExamples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter numbers..");
            numbers[i] = sc.nextInt();
        }

        // Now sort the array using selection sort

        for (int i = 0; i < numbers.length - 1; i++) {
            int smallest = numbers[i];
            int pos = i;

            for (int j = i + 1; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < smallest) {
                    smallest = numbers[j];
                    pos = j;
                }
                int temp = numbers[i];
                numbers[i] = smallest;
                numbers[pos] = temp;
            }
        }

        // Largest element of array  -> THis will be last element of sorted array
        System.out.println("Largest element " +numbers[4]);

        //Smallest element of array -> This will be first element
        System.out.println("Samllest element " +numbers[0]);

        // Sum of all elements
        int sum = 0;

        for(int i = 0 ; i < numbers.length; i ++){
            sum= sum+numbers[i];
        }
        System.out.println("Sum is" +sum);

    }
}
