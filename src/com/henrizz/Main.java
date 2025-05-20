package com.henrizz;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(" What is your name?:");
        String name = input.nextLine();
        System.out.println("How old are you?:");
        byte age = input.nextByte();
        System.out.println("What is your GPA?:");
        float gpa = input.nextFloat();
        input.nextLine();
        System.out.println("What subjects have you enrolled in?:");
        String subject1 = input.nextLine();String subject2 = input.nextLine();String subject3 = input.nextLine();
        String[] subjects = { subject1, subject2, subject3 };
        String gpaPercent = percent.format(gpa);

        String code1 = name.substring(0,1) + name.substring(1,2);
        int code2 = (int)(Math.random()*1000);

        //Profile Generator:
        System.out.println("\n====== STUDENT PROFILE =====\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpaPercent);
        System.out.println("Subjects :" + Arrays.toString(subjects));
        System.out.println("Student Code: " + code1 + code2);
        System.out.println("\n============================\n");
     }
}