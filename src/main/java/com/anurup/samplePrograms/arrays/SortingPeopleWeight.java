package com.anurup.samplePrograms.arrays;

import java.util.Scanner;

//Question bank : Page 56
//Program to input and sort weight of ten people .Sort and display them in descending order using
//selection sort technique
public class SortingPeopleWeight {
    public static void main(String[] args) {
        int[] weights = new int[5];
        Scanner sc = new Scanner(System.in);
        // Get weight...
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter weights..");
            weights[i] = sc.nextInt();
        }

        //Sort the array
        for (int i = 0; i < 5; i++) {
            int biggest = weights[i];
            int pos = i;

            for (int j = i + 1; j < 5; j++) {
                if (biggest < weights[j]) {
                    biggest = weights[j];
                    pos = j;
                }
            }
            int temp = weights[i];
            weights[i] = biggest;
            weights[pos] = temp;
        }
        //Print weight after sorting

        for(int i = 0; i < 5; i++){
            System.out.println(weights[i]);
        }
    }
}
