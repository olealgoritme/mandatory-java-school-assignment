package com.lemon.school;

public class Electrician extends Worker {

    private double wiringCosts;


    public Electrician(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate);
    }


    public void setWiringCosts(double wiringCosts) {
        this.wiringCosts = wiringCosts;
    }

    public String doWork() {
        return "Getting lit by electrical cables";
    }

    public double calculatePay() {
        return (this.hourlyRate * this.hoursWorked) + wiringCosts;
    }

    @Override
    public String toString() {
        return " Electrician{" +
                "wiringCosts=" + wiringCosts +
                '}';
    }
}