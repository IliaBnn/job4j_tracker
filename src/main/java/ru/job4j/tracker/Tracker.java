package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] != null) {
                itemsWithoutNull[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (items[i].getName().equals(key)) {
                itemsWithoutNull[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        item.setId(items[index].getId());
        items[index] = item;
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        System.arraycopy(items, index + 1, items, index, ids - index);
        items[ids - 1] = null;
        ids--;
        return true;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < ids; i++) {
            if(items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}