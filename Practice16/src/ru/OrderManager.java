package ru;

import java.util.Arrays;
import java.util.Comparator;

public class OrderManager implements Order {
    private CircularLinkedList<Item> data;

    public OrderManager() {
        this.data = new CircularLinkedList<>();
    }
    @Override
    public boolean add(Item item) {
        return data.add(item);
    }
    @Override
    public boolean delete(String name) {
        Item item = Arrays.stream(data.toArray()).filter(i -> i.getName().equals(name)).findFirst().orElse(null);
        if (item == null)
            return false;
        return data.remove(item);
    }
    @Override
    public int deleteAll(String name) {
        return (int) Arrays.stream(data.toArray()).filter(i -> i.getName().equals(name)).map(el -> data.remove(el)).count();
    }
    @Override
    public int numOfOrders() {
        return data.getSize();
    }
    @Override
    public Object[] getArray() {
        return data.toArray();
    }
    @Override
    public double getSumPrice() {
        double sum = 0;
        Item[] arr = (Item[]) data.toArray();
        for (int i = 0;i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }
    @Override
    public Object[] getArrayOfNames() {
        return  Arrays.stream(data.toArray()).map(Item::getName).toArray();
    }
    @Override
    public Object[] getSortedArray() {
        Item[] arr = data.toArray();
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        return arr;
    }

}


