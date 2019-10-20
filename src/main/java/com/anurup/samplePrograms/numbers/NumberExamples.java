package com.anurup.samplePrograms.numbers;

public class NumberExamples {
    public static void main(String[] args) {
        NumberExamples numerExample = new NumberExamples();
        numerExample.specialNumberSec(146);

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
        while (tempNumber >= 1) {
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

    // Special number
    // Special Number : Sum of factorial of digit of  the number is same as number
    //EG : 145 is special as 5 ! +4!+1! = 145

    public void specialNumberSec(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
        }
        if (sum == num) {
            System.out.println("Number is special");
        } else {
            System.out.println("Number is not special");
        }

    }

}
