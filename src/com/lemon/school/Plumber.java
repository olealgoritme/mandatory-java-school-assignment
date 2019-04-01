package com.lemon.school;

public class Plumber extends Worker {

    private double plumbingCosts;


    public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }


    public void setPlumbingCosts(double plumbingCosts) {
        this.plumbingCosts = plumbingCosts;
    }

    public String doWork() {
        return "Getting wet by exploding pipes";
    }

    public double calculatePay() {
        return super.calculatePay() + plumbingCosts;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + doWork();
    }
}
