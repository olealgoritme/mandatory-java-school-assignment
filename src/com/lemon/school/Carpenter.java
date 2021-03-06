package com.lemon.school;

public class Carpenter extends Worker {


    public Carpenter(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }


    @Override
    public double getMaterialCost() {
        return super.getMaterialCost();
    }

    public void setLumberCosts(double lumberCosts) {
        super.setMaterialCost(lumberCosts);
    }

    public String doWork() {
        return "Nailing it!";
    }

    public double calculatePay() {
        return super.calculatePay() + super.getMaterialCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + doWork();
    }
}
