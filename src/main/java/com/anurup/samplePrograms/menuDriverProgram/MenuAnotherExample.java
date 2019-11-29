package com.anurup.t.menuDriverProgram;

//From handout --Question 10
//Menu driven program to perform below using Switch case
//Pattern 1
// S= x/1-x*x/2+x*x*x/3 - ...n terms

//Pattern 2
//Input an integer and print the sum of first and last digit of that number
// e.g n=8452
// output : 8+2= 10

import java.util.Scanner;

public class MenuAnotherExample {
    public static void main(String[] args) {
        System.out.println("Enter  Pattern1 or Pattern2");

        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        switch (pattern) {
            case "Pattern1": {
                System.out.println("Enter value of x");
                double x = sc.nextInt();
                System.out.println("Enter value of n");
                double n = sc.nextInt();
                double sum = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sum = sum - Math.pow(x, i) / i;
                    } else {
                        sum = sum + Math.pow(x, i) / i;
                    }
                }
                System.out.println("sum is" +sum);
                break;
            }

            case "Pattern2": {
                System.out.println("Enter any digit");
                int num = sc.nextInt();
                int count = 0;
                int firstDigit = 0;
                int rem = 0;
                int lastDigit = 0;

                while (num > 0) {
                    count = count + 1;
                    rem = num % 10;
                    num = num / 10;
                    if (count == 1) {
                        firstDigit = rem;
                    }
                }
                lastDigit = rem;

                System.out.println("Sum of first and last digit is" + (firstDigit + lastDigit));


                break;
            }

            default:
                System.out.println("Select correct optiob");
                break;


        }


    }
}
