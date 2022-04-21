package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        int count = 0;
        for (List<V> valuesList: map.values()) {
            for (V value : valuesList) {
                count++;
            }
        }
        return count;
    }

    @Override
    public V put(K key, V value) {
        V returnedValue = null;
        if (map.containsKey(key)) {
            List<V> values = map.get(key);
            returnedValue = values.get(values.size() - 1);
            if (values.size() < repeatCount) {
                values.add(value);
            } else if (values.size() == repeatCount) {
                values.remove(0);
                values.add(value);
            }
        }
        if (!map.containsKey(key)) {
            ArrayList<V> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
        return returnedValue;
    }

    @Override
    public V remove(Object key) {
        V deletedValue = null;
        if (map.containsKey(key)) {
            List<V> list = map.get(key);
            if (list.size() != 0) {
                deletedValue = list.remove(0);
            }
            if (list.size() == 0) {
                map.remove(key);
            }
        }
        return deletedValue;
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> list = new ArrayList<>();
        for (K key : map.keySet()) {
            for (V value : map.get(key)) {
                list.add(value);
            }
        }
        return list;
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}