package com.henrizz;

public class Manager extends Employee{
    private final double baseSalary;
    private final double bonus;

    public Manager(String id, String name, double baseSalary, double bonus) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

}
