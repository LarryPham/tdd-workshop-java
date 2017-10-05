package org.braddle.tddworkshop.set;


import java.util.Arrays;

public class Set {

    private boolean empty;
    private int size;
    private String[] values;

    public Set() {
        empty = true;
        size = 0;
        values = new String[10];
    }

    public Set(int limit) {
        empty = true;
        size = 0;
        values = new String[limit];
    }

    public boolean isEmpty() {
        return empty;
    }

    public void add(String value) {
        if (size == values.length) {
            values = Arrays.copyOf(values, values.length +1);

        }

        for (int i = 0; i < size; i++) {
            if (values[i] == value) {
                return;
            }
        }

        values[size] = value;
        empty = false;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean contains(String value) {
        for (int i = 0; i < size; i++) {
            if (values[i] == value) {
                return true;
            }
        }

        return false;
    }

    public void remove(String value) {
        for (int i = 0; i < size; i++) {
            if (values[i] == value) {
                values[i] = values[size - 1];
                values[size] = null;

                size--;

                if (size == 0) {
                    empty = true;
                }
            }
        }
    }
}
