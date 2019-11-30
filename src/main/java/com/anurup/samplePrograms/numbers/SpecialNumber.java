package com.anurup.samplePrograms.numbers;

import java.util.Scanner;

public class SpecialNumber {

    // Special Number : Sum of factorial of digit of  the number is same as number
    //EG : 145 is special as 5 ! +4!+1! = 145
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

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


}
