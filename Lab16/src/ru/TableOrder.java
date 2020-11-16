package ru;


import java.util.Arrays;

public class TableOrder implements Order {
    private Customer customer;
    private int size;
    private MenuItem[] items = new MenuItem[10];

    @Override
    public boolean add(MenuItem item) {
        try {
            if (size >= items.length) {
                MenuItem[] temp = items.clone();
                items = new MenuItem[size * 2];
                System.arraycopy(temp, 0, items, 0, temp.length);
            }
            items[size] = item;
            size++;
        } catch (Exception e) {
            System.out.println("Adding error: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[items.length];
        for (int i = 0; i < items.length;i++ ) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (MenuItem item : items) {
            if (item.getName().equals(itemName)) count++;
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return itemQuantity(item.getName());
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean removed = false;
        if (size >= 1 ) {
            for (int i = 0; i < items.length; i++) {
                if (items[i].getName().equals(itemName)) {
                    MenuItem[] temp = items.clone();
                    items = new MenuItem[items.length];
                    System.arraycopy(temp,0,items,0,i);
                    System.arraycopy(temp,i+1,items,i,temp.length-i-1);
                    items[items.length-1] = null;
                    removed = true;
                    break;
                }
            }

        }
        return removed;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                count++;
            }
        }
        MenuItem[] newItems = new MenuItem[items.length];
        int index = 0;
        for (MenuItem item : items) {
            if (item != null) {
                newItems[index] = item;
                index++;
            }
        }
        items = newItems;
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
       return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        Arrays.sort(items, (el1, el2) -> {
            double c = el2.getCost() - el1.getCost();
            return (c == 0) ? 0 : (int) c;
        });
        return items;
    }

    @Override
    public int costTotal() {
        return Arrays.stream(getItems())
                .mapToInt(MenuItem::getCost)
                .sum();
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
