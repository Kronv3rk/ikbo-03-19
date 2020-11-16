package ru;

import java.util.Arrays;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode queueNode = tail;
        do {
            count += queueNode.getValue().itemQuantity(itemName);
            queueNode = queueNode.getNext();
        } while (queueNode != tail);
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        int index = 0;
        QueueNode queueNode = tail;
        do {
            orders[index] = queueNode.getValue();
            index++;
            queueNode = queueNode.getNext();
        } while (!queueNode.equals(tail));
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders())
                .mapToInt(Order::costTotal)
                .sum();
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    public boolean add(Order order) {
        try {
            if (head == null) {
                head = new QueueNode();
                tail = new QueueNode();
                head.setValue(order);
                head.setNext(tail);
                tail.setNext(head);
            } else {
                QueueNode node = new QueueNode();
                node.setValue(order);
                node.setNext(tail);
                head.setNext(node);
            }
            size++;
        } catch (Exception e) {
            System.out.println("Adding error: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean remove(Order order) {
        QueueNode node = tail;
        do {
            if (node.getValue().equals(order)) {
                node.setPrev(node.getNext());
                node.getNext().setPrev(node.getPrev());
                size--;
                return true;
            }
            node = node.getNext();
        } while (node != tail);
        return false;
    }
}
