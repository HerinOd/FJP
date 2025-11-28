package com.henrizz_dsa;

import java.util.Scanner;

public class NumberBinarySearch {
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

        int numberPosition = binarySearch(numbersArray, targetNumber);
        if (numberPosition == -1)
            System.out.println("No number is found!");
        else
            System.out.println("The number's position is: " + (numberPosition + 1));
    }

    public static int binarySearch(int[] targetArray, int targetNumber) {
        int low = 0;
        int high = targetArray.length - 1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;
            if (targetArray[mid] == targetNumber)
                return mid;
            else if (targetArray[mid] > targetNumber)
                high = mid - 1;
            else if (targetArray[mid] < targetNumber)
                low = mid + 1;
        }
        return -1;
    }

}
