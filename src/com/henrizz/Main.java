package com.henrizz;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();


        byte subjectCompleted = input.nextByte();



        String code1 = name.substring(0) + name.substring(1);
        int code2 = (int)(Math.random()*100);

        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.print("Your Name: ");String name = input.nextLine();
        System.out.print("Your Age: ");byte age = input.nextByte();
        System.out.print("Your GPA: ");float gpa = input.nextFloat();String gpaPercent = percent.format(gpa);
        String subject1 = input.nextLine();
        String subject2 = input.nextLine();
        String subject3 = input.nextLine();
        String[] subjects = {subject1, subject2, subject3};

     }
}