package ru;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyAbstractQueue queue = new MyArrayQueue();
        queue.add(12);
        queue.add(34);
        queue.add(56);
        System.out.println(queue);
        System.out.println("element: " + queue.element());
        System.out.println(queue);
        System.out.println("peek: " + queue.peek());
        System.out.println(queue);
        System.out.println("poll: " + queue.poll());
        System.out.println(queue + "\n");

        queue = new MyLinkedQueue();
        queue.add(123);
        queue.add(456);
        queue.add(789);
        System.out.println(queue);
        System.out.println("element: " + queue.element());
        System.out.println(queue);
        System.out.println("peek: " + queue.peek());
        System.out.println(queue);
        System.out.println("poll: " + queue.poll());
        System.out.println(queue);
    }
}
