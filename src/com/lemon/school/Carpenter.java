package com.lemon.school;

public class Carpenter extends Worker {

    private double lumberCosts;


    public Carpenter(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    public void setLumberCosts(double lumberCosts) {
        this.lumberCosts = lumberCosts;
    }

    public String doWork() {
        return "Nailing it!";
    }

    public double calculatePay() {
        return super.calculatePay() + lumberCosts;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + doWork();
    }
}
