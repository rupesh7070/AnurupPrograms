package com.anurup.samplePrograms.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOperation {

    public static void main(String[] args) {
        ArraysOperation arraysExample = new ArraysOperation();
        arraysExample.arrayManupilation();
    }

    // Write a program to input an array A[] of size n.
    // //Store all even numbers of this array from lefy to right
    //and all odd numbers from right to left in another array B[]. Print both arrays
    // A[] ={3,6,9,23,25,27,29,30,6}
    //B[] = {6,30,6,29,27,25,23,3}

    public void arrayManupilation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers...");
        int count = 0;
        int A[] = new int[6];
        int B[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter nunber");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            if (A[i] % 2 == 0) {
                B[count] = A[i];
                count = count + 1;
            }
        }

        for (int j = 5; j >= 0; j--) {
            if (A[j] % 2 != 0) {
                B[count] = A[j];
                count = count + 1;
            }
        }
        System.out.println("Input array is");
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println("Output array is");
        for (int i = 0; i < 6; i++) {
            System.out.print(B[i]);
        }
    }
}
