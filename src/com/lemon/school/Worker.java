package com.lemon.school;

public class Worker {

    public String firstName;
    public String lastName;
    public Address address;
    public int idNumber;
    public double hoursWorked;
    public double hourlyRate;
    public double materialCost;


    public Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getMaterialCost() {
        return this.materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public String doWork() {
        return "Working hard!";
    }

    public double calculatePay() {
        return (this.getHourlyRate() * this.getHoursWorked());
    }


    @Override
    public String toString() {
        return  firstName
                + " "
                + lastName
                + "\n"
                + "GetsPaid='"
                + calculatePay();
    }
}
