package com.henrizz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many students ?: ");
        int studentNumbers = input.nextInt();

        //Lưu trữ:
        String[] names = new String[studentNumbers];
        int[] correctAnswers = new int[studentNumbers];
        String[] classification = new String[studentNumbers];
        int excellentCount = 0;
        int goodCount = 0;
        int averageCount = 0;
        int poorCount = 0;

        //Nhập:
        for (int i = 0; i < studentNumbers; i++) {
            input.nextLine();
            System.out.println("Student " + (i + 1) + " :");
            System.out.print("Name: ");
            names[i] = input.nextLine();
            System.out.print("Numbers of correct answers: ");
            correctAnswers[i] = input.nextInt();
            //Phân loại:
            if (correctAnswers[i] >= 8) {
                classification[i] = "Excellent";
                excellentCount++;
            }
            else if (correctAnswers[i] >= 6) {
                classification[i] = "Good";
                goodCount++;
            }
            else if (correctAnswers[i] >= 4) {
                classification[i] = "Average";
                averageCount++;
            }
            else {
                classification[i] = "Poor";
                poorCount++;
            }

        }
        System.out.println();
        System.out.println("====== Result ======");
        System.out.println();
        for (int i = 0; i < studentNumbers; i++) {
            System.out.println("Student " + (i + 1) + " :");
            System.out.println("Name: " + names[i]);
            System.out.println("Grade: " + correctAnswers[i]);
            System.out.println("Classification: " + classification[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println("====== Statistics ======");
        System.out.println();
        System.out.println("Excellent: " + excellentCount);
        System.out.println("Good: " + goodCount);
        System.out.println("Average: " + averageCount);
        System.out.println("Poor: " + poorCount);
        }
}