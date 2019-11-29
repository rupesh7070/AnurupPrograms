package com.anurup.samplePrograms.menuDriverProgram;

// Write a menu driven program  in java
// A : To input a number and check if it's NEON number of not
// A number is Neon is neon is sum of all digit of square of number is same as number :e.g :9
// B : to print the REPUNIT series : 1, 11,111,1111,... upto n terms

import java.util.Scanner;

public class MenuDrivenExample {

    public static void main(String[] args) {
        System.out.println("Enter A to check if a number is NEON ");
        System.out.println("Enter B to print REPUNIT series ");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        switch (choice) {
            case "A": {
                System.out.println("Enter a number");
                int num = sc.nextInt();
                int square = num * num;
                int sum = 0;
                // Find  the sum of digits of square
                while (square > 0) {
                    int rem = square % 10;
                    sum = sum + rem;
                    square = square / 10;
                }

                if (sum == num) {
                    System.out.println("Number is NEON");
                }
                break;
            }
            case "B": {
                System.out.println("Enter number of elements to be printed");
                int n = sc.nextInt();
                int initialNumber = 0;

                for (int i = 0; i < n; i++) {
                    int nextNumber = initialNumber * 10 + 1;
                    System.out.print(nextNumber);
                    System.out.print(",");
                    initialNumber = nextNumber;

                }
                break;
            }
            default: {
                System.out.println("Not a valid option. Please select A or B");

            }

        }


    }


}
