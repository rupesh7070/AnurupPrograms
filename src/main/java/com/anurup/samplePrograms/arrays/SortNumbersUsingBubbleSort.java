package com.anurup.samplePrograms.arrays;

import java.util.Scanner;

//Question bank page 56
//Write a program to input 10 integer in an array and then sort them in
//descending order using bubble sort technique
public class SortNumbersUsingBubbleSort {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("Enter numbers ...");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the numbers...");
            numbers[i] = sc.nextInt();
        }

        // Now sort using bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        //Print the sorted array
        System.out.println("Sorted array is ....");
        for(int i =0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
