package com.anurup.samplePrograms.classAndMethods;

//Handout- Question 9
//A class Compound is created to calculate compound intrest using below formulae
//CI = P(1+r/100)~t -P
// where P = Pricipal, r = rate of intrest and t = time period
//data member: pamt,rate(double data type), time(integer to store time period)
//Function of class
// Compound() = Constructor to assign default values to all data members
// void input() - to input the principal, rate and time from users
// double findInterest - to fund and return compound intrest using above formulae
// void printData() - to print the principal and rate and time

import java.util.Scanner;

public class CompountInterest {
    //Principal Amount
    double pamnt;
    //Rate of Interest
    double rate;
    //Time period
    int time;

    //Constructor to assign default values to all data members
    public CompountInterest() {
        pamnt = 0.0;
        rate = 0.0;
        time = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        pamnt = sc.nextDouble();

        System.out.println("Enter rate of InTerest");
        rate = sc.nextDouble();

        System.out.println("Enter time period");
        time = sc.nextInt();
    }

    double findInterest() {
        double compoundInterest = pamnt * Math.pow((1 + rate / 100), time) - pamnt;
        System.out.println("Compount Interest is " + compoundInterest);
        return compoundInterest;
    }

    void printData() {
        System.out.println("Prinicpal amount " + pamnt + " rate is " + rate + " time is " + time);
    }

    public static void main(String[] args) {
        CompountInterest compountInterest = new CompountInterest();
        compountInterest.input();
        compountInterest.printData();
        compountInterest.findInterest();
    }
}
