package com.anurup.com.anurup.samplePrograms.classAndMethods;

import java.util.Scanner;

// Page 13 question bank
public class RailwayTicket {

    String name;
    String coach;
    long mobno;
    int amt;
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

    public void update() {
        if (coach.equalsIgnoreCase("First_AC")) {
            amt = amt + 700;
        }else if(coach.equalsIgnoreCase("Second_AC")){
            amt = amt + 500;
        }

    }

}
