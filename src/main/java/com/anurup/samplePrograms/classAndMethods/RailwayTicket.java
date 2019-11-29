package com.anurup.samplePrograms.classAndMethods;

import java.util.Scanner;

// Page 13 question bank
public class RailwayTicket {

    public RailwayTicket() {
    }

    //to store name of customer
    String name;

    //to store the type of coach custer want to travel
    String coach;

    //to store mobile number
    long mobno;

    // to store basic amount of ticketr
    int amt;

    // to store total amount to be paid after updating the original amount
    int totalAmount;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name ..");
        name = sc.nextLine();

        System.out.println("Enter coach");
        coach = sc.nextLine();

        System.out.println("Enter Mobile Number");
        mobno = sc.nextLong();

        System.out.println("Enter Amount ");
        totalAmount = sc.nextInt();
    }

    // To update the amount as per the coach selected
    //extra amount to be added in amount per follows
    // Type of coach    Amount
    //First_AC  700
    //Second_AC 500
    //Third_AC  250
    //Sleeper   None

    public void update() {
        if (coach.equalsIgnoreCase("First_AC")) {
            amt = amt + 700;
        } else if (coach.equalsIgnoreCase("Second_AC")) {
            amt = amt + 500;
        } else if (coach.equalsIgnoreCase("Thrid_AC")) {
            amt = amt + 250;
        }
    }

    //display : to display all details of customer such as name,coach, total amount and mobile number

    public void display(){
        System.out.println("Name of customer" + name);
        System.out.println("coach is " +coach);
        System.out.println("Total amount is " +totalAmount);
        System.out.println("Mobile number is " +mobno);
    }

    public static void main(String[] args) {
        RailwayTicket railwayTicket = new RailwayTicket();
        railwayTicket.accept();
        railwayTicket.update();
        railwayTicket.display();
    }


}
