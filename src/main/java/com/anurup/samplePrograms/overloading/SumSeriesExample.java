package com.anurup.samplePrograms.overloading;

// Class to overload function Sum Series as follows
// void sumSeries(int n , double x) with one integer and one double arguments to find  and display sum of series as
// S = x/1 -x/2 +x/3 - x/4 -- to n terms
// void sumSeries() to find and display  sum of following  series
// S =  1 +(1*2) + ( 1 *2*3) + (1*2*3*4) + ......(1*2*3* .....*20)

public class SumSeriesExample {

    public double sumSeries(int n, double x) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - x / i;
            } else {
                sum = sum + x / i;
            }
        }
        return sum;
    }

    public double SumSeries() {
        double sum = 0.0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + sum * i;
        }
        return sum;
    }
}
