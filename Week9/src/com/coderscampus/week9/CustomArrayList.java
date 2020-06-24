package com.coderscampus.week9;

public class CustomArrayList<T> implements CustomList<T>{
    Object[] items = new Object[10];
    int size = 0;

    @Override
    public boolean add(T item) {
        items[size++] = item;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        return (T) items[index];
    }
}