package com.anurup.samplePrograms.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberExamples {
    public static void main(String[] args) {
        NumberExamples numerExample = new NumberExamples();
        numerExample.neon();

    }

    //Niven : Number is divisible by sum of digits
    //Eg 126
    public void niven(int num) {
        int sum = 0;
        int digit = 0;
        int copy = num;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        if (copy % sum == 0) {
            System.out.println("Number is niven");
        } else {
            System.out.println("Number is not niven");
        }
    }

    //Perfect Number : Sum of factors including 1 and excluding number is same as numbers
    // eg : 6

    public void perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Number is Perfect");
        } else {
            System.out.println("Number is not Perfect");
        }
    }

    // Pronic number : Number which are product of two consecutive numbers
    // EGg 12 = 4*3 , 20 = 4*5 , 42 = 6 *7
    // year 2018

    public void pronicNumber(int number) {
        int ans = 0;
        for (int i = 1; i < number - 1; i++) {
            if (number % 1 == 0 && number % (i + 1) == 0) {
                ans = ans + 1;
            }
        }
        if (ans > 0) {
            System.out.println("Number is pronic");
        } else {
            System.out.println("Number is not a pronic");
        }
    }

    // Special Number : Sum of factorial of digit of  the number is same as number
    //EG : 145 is special as 5 ! +4!+1! = 145

    public void specialNumber(int number) {
        int sum = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            tempNumber = tempNumber / 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
        }

        if (sum == number) {
            System.out.println("Number is special");
        } else {
            System.out.println("Number is not a special");
        }
    }

    // Check if a number is palindrome
    //e.g : 121, 75257,11
    // Reverse the number and if it's same as original number then it's a palindorme
    // Below is the algo to reverse a number

    public void palindrome(int num) {
        int r, sum = 0, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;  //getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    // Program to reverse a given number

    public void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ...");
        int num = sc.nextInt();

        int reversed = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }

        System.out.println("Reversed number is " + reversed);

    }

    // Program to check if a number is Neon
    //A number is Neon if sum of digit of squares of that number is same as number

    public void neon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int rem = square % 10;
            sum = sum + (rem );
            square = square/10;
        }

        if(sum == num){
            System.out.println("Number is Neon");
        }else{
            System.out.println("NUmber is not Neon");
        }
    }

}

