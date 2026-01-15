package com.henrizz_dsa.grokking_algorithms.quicksort;

import java.util.Scanner;

//Exercise 4.4
public class Exercises_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to save: ");
        int amountOfNumbers = scanner.nextInt();
        int[] numbersArray = new int[amountOfNumbers];
        System.out.println("Type in your numbers (in sorted order): ");
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbersArray[i] = scanner.nextInt();
        }
        System.out.println("__________________________________________________");
        System.out.print("Search a number: ");
        int targetNumber = scanner.nextInt();

        int numberPosition = binarySearch(numbersArray, targetNumber, 0, amountOfNumbers - 1);
        if (numberPosition == -1)
            System.out.println("No number is found!");
        else
            System.out.println("The number's position is: " + (numberPosition + 1));
    }

    public static int binarySearch(int[] numbersArray, int targetNumber, int firstIndex, int lastIndex) {
        if (firstIndex > lastIndex) //base case when can't find the number
            return -1;
        int mid = (firstIndex + lastIndex) / 2;
        int guessNumber = numbersArray[mid];
        if (guessNumber == targetNumber) //base case - simplest case when find the number right away
            return mid;
        // recursive cases
        if (guessNumber > targetNumber)
            return binarySearch(numbersArray, targetNumber, firstIndex, mid - 1);
        else
            return binarySearch(numbersArray, targetNumber, mid + 1, lastIndex);
    }

}
