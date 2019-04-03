package com.lemon.school;

import java.time.LocalDate;
import java.util.ArrayList;
import com.lemon.school.*;


public class ContractorTest {


    public static void main(String[] args) {

        // Worker variables
        ArrayList<Worker> workerList;
        Electrician electrician;
        Plumber plumber;
        Carpenter carpenter;

        // Address/date variables
        Address address;
        LocalDate startDate;
        LocalDate endDate;

        // Projects
        ArrayList<Project> projects = new ArrayList<>();
        Project houseProject;
        Project motionLightProject;

        /* WORKERS START */
        // Electrician
        address = new Address ("Electro road 11", "Krakow", "Krakow State", "341421");
        electrician = new Electrician("Pazko", "Plama", address, 50, 0, 220);

        // Plumber
        address = new Address ("Plumber road 31", "Krakow", "Krakow State", "3414121");
        plumber = new Plumber("Niez", "Puszka", address, 51, 0, 250);

        address = new Address ("Plumber road 17", "Apartment 502, 2nd floor", "Krakow", "Krakow State", "3414121");
        carpenter = new Carpenter("Mitza", "Lumpa", address, 52, 0, 230);
        /* WORKERS END */



        /* HOUSING PROJECT START */
        // Housing Project details
        address = new Address("Veiveien 1", "Oslo", "Oslo", "0352");
        startDate = LocalDate.parse("2019-05-03");
        endDate = LocalDate.parse("2019-11-03");
        houseProject = new Project("House Project", "Jens Hansen", address, 18, startDate, endDate);

        // Housing Project - Workers
        electrician.setHoursWorked(65);
        electrician.setWiringCosts(30000);
        plumber.setHoursWorked(102);
        plumber.setPlumbingCosts(25000);
        carpenter.setHoursWorked(75);
        carpenter.setLumberCosts(19500);

        workerList = new ArrayList<>();
        workerList.add(electrician);
        workerList.add(plumber);
        workerList.add(carpenter);
        houseProject.setWorkerList(workerList);

        /* PRINT REPORT */
        // See detailed project / worker report for Housing Project
        houseProject.printProjectReport();
        /* HOUSING PROJECT END */


        /* OUTDOOR PROJECT START */
        // Outdoor Motion Lighting Project - Details
        address = new Address("Snurresprettgata 141", "Oslo", "Oslo", "0141");
        startDate = LocalDate.parse("2019-11-11");
        endDate = LocalDate.parse("2019-12-22");
        motionLightProject = new Project("Outdoor Motion Lighting", "Helge Svingen", address, 25, startDate, endDate);

        // Outdoor Motion Lighting Project - Workers
        electrician.setHoursWorked(25);
        electrician.setWiringCosts(8500);
        plumber.setHoursWorked(5);
        plumber.setPlumbingCosts(4500);

        // Outdoor Motion Lighting Project - Worker list
        workerList = new ArrayList<>();
        workerList.add(electrician);
        workerList.add(plumber);
        motionLightProject.setWorkerList(workerList);
        motionLightProject.setOverhead(25);

        /* PRINT REPORT */
        // See detailed project / worker report of Outdoor Motion Lighting Project
        motionLightProject.printProjectReport();


        // Project start comparison
        if(houseProject.getStartDate().compareTo(motionLightProject.getStartDate()) > 0) {
            System.out.println("compareTo: HouseProject starts before Outdoor Motion Lighting project");
        }

    }
}
