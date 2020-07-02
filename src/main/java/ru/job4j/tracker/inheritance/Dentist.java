package ru.job4j.tracker.inheritance;

public class Dentist extends Doctor {

    private String clinic;

    public String getClinic() {
        return clinic;
    }

    public Tooth removeTooth() {
        return new Tooth();
    }

    public Seal makeSeal(){
        return new Seal();
    }
}
