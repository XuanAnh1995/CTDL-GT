package com.luuviet;

import java.text.Format;
import java.text.MessageFormat;

public class Dictionary <K, V>{

    private K key;

    private V value;

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void showString() {
        String result = MessageFormat.format("Key = {0}, Value = {1}", key, value);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}
