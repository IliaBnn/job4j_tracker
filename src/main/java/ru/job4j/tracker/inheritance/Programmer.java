package ru.job4j.tracker.inheritance;

public class Programmer extends Engineer{

    private String position;

    public String getPosition() {
        return position;
    }

    public Test makeTests() {
        return new Test();
    }

    public Refactoring makeRefactoring() {
        return new Refactoring();
    }
}
