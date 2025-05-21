package com.henrizz;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Your Principal: ");
        float principal = input.nextFloat();
        System.out.print("The annual interest rate: ");
        float annualinterest1 = input.nextFloat();
        System.out.print("Your Period (Years): ");
        byte period = input.nextByte();

        float annualinterest2 = annualinterest1 / 100;
        float monthlyinterest = annualinterest2 / 12;
        double mortgage0 = Math.pow(1 + monthlyinterest, period * 12);
        double mortgage1 = monthlyinterest * mortgage0;
        double mortgage2 = mortgage0 - 1;
        double mortgage3 = principal * (mortgage1 / mortgage2);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(mortgage3);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String annualinterest = percent.format(annualinterest2);

        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualinterest);
        System.out.println("Period (Years): " + period);
        System.out.println("Mortgage: " + mortgage);

     }
}