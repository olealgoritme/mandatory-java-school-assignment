package com.lemon.school;

public class Plumber extends Worker {


    public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }

    @Override
    public double getMaterialCost() {
        return super.getMaterialCost();
    }

    public void setPlumbingCosts(double plumbingCosts) {
        super.setMaterialCost(plumbingCosts);
    }

    public String doWork() {
        return "Getting wet by exploding pipes";
    }

    public double calculatePay() {
        return super.calculatePay() + super.getMaterialCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + doWork();
    }
}
