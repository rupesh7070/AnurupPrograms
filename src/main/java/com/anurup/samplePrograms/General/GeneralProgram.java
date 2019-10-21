package com.anurup.samplePrograms.General;

public class GeneralProgram {

    public static void main(String[] args) {
        GeneralProgram gm = new GeneralProgram();
        gm.greatestCommonDivisor(25, 45);

    }

    // Program to find greatest common divisor for two numbers

    public void greatestCommonDivisor(int num1, int num2) {
        int smallest;
        int largest;
        int greatestCommonDivsiort =1;
        if (num1 < num2) {
            smallest = num1;
            largest = num2;
        } else {
            smallest = num2;
            largest = num1;
        }

        for (int i = 1; i < smallest; i++) {
            if (smallest % i == 0) {
                if (largest % i == 0) {
                    greatestCommonDivsiort = i;
                }
            }
        }

        System.out.println("Greatest commmon divisor of " +num1 + " and " +num2 + " is " +greatestCommonDivsiort);

    }
}
