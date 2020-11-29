package ru;

import java.util.Arrays;

public class InternetOrder implements Order {
    private Customer customer;
    private int size;
    private ListNode head;
    private ListNode tail;

    @Override
    public boolean add(MenuItem item) {
        try {
            if (head == null) {
                head = new ListNode();
                tail = new ListNode();
                head.setValue(item);
                head.setNext(tail);
                tail.setNext(head);
            }
            else {
                ListNode node = new ListNode();
                tail.setNext(node);
                node.setValue(item);
                tail = node;
            }
            size++;
        }
        catch (Exception e){
            System.out.println("Adding error: " + e.getMessage());
            return false;
        }
        return true;

    }

    @Override
    public String[] itemsNames() {
        ListNode node;
        String[] names = new String[size];
        node = head;
        int i = 0;
        while(node != tail) {
            names[i] = node.value.getName();
            i++;
            node = node.getNext();
        }
        names[size-1] = tail.value.getName();
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode node;
        node = tail;
        do {
            if(node.value.getName().equals(itemName)) count++;
            node = node.getNext();

        }while(node != tail);
        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return itemQuantity(item.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode node = tail;
        int i = 0;
        do {
            items[i] = node.value;
            i++;
            node = node.getNext();
        }while(node != tail);
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = tail;
        do {
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                return true;
            }
            node = node.getNext();
        }while(node != tail);
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        ListNode node = tail;
        int count = 0;
        do {
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                count++;
            }
            node = node.getNext();
        }while(node != tail);
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
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
