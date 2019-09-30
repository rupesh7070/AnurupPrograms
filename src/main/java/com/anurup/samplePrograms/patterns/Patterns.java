package com.anurup.samplePrograms.patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Patterns pattern = new Patterns();
        pattern.displayPattern();
    }

    /*
     *
     **
     ***
     ****
     */
    public static void printPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    /*
        #####
        ####
        ###
        ##
        #
    */
    public static void printInversePyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }

/*
        #
       ##
      ###
     ####
    #####
*/

    public static void SpaceAndStar() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }
    }
/*
    #####
     ####
      ###
       ##
        #
*/

// to do

    //Write a menu driven program to display below pattern

/*
    Pattern 1
    ABCDE
    ABCD
    ABC
    AB
    A

    PATTERN2
    B
    LL
    UUU
    EEEE
*/

    public void displayPattern() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Pattern1")) {
            String word = "ABCDE";
            int len = word.length();
            for (int i = 0; i < len; i++) {
                System.out.println(word.substring(0, len - i));
            }
        } else {
            String word = "BLUE";
            int len = word.length();
            for (int i = 0; i < len; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(word.charAt(i));
                }
                System.out.println();
            }
        }
    }
    // Program to display and print sum of below series
    // S= 1 +1/2!-1/3!+1/4!........till 1/n!

    public void displayPatternSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int fact = 1;
                for (int j = 1; j <= i; j++) {
                    fact = fact * j;
                }

                sum = sum + 1 / fact;

            } else {
                int fact = 1;
                for (int j = 1;j <= i; j++) {
                    fact = fact * j;
                }

                sum = sum - 1 / fact;

            }
        }
    }

    // find and display sum of below series
    // S = x pow 1 - x pow 2 +x pow 3 ... x pow 20 where x = 2
// S = x`1 -x`2+x~3

    public void anotherPattern(){
        double sum = 0.0;
        for (int i = 1 ; i <= 20 ; i ++){
            if(i % 2 == 0){
                sum = sum - Math.pow(2, i);
            }else{
                sum = sum + Math.pow(2, i);
            }
        }
        System.out.println("Sum is " +sum);
    }
}
