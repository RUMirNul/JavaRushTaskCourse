package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.StorageStrategy;

public class Shortener {
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    private Long lastId = Long.valueOf(0);

    public synchronized Long getId(String string) {
        if (!storageStrategy.containsValue(string)) {
            lastId++;
            storageStrategy.put(lastId, string);
        }
        return storageStrategy.getKey(string);
    }

    public synchronized String getString(Long id) {
            return storageStrategy.getValue(id);

    }
}
