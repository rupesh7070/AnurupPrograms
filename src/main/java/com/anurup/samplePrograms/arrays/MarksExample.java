package com.anurup.samplePrograms.arrays;
//Question bank : Page 55
//Program to input and store roll numbers ,names and marks in 3 subject of 3 numbers of students in five single dimensional array
//and display the remarks based on average marks as given below
//avg marks = Total marks in 3 sub /3
//Average marks  Remarks
//85-100 Excellent
//75-85 Distinction
//60-75 First class
//40 - 60 Pass
//Less than 40  poor

import java.util.Scanner;

public class MarksExample {
    public static void main(String[] args) {
        int[] rollNumbers = new int[3];
        String[] names = new String[3];
        int[] marks1 = new int[3];
        int[] marks2 = new int[3];
        int[] marks3 = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter roll number ...");
            rollNumbers[i] = sc.nextInt();

            System.out.println("Enter Name...");
            names[i] = sc.next();

            System.out.println("Enter marks in first subject");
            marks1[i] = sc.nextInt();

            System.out.println("Enter marks in second subject");
            marks2[i] = sc.nextInt();

            System.out.println("Enter marks in third subject");
            marks3[i] = sc.nextInt();

            double avgMarks = (marks1[i] + marks2[i] + marks3[i]) / 3;

            if (avgMarks > 85 && avgMarks <= 100) {
                System.out.println("Remnarks for " + names[i] + " with roll number " + rollNumbers[i] + " is  Excellent ");
            } else if (avgMarks > 75 && avgMarks <= 85) {
                System.out.println("Remnarks for " + names[i] + "with roll number " + rollNumbers[i] + " is  Distinction");
            } else if (avgMarks > 60 && avgMarks <= 75) {
                System.out.println("Remnarks for " + names[i] + "with roll number " + rollNumbers[i] + " is  Good");
            } else if (avgMarks > 40 && avgMarks <= 60) {
                System.out.println("Remnarks for " + names[i] + "with roll number " + rollNumbers[i] + " is  Pass");
            } else if (avgMarks <= 40) {
                System.out.println("Remnarks for " + names[i] + "with roll number " + rollNumbers[i] + " is  Fail");
            }
        }
    }
}
