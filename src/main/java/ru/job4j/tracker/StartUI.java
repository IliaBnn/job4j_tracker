package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("Task1");
        tracker.add(item);
        System.out.println(tracker.findById(1).getName());
    }
}
