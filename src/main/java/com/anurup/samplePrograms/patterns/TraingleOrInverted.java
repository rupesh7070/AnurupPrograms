package com.anurup.samplePrograms.patterns;
//Question Bank : Page 41
// Write a program to generate a traingle or an inverted Traingle till n terms based upon the
// users choice of traingle to be dispalyed
//Example 1
//Input : Type 1 for triangle and  Type 2 fir inverted triangle
//1
//Enter number of terms
//5
//Output
//1
//22
//333
//4444
//55555

//For Option 2
//55555
//4444
//333
//22
//1


import java.util.Scanner;

public class TraingleOrInverted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();

        System.out.println("Enter 1 for traingle and 2 for inverted traingle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            }
            case 2: {
                for (int i = n; i >= 1; i--) {
                    for (int j = i; j >= 1; j--) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
