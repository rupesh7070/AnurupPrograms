package com.anurup.com.anurup.samplePrograms.classAndMethods;

import java.util.Scanner;
//Page 36 : Question bank
public class Student {

    public String name;
    public int age;
    public double m1;
    public double m2;
    public double m3;

    public double maximum;
    public double average;

    public Student(){

    }


    public Student(String name, int age, int m1,int m2, int m3) {
        name = name;
        age = age;
        m1 = m1;
        m2 = m2;
        m3 = m3;
    }

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        name = sc.nextLine();

        System.out.println("Enter age");
        age = sc.nextInt();

        System.out.println("Enter marks 1");
        m1 = sc.nextInt();

        System.out.println("Enter marks 2");
        m2 = sc.nextInt();

        System.out.println("Enter marks 3");
        m3 = sc.nextInt();
    }

    public void compute() {
        average = (m1 + m2 + m3) / 3;
        maximum = Math.max(m1, Math.max(m2, m3));
    }

    public void display(){
        System.out.println("Name" +name);
        System.out.println("Age" +age);
        System.out.println("Marks in first subject " +m1);
        System.out.println("Marks in second subject " +m2);
        System.out.println("Marks in third subject " +m3);
        System.out.println("Average mark" +average);
        System.out.println("Maximum Mark" +maximum);
    }

    public static void main(String[] args) {
        Student anurup  = new Student("Anurup", 15, 75, 85, 95);
        anurup.compute();
        anurup.display();

        Student swarup  = new Student();
        swarup.getStudentDetails();
        swarup.compute();
        swarup.display();

    }

}
