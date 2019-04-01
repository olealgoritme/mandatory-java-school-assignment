package com.lemon.school;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContractorTest {

    // Workers
    private static ArrayList<Worker> workerList;
    private static Electrician electrician;
    private static Plumber plumber;
    private static Carpenter carpenter;

    // Reusable address pointer
    private static Address address;

    public static void main(String[] args) {

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
        LocalDate startDate = LocalDate.parse("2019-05-03");
        LocalDate endDate = LocalDate.parse("2020-11-03");
        Project houseProject = new Project("House Project", "Jens Hansen", address, 18, startDate, endDate);

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

        /* HOUSING PROJECT END */



        /* OUTDOOR PROJECT START */

        // Outdoor Motion Lighting Project - Details
        address = new Address("Snurresprettgata 141", "Oslo", "Oslo", "0141");
        Project outdoorLights = new Project("Outdoor Motion Lighting", "Helge Svingen", address);


        // Outdoor Motion Lighting Project - Workers
        electrician.setHoursWorked(25);
        electrician.setWiringCosts(8500);
        plumber.setHoursWorked(5);
        plumber.setPlumbingCosts(4500);

        workerList = new ArrayList<>();
        workerList.add(electrician);
        workerList.add(plumber);
        outdoorLights.setWorkerList(workerList);
        outdoorLights.setOverhead(25);

        /* OUTDOOR PROJECT END */



        /* REPORTS START */

        // See detailed project / worker report for Housing Project
        houseProject.printProjectReport();
        houseProject.printWorkerReport();

        // See detailed project / worker report of Outdoor Motion Lighting Project
        outdoorLights.printProjectReport();
        outdoorLights.printWorkerReport();

        /* REPORTS END */
    }
}
