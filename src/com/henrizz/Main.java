package com.henrizz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Candidates Evaluation System Project:

        Scanner input = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your age: ");
        byte age = input.nextByte();
        System.out.print("Your experience (Years): ");
        byte experience = input.nextByte();
        System.out.print("Your GPA: ");
        double gpa = input.nextDouble();
        System.out.print("Do you have a 6.5 Ielts score? (true/false): ");
        boolean ieltsScore = input.nextBoolean();
        System.out.print("Do you have any criminal records? (true/false): ");
        boolean criminalRecords = input.nextBoolean();

        boolean isEligible = (age >= 22)
                         && ((experience >= 2) || (gpa >= 3.2))
                         && (ieltsScore == true)
                         && (criminalRecords == false);

        String classification;
        if ((isEligible == true) && (gpa >= 3.8))
            classification = "Excellent candidate";
        else if ((isEligible == true) && (gpa >= 3.2))
            classification = "Potential candidate";
        else if (isEligible == true)
            classification = "Average candidate";
        else
            classification = "Denied";

        System.out.println("====== YOUR RESULT ======");
        System.out.println("Name: " + name);
        System.out.println("Eligible for interview: " + isEligible);
        System.out.println("Classification: " + classification);



    }
}