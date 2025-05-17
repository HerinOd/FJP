package com.henrizz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String story = "Bluvia, who sets out in revenge for Radley's murder." +
                "\nMeanwhile, Judo, a soldier who becomes involved in a conflict between her militia and a religious cult.";
        System.out.println(story);
        byte x = 18;
        short time = (short)(x + 12);
        String searchFor = "Judo";
        String destination = "Seatle";
        String[] coordinate = { "1890", "87", "8670" };
        String[][] info = { { "Bluvia", "Macky", "Digger", "Maxine" }
                                     ,{ "21", "21", "23", "19" } };
        System.out.println("Enemy: " + searchFor);
        System.out.println("Go to: " + destination);
        System.out.println("Location: " + Arrays.toString(coordinate));
        System.out.println("Last: " + time + " days.");
        System.out.println("Members: " + Arrays.deepToString(info));
     }
}