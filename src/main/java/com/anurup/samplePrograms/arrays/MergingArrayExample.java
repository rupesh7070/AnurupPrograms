package com.anurup.samplePrograms.arrays;

import java.util.Scanner;

//From Handout- Question 8

public class MergingArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = 5;
        int A[] = new int[m];

        int n = 3;
        int B[] = new int[n];

        int C[] = new int[m + n];

        // fill elements in array A
        System.out.println("Enter number for first array...");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter number ...");
            A[i] = sc.nextInt();
        }
        // fill elements in array B
        System.out.println("Enter number for second array...");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number ...");
            B[i] = sc.nextInt();
        }

        //fill elements in array C using elements of array A and B

        System.out.println("Printig elements of third array");

        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                C[i] = A[i];
            }else{
                C[i] = B[i-m];
            }
        }

        for(int i = 0 ; i < m+n ; i++){
            System.out.println(C[i]);
        }
    }
}
