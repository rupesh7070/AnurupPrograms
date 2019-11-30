package com.anurup.samplePrograms.numbers;
//PAge 31 qyestion bank :  Write a menu driven to accept a number from user
//and check if it's a Plaindrome or Perfect NUmber
// Reverse the number and if it's same as original number then it's a palindorme :121,75257
////Perfect Number : Sum of factors including 1 and excluding number is same as numbers e;g :6


import java.util.Scanner;

public class MenuDrivenPalindromeOrPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Enter 1 if you want to check for Planindrome and Enter 2 if you want to check for Perfect Number");
        int choice = sc.nextInt();

        switch (choice) {
            // Check for Palindrome
            // Find the reverse : reverse = reverse*10+lastDigit
            case 1: {
                int reverse = 0;
                int tempNum = num;
                while (tempNum > 0) {
                    int digit = tempNum % 10;
                    reverse = reverse * 10 + digit;
                    tempNum = tempNum / 10;
                }
                if (reverse == num) {
                    System.out.println("Number is Palindrome");
                } else {
                    System.out.println("Number is not Palindrome");
                }

                break;
            }
            // Check for Perfect
            case 2: {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        sum = sum + i;
                    }
                }
                if(sum == num){
                    System.out.println("This number is Perfect number");
                }else{
                    System.out.println("Number is not perfect");
                }
                break;
            }
            default:
                System.out.println("Not a vlaid option");
        }
    }
}
