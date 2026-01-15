package com.henrizz_dsa.grokking_algorithms.quicksort;

import java.util.Scanner;

//Exercises 4.1, 4.2 and 4.3
public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to put in: ");
        int amount = scanner.nextInt();

        int[] array = new int[amount];

        System.out.println("Enter your numbers: ");
        for(int i = 0; i < amount; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("=============================================");
        System.out.println("Sum: " + sum(array, 0));
        System.out.println("=============================================");
        System.out.println("Count: " + count(array, 0) + " items.");
        System.out.println("=============================================");
        System.out.println("Maximum number: " + maxNum(array, 0));
    }

    public static int maxNum(int[] array, int index) {
        if (index == array.length - 1)
            return array[index];
        int maxOfRest = maxNum(array, index + 1);
        if (maxOfRest > array[index])
            return maxOfRest;
        else
            return array[index];
    }

    public static int count(int[] array, int index) {
        if (index == array.length)
            return 0;
        else {
            return 1 + count(array, index + 1);
        }
    }

    public static int sum(int[] array, int index) {
        if (index == array.length)
            return 0;
        else {
            return array[index] + sum(array, index + 1);
        }
    }

}
