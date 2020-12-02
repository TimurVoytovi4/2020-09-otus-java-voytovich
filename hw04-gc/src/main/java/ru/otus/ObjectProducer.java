package ru.otus;

import java.util.LinkedList;

public class ObjectProducer {
    private int counter;

    public ObjectProducer(int counter) {
        this.counter = counter;
    }

    public void run() throws InterruptedException {
        var objects = new LinkedList<>();
        for (int i = 0; i < counter; i++) {
            Thread.sleep(100);
            objects.add(new byte[1024 * 1024]);
            if (i != 0 && i % 100 == 0) {
                objects.subList(i / 3, objects.size() - 1).clear();
            }
        }
    }
}