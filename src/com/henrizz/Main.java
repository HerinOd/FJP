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
        int totalScore = 0;

        int i = 0;

        //Nhập:
        for (i = 0; i < studentNumbers; i++) {
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
        //Kết quả:

            //Kết quả cá nhân:
        System.out.println();
        System.out.println("====== Result ======");
        System.out.println();
        for (i = 0; i < studentNumbers; i++) {
            System.out.println("Student " + (i + 1) + " :");
            System.out.println("Name: " + names[i]);
            System.out.println("Grade: " + correctAnswers[i]);
            System.out.println("Classification: " + classification[i]);
            System.out.println();
        }
            //Thống kê:
        System.out.println();
        System.out.println("====== Statistics ======");
        System.out.println();
        System.out.println("Excellent: " + excellentCount);
        System.out.println("Good: " + goodCount);
        System.out.println("Average: " + averageCount);
        System.out.println("Poor: " + poorCount);
        System.out.println();
            //Học sinh xuất sắc:
        System.out.println("====== Excellent Students ======");
        System.out.println();
        i = 0;
        while (true) {
            if ((i < studentNumbers) && (classification[i].equals("Excellent"))) {
                System.out.println(names[i]);
                i++;
            }
            else if ((i < studentNumbers) && (!classification[i].equals("Excellent"))) {
                i++;
                continue;
            }
            else
                break;
        }
            //Điểm trung bình lớp:
        for (i = 0; i < studentNumbers; i++){
            totalScore += correctAnswers[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("Total score: " + ((double)totalScore / studentNumbers));
        }
}