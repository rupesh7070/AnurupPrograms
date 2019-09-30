package com.anurup.com.anurup.samplePrograms.arrays;

import java.util.Scanner;
//Testig commit
public class ArraysExample {

    public static void main(String[] args) {
/*
        selectionSort();
        binarySearch();
        bubbleSort();
*/
        biggest();
    }


    public static void bubbleSort() {
        int numbers[] = {3, 4, 2, 1, 5, -1, 8, 3, 3};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    //Exchange Selection sort

    public static void selectionSort() {
        int numbers[] = {3, 4, 2, 1, 5, -1};
        int pos;
        for (int i = 0; i < numbers.length; i++) {
            int smallest = numbers[i];
            pos = i;

            for (int j = i + 1; j < numbers.length -1; j++) {
                if (numbers[j] < smallest) {
                    smallest = numbers[j];
                    pos = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[pos];
            numbers[pos] = temp;
        }
    }

    //Binary Search

    public static void binarySearch() {
        int nums[] = {1, 2, 3, 4, 5};
        int start = 0;
        int end = nums.length;
        int numtoSearch = 5;
        int found = 0;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numtoSearch < nums[mid]) {
                end = mid - 1;
            } else if (numtoSearch > nums[mid]) {
                start = mid + 1;
            } else {
                System.out.println("Number is found at position" + mid);
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("NUmber is  available");
        } else {
            System.out.println("NUmber is not available");
        }
    }

    // program to take  5 element in one dimentional array and print the biggest

    public static void biggest(){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i =0 ; i < 5; i++){
            System.out.println("enter number");
            numbers[i]= sc.nextInt();
        }
        int biggest = numbers[0];
        for(int i =1 ; i < numbers.length; i++){
            if(numbers[i] > biggest){
                biggest= numbers[i];
            }
        }

        System.out.println("biggest element is " +biggest);
    }

    // program to input and store roll numbers, names and marks in 3 subject of n
    // number of student  in five dimensional arrays and display remark based on
    //average marks as given below
    //avg mark  = marks in three subject /3
    // 85 - 100 " Excellent
    //75- 81  : Good
    // 1 - 75 : Average

    public void arraysExamples(int n) {

        int[] rollnumbers = new int[n];
        String[] names = new String[n];
        int[] marksSubject1 = new int[n];
        int[] marksSubject2 = new int[n];
        int[] marksSubject3 = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Roll Number");
            rollnumbers[i] = sc.nextInt();

            System.out.println("Enter Name...");
            names[i] = sc.nextLine();

            System.out.println("Enter MArks in first subject...");
            marksSubject1[i] = sc.nextInt();

            System.out.println("Enter MArks in second subject...");
            marksSubject2[i] = sc.nextInt();

            System.out.println("Enter MArks in third subject...");
            marksSubject3[i] = sc.nextInt();


            int avgMarks = (marksSubject1[i] + marksSubject2[i] + marksSubject3[i]) / 3;
            String remark = "";

            if (avgMarks > 90) {
                remark = "Excellent";
            } else if (avgMarks > 75 && avgMarks < 90) {
                remark = "Good";
            }

            System.out.println("Name of Student " + names[i]);
            System.out.println("Roll NUmber of Student " + names[i]);
            System.out.println("Remark for Student is " + names[i]);
        }
    }
    //Write a program to accecpt 20 integer in a single dimension array
    //Find and display the below
    // 1. NUmber of even numbers
    // 2. Number of odd numbers
    // 3. NUmber of multiples of 4
}
