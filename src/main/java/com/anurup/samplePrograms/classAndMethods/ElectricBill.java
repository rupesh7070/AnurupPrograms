package com.anurup.samplePrograms.classAndMethods;

import java.util.Scanner;

// Page 22, Question bank
public class ElectricBill {

    //constructor

    public ElectricBill(String n, int units) {
        this.n = n;
        this.units = units;
    }
    //Empty constructor
    public ElectricBill() {
    }

    // Name of custumer
    String n;

    // Number of units consumed
    int units;

    //amount to be paid
    double bill;

    // Member methods ...to accept the name of consumer and number of units consumed.

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        n = sc.nextLine();

        System.out.println("Enter number of units consumed ");

        units = sc.nextInt();
    }

    // Member method calculate ..to calculate bill per below tariff
    // Number of units  Rate per units
    //First 100 units   Rs 2
    //NExt 200 units    Rs 3
    //Above 300 units    Rs 5
    // A surcharge of 2.5 % charged if number of units consumed is more than 300 iunits


    void calculate() {
        if (units <= 100) {
            bill = units * 2;
        } else if (units > 100 && units <= 300) {
            bill = units * 3;
        } else if (units > 300) {
            bill = units * 3;
            double surcharge = bill * 2.5 / 100;
            bill = bill + surcharge;
        }
    }
    // void print --- to print the details as below
    // Name of customer
    // NUmber of units consumed
    //Bill Amount

    void print(){
        System.out.println(" Name of customer " +n);
        System.out.println("Number of units consumed" +units);
        System.out.println("Bill amount " +bill);
    }

    // write a main program to create object of this class  abd call the above method

    public static void main(String[] args) {
        //Using constructor
        ElectricBill electricBill = new ElectricBill("Rupesg", 200);
        electricBill.calculate();
        electricBill.print();


        //using methid to get input

        ElectricBill electricBillSecond = new ElectricBill();
        electricBillSecond.accept();
        electricBillSecond.calculate();
        electricBillSecond.print();

    }
}
