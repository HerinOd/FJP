package com.henrizz_java;

public class Contractor implements IPayable{
    private final String name;
    private final double hourlyRate;
    private final int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getName() {
        return name;
    }

}
