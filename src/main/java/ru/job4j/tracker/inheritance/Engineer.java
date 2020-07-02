package ru.job4j.tracker.inheritance;

public class Engineer extends Profession {

    private String company;

    public String getCompany() {
        return company;
    }

    public Project create() {
        return new Project();
    }
}
