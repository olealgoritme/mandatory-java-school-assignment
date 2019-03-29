package com.lemon.school;

public class Worker {

    private String firstName;
    private String lastName;
    private Address address;
    private int idNumber;
    private double hoursWorked;
    private double hourlyRate;


    public Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String doWork() {
        return "Working hard!";
    }

    public double calculatePay() {
        return (this.hourlyRate * this.hoursWorked);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
