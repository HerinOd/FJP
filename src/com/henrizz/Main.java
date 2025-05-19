package com.henrizz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String story = "Bluvia, who sets out in revenge for Radley's murder." +
                "\nMeanwhile, Judoni, a soldier who becomes involved in a conflict between her militia and a religious cult.";
        System.out.println(story);
        byte x = 18;
        short time = (short)(x + 12);
        String searchFor = "Judoni";
        String homeTown = "Jackson";
        String destination = "Seatle";
        String[] coordinate = { "1890", "87", "8670" };
        String[][] info = { { "Bluvia", "Macky", "Digger", "Maxine" }
                                     ,{ "21", "21", "23", "19" } };
        System.out.println("Find: " + searchFor);
        System.out.println("Start from: " + homeTown);
        System.out.println("Go to: " + destination);
        System.out.println("Location: " + Arrays.toString(coordinate));
        System.out.println("Last: " + time + " days.");
        System.out.println("Members and Ages: " + Arrays.deepToString(info));
        System.out.println("----Bluvia arrives at the hospital and meets Nora. " +
                "She chases her to the corner in the basement and interrogates her.----");
        System.out.println("Bluvia to Nora: \"Where's Judo?\".");
        System.out.println("Nora: \"No, I won't give up on my friend\".");
        System.out.println("Bluvia's calmness gradually fades away.");
        System.out.print("Bluvia grabs a water pipe nearby and ruthlessly ");
        Scanner interaction = new Scanner(System.in);
        String action = interaction.nextLine().trim();
        System.out.println("Nora's blood splattered all over.");
        System.out.println("----End scene----");
        System.out.println("Still Bluey traumatizes about the pipe which she " + action);
     }
}