package com.lemon.school;

import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Comparable<Project> {

    private String projectName;
    private String customer;
    private Address projectAddress;
    private double overheadPercent;
    private double totalCost;
    private double projectCosts;
    private LocalDate startDate, endDate;
    private ArrayList<Worker> workerList;

    public Project(String projectName, String customer, Address projectAddress, double overheadPercent, LocalDate startDate, LocalDate endDate) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.overheadPercent = overheadPercent;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Project(String projectName, String customer, Address projectAddress) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
    }

    public ArrayList<Worker> getWorkerList() {
        return this.workerList;
    }

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }

    public String getName() {
        return this.projectName;
    }

    public double getOverhead() {
        return this.overheadPercent;
    }

    public Address getProjectAddress() {
        return this.projectAddress;
    }

    public String getCustomer() {
        return this.customer;
    }

    public double getTotalCost() {
        totalCost = 0;
        for (Worker worker : workerList) {
            totalCost += worker.calculatePay();
        }
        return totalCost;
    }

    public void setOverhead(double overheadPercent) {
        this.overheadPercent = overheadPercent;
    }

    public double calculateProjectCosts() {
        projectCosts = 0;
        projectCosts = getTotalCost();
        projectCosts += (projectCosts / 100 * overheadPercent) + projectCosts;
        return projectCosts;
    }

    public void printWorkerReport() {
        System.out.println("\n======================== WORKER REPORT ========================");
        for(Worker worker: this.workerList) {
            System.out.println(
                    "Worker: " + worker.firstName + " " + worker.lastName + " (ID: " + worker.idNumber + ")"
                            + "\nHours worked: " + worker.hoursWorked + " hours"
                            + "\nHourly rate: " + worker.hourlyRate + " kr"
                            + "\nMaterials: " + (worker.calculatePay() - (worker.hoursWorked * worker.hourlyRate))
                            + "\nWorker wage: " + "( Calculation: " + worker.hoursWorked + " * " + worker.hourlyRate + " = " + (worker.hoursWorked * worker.hourlyRate) + "kr )"
                            + "\nTotal worker cost: " + worker.calculatePay() + "kr");
        }
        System.out.println("\nTotal cost for all workers: " + this.getTotalCost() + "kr");
        System.out.println("======================== WORKER REPORT END ========================");
    }

    public void printProjectReport() {
        System.out.println("\n======================== PROJECT REPORT ========================");
        System.out.println(
                "Project: "
                        + this.projectName
                        + "\nCustomer: " + this.customer
                        + "\nAddress: " + this.projectAddress.getStreet1()
                        + ", " + this.projectAddress.getZip() + " " + this.projectAddress.getCity()
                        + "\nTotal project cost: "
                        + this.calculateProjectCosts() + " kr"
        );
        System.out.println("======================== PROJECT REPORT END ========================");
    }

    
    @Override
    public int compareTo(Project p) {
        return this.startDate.compareTo(p.startDate);
    }

    // Not exactly a useful return type, so adding another public
    // function that makes more sense.
    public boolean isBefore(Project p) {
        return this.startDate.compareTo(p.endDate);
    }
}
