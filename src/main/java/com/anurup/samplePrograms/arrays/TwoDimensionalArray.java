package com.anurup.samplePrograms.arrays;


import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimArray = new TwoDimensionalArray();

    }

    // Write a program to store number in 3 * 4 matrix in double dimensional array
    //Find the sum of all of the numbers of this martix

    public void sumOfAllElement() {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter number");
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("Sum of all elements is " + sum);
    }

    // Write a program to store number in 3 * 4 matrix in double dimensional array
    // Find the samllest and largest element of this matrix

    public void largestAndSmallest() {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter number");
                matrix[i][i] = sc.nextInt();
            }
        }
        int smallest = matrix[0][0];
        int largest = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrix[i][j] <smallest){
                    smallest = matrix[i][j];
                }
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Smallest element is " +smallest);
        System.out.println("largest element is " +largest);

    }


}
