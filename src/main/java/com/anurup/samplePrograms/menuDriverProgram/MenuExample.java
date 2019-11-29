package com.anurup.samplePrograms.menuDriverProgram;

// MEnu driven program to display below pattern per user choice
// Pattern 1
//ABCDE
//ABCD
//ABC
//AB
//A

// Pattern 2
//B
//LL
//UUU
///EEEE


import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        System.out.println("Enter patterns to be displayed..");

        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        switch (pattern) {
            case "Pattern1":
                String name = "ABCDE";
                for (int i = name.length(); i > 0; i--) {
                    System.out.println(name.substring(0, i));
                }
                break;

            case "Pattern2":
                String name1 = "BLUE";
                for (int i = 0; i < name1.length(); i++) {
                    char c = name1.charAt(i);
                    for (int j = 0; j <= i + 1; j++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
