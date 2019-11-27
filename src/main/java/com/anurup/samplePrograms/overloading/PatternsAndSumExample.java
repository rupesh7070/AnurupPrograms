package com.anurup.samplePrograms.overloading;
// Class to overload function as follows

//void pattern (char ch,int n) with one charcter and one interger argument and print
// n lines  containing character stored in ch
// eg : if ch = '@' and n = 3 then print
//@
//@@
//@@@

// void pattern(double x, double n) with two double arguments and returns the sum of below series
// S = x/n +x/n-1 + x/n-2 + ....+x/2 + x/1


public class PatternsAndSumExample {

    public static void main(String[] args) {
        PatternsAndSumExample patternsAndSumExample = new PatternsAndSumExample();
        patternsAndSumExample.pattern('$', 5);
    }

    public void pattern(char c, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public double pattern(double x, double n) {
        double sum = 0.0;
        for (double i = n; i >= 1; i--) {
            sum = sum + x / n;
        }
        return sum;
    }
}
