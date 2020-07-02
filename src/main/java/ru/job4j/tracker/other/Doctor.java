package ru.job4j.tracker.other;

public class Doctor {

    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public Diagnos heal() {
        return new Diagnos();
    }
}
