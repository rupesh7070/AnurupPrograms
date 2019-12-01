package com.anurup.samplePrograms.classAndMethods;

import java.util.Scanner;

//PAge 32 : Question bank
// Define a class Salary descriped as below
//Data Memebers : Name, Address, Phone, Subject,Specilization, Monthly Salary, Income tax
// Member methods :
// To accept the details of teacher including the monthly salary
//To display the details of teacher
// to compute the annual income tax as 5 % if the annual salary abive Rs 1,75,000
public class Salary {
    String name;
    String address;
    int phoneNumber;
    String subject;
    String specilization;
    double monthlySalary;
    double incomeTax;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter address");
        address = sc.nextLine();

        System.out.println("Enter phone number");
        phoneNumber = sc.nextInt();

        System.out.println("Enter Subject");
        subject = sc.nextLine();

        System.out.println("Enter Specilization");
        specilization = sc.nextLine();

        System.out.println("Enter monthly  salary");
        monthlySalary = sc.nextInt();
    }

    public void calculateTax() {
        if (monthlySalary > 175000) {
            incomeTax = monthlySalary * 5 / 100;
        }
    }

    public void display(){
        System.out.println("Teacher name " +name + " Address " +address + " PhoneNumber " +phoneNumber + " subject" +subject + " Specilaization "+specilization
        + " monthly salary " +monthlySalary + " Income tax " +incomeTax);

    }

    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.accept();
        salary.calculateTax();
        salary.display();
    }



}
