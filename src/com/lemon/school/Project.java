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

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
        this.totalCost = 0;
        for (Worker worker : this.getWorkerList()) {
            this.totalCost += worker.calculatePay();
        }
        return this.totalCost;
    }

    public void setOverhead(double overheadPercent) {
        this.overheadPercent = overheadPercent;
    }

    public double calculateProjectCosts() {
        this.projectCosts = 0;
        this.projectCosts = this.getTotalCost();
        this.projectCosts += (this.projectCosts / 100 * this.getOverhead());
        return this.projectCosts;
    }


    public void printProjectReport() {
        System.out.println("=============================================== PROJECT REPORT START ===============================================");
        System.out.println(
                "Project Name: "
                        + this.getName()
                        + "\nCustomer: " + this.getCustomer()
                        + "\nAddress: " + this.getProjectAddress().getStreet1()
                        + ", " + this.getProjectAddress().getZip() + " " + this.getProjectAddress().getCity()
                        + "\nTotal project price: " + this.calculateProjectCosts()
                        + " kr\n--------------------------------------------------------------------------------------------------------"
        );

        for(Worker worker: this.workerList) {
            System.out.println(
                    "[Worker: " + worker.getFirstName() + " " + worker.getLastName()+ " (ID: " + worker.getIdNumber()+ ")"
                            + " Hours worked: " + worker.getHoursWorked() + " hours"
                            + " | Rate: " + worker.getHourlyRate() + " kr"
                            + " | Materials: " + worker.getMaterialCost() + " kr"
                            + " | Wage: " + "(Calculation: " + worker.getHoursWorked() + " * " + worker.getHourlyRate() + " = " + (worker.getHoursWorked() * worker.getHourlyRate()) + "kr)"
                            + " | Total worker cost: " + worker.calculatePay() + "kr ]");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------"
                            + "\nTotal cost for workers: " + this.getTotalCost() + "kr"
                            + "\nTotal Profit (" + this.getOverhead() +"%): " + ( this.calculateProjectCosts() - this.getTotalCost()) + "kr");

        System.out.println("================================================ PROJECT REPORT END ================================================\n\n\n");
    }

    
    @Override
    public int compareTo(Project p) {
        return this.startDate.compareTo(p.startDate);
    }

}
