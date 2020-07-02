package ru.job4j.tracker.inheritance;

public class Surgeon extends Doctor {

    private String typeOfSurgeon;

    public String getTypeOfSurgeon() {
        return typeOfSurgeon;
    }

    public Surgery makeSurgery() {
        return new Surgery();
    }
}
