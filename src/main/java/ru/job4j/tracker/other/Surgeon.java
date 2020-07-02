package ru.job4j.tracker.other;

public class Surgeon extends Doctor {

    private String typeOfSurgeon;

    public String getTypeOfSurgeon() {
        return typeOfSurgeon;
    }

    public Surgery makeSurgery() {
        return new Surgery();
    }
}
