package org.fasttrackit.course7.homework.advertisement;

// the most basic program for the advertising exercise
public class AdvertiseMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Avantu' Fericirea");
        company.setAdvertiseService(new Facebook());
        System.out.println("Company " + company.getName() + " "
                + company.getAdvertiseService().displayAdvertiseMethod());
        System.out.println(company);
        System.out.println("************");

        company.setAdvertiseService(new Email());
        System.out.println("Company " + company.getName() + " "
                + company.getAdvertiseService().displayAdvertiseMethod());
        System.out.println(company);
        System.out.println("************");

        company.setAdvertiseService(new Print());
        System.out.println("Company " + company.getName() + " "
                + company.getAdvertiseService().displayAdvertiseMethod());
        System.out.println(company);
        System.out.println("*************************");

    }
}
