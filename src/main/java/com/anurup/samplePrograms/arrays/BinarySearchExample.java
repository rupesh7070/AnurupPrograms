package com.anurup.samplePrograms.arrays;

// Write a program to peform binary search on list of integer gievn below to seach for an element by users
// if found display the element aling with it's position otherwise display mesage " Searh element not found ".
// elemnts are : 5,7,9,11,15,20,25,89

import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 11, 15, 20, 25, 89};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be searched..");
        int num = sc.nextInt();

        int startPosition = 0;
        int endPosition = numbers.length;
        int found = 0;

        while (startPosition < endPosition) {
            int mid = (startPosition + endPosition) / 2;

            if (num < numbers[mid]) {
                endPosition = mid - 1;
            } else if (num > numbers[mid]) {
                startPosition = mid + 1;
            } else {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("Found the number");
        }else{
            System.out.println("Number is not available");
        }


    }
}
