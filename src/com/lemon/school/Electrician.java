package com.lemon.school;

public class Electrician extends Worker {


    public Electrician(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }


    @Override
    public double getMaterialCost() {
        return super.getMaterialCost();
    }

    public void setWiringCosts(double wiringCosts) {
        super.setMaterialCost(wiringCosts);
    }

    public String doWork() {
        return "Getting lit by electrical cables";
    }

    public double calculatePay() {
        return super.calculatePay() + super.materialCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + doWork();
    }
}