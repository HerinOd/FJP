package com.henrizz_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of elements for the array: ");
        int arrayLength = scanner.nextInt();

        int[] inputArray = new int[arrayLength];
        System.out.println("Type in every element for the array: ");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("===================================");
        selectionSort(inputArray);
        System.out.println("Your sorted array: " + Arrays.toString(inputArray));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            // Tìm phần tử nhỏ nhất trong đoạn chưa sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }

            // Hoán đổi (Swap) phần tử nhỏ nhất tìm được với phần tử đầu tiên
            // của đoạn chưa sắp xếp
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

}
