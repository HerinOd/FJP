package com.henrizz;

public class RegularEmployee extends Employee{
    private final double salary;

    public RegularEmployee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

}
