package ru.job4j.tracker.inheritance;

public class Builder extends Engineer{

    private String typeOfBuilder;

    public String getTypeOfBuilder() {
        return typeOfBuilder;
    }

    public ProjectOfHouse makeProjectOfHouse() {
        return new ProjectOfHouse();
    }
}
